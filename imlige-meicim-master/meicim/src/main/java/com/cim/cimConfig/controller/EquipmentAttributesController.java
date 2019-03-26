package com.cim.cimConfig.controller;

import com.cim.cimConfig.domain.EquipmentAttributesDO;
import com.cim.cimConfig.service.EquipmentAttributesService;
import com.cim.utils.MyExcelExportUtil;
import com.cim.utils.PageUtils;
import com.cim.utils.Query;
import com.cim.utils.R;
import com.xuxueli.poi.excel.ExcelImportUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/cimConfig/equipmentAttributes")
public class EquipmentAttributesController {
    @Autowired
    private EquipmentAttributesService equipmentAttributesService;

    @GetMapping()
//    @RequiresPermissions("basestation:activeInfo:activeInfo")
    String EquipmentAttributes() {
        return "/cimConfig/equipmentAttributes/equipmentAttributes";
    }

    @ResponseBody
    @GetMapping("/list")
//    @RequiresPermissions("basestation:activeInfo:activeInfo")
    public PageUtils list(@RequestParam Map<String, Object> params) {
        //查询列表数据
        Query query = new Query(params);
        List<EquipmentAttributesDO> equipmentAttributesList = equipmentAttributesService.list(query);
        int total = equipmentAttributesService.count(query);
        PageUtils pageUtils = new PageUtils(equipmentAttributesList, total);
        return pageUtils;
    }

    @GetMapping("/add")
//    @RequiresPermissions("basestation:activeInfo:add")
    String add() {
        return "/cimConfig/equipmentAttributes/add";
    }

    @GetMapping("/edit/{serial}")
//    @RequiresPermissions("basestation:activeInfo:edit")
    String edit(@PathVariable("serial") Integer serial, Model model) {
        EquipmentAttributesDO equipmentAttributes = equipmentAttributesService.get(serial);
        model.addAttribute("equipmentAttributes", equipmentAttributes);
        return "/cimConfig/equipmentAttributes/edit";
    }

    /**
     * 保存
     */
    @ResponseBody
    @PostMapping("/save")
//    @RequiresPermissions("basestation:activeInfo:add")
    public R save(EquipmentAttributesDO equipmentAttributes) {
        if (equipmentAttributesService.save(equipmentAttributes) > 0) {
            return R.ok();
        }
        return R.error();
    }

    /**
     * 修改
     */
    @ResponseBody
    @PostMapping("/update")
//    @RequiresPermissions("basestation:activeInfo:edit")
    public R update(EquipmentAttributesDO equipmentAttributes) {
        equipmentAttributesService.update(equipmentAttributes);
        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/remove")
    @ResponseBody
//    @RequiresPermissions("basestation:activeInfo:remove")
    public R remove(Integer serial) {
        if (equipmentAttributesService.remove(serial) > 0) {
            return R.ok();
        }
        return R.error();
    }

    /**
     * 删除
     */
    @PostMapping("/batchRemove")
    @ResponseBody
//    @RequiresPermissions("basestation:activeInfo:batchRemove")
    public R remove(@RequestParam("ids[]") Integer[] serials) {
        equipmentAttributesService.batchRemove(serials);
        return R.ok();
    }

    @PostMapping("/importExcel")
    @ResponseBody
    public R importExcel(@RequestParam("file") MultipartFile file) {
        try {
            List<Object> list = ExcelImportUtil.importExcel(file.getInputStream(),EquipmentAttributesDO.class);
            for (Object equipmentAttributes : list) {
                save((EquipmentAttributesDO) equipmentAttributes);
            }
            return R.ok();
        } catch (IOException e) {
            e.printStackTrace();
            return R.error();
        } catch (RuntimeException e) {
            e.printStackTrace();
            return R.error();
        }
    }

    @RequestMapping("/exportExcel")
    public void exportExcel(@RequestParam Map<String, Object> params, HttpServletRequest request, HttpServletResponse response) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String filename = format.format(new Date().getTime()) + ".xls";
        response.setContentType("application/ms-excel;charset=UTF-8");
        response.setHeader("Content-Disposition", "attachment;filename=" + new String(filename.getBytes(), "iso-8859-1"));
        OutputStream out = response.getOutputStream();
        try {
            Query query = new Query(params);
            String type = request.getParameter("type");
            //导出当前页面数据
            if (type.equals("1")) {
                List<EquipmentAttributesDO> equipmentAttributesDO = equipmentAttributesService.list(query);
                MyExcelExportUtil.exportToFile(equipmentAttributesDO, out);
            }
            //导出全部数据
            if (type.equals("2")) {
                List<EquipmentAttributesDO> equipmentAttributesDO = equipmentAttributesService.list(null);
                MyExcelExportUtil.exportToFile(equipmentAttributesDO, out);
            }
            //导出符合条件的全部数据
            /*if (type.equals("3")) {
                query.remove("offset");
                query.remove("limit");
                List<AntennaAttributesDO> AntennaAttributesDO = equipmentAttributesService.list(query);
                MyExcelExportUtil.exportToFile(AntennaAttributesDO, out);
            }*/
        } catch (Exception e) {
            e.printStackTrace();
//            logger.info("exportExcel出错"+e.getMessage());
        } finally {
            out.close();
        }
    }
}
