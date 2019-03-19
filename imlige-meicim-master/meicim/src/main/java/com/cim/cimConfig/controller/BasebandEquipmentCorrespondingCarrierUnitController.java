package com.cim.cimConfig.controller;

import com.cim.cimConfig.domain.BasebandEquipmentCorrespondingCarrierUnitDO;
import com.cim.cimConfig.service.BasebandEquipmentCorrespondingCarrierUnitService;
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
@RequestMapping("/cimConfig/basebandEquipmentCorrespondingCarrierUnit")
public class BasebandEquipmentCorrespondingCarrierUnitController {
    @Autowired
    private BasebandEquipmentCorrespondingCarrierUnitService basebandEquipmentCorrespondingCarrierUnitService;

    @GetMapping()
//    @RequiresPermissions("basestation:activeInfo:activeInfo")
    String BasebandEquipmentCorrespondingCarrierUnit() {
        return "/cimConfig/basebandEquipmentCorrespondingCarrierUnit/basebandEquipmentCorrespondingCarrierUnit";
    }

    @ResponseBody
    @GetMapping("/list")
//    @RequiresPermissions("basestation:activeInfo:activeInfo")
    public PageUtils list(@RequestParam Map<String, Object> params) {
        //查询列表数据
        Query query = new Query(params);
        List<BasebandEquipmentCorrespondingCarrierUnitDO> basebandEquipmentCorrespondingCarrierUnitList = basebandEquipmentCorrespondingCarrierUnitService.list(query);
        int total = basebandEquipmentCorrespondingCarrierUnitService.count(query);
        PageUtils pageUtils = new PageUtils(basebandEquipmentCorrespondingCarrierUnitList, total);
        return pageUtils;
    }

    @GetMapping("/add")
//    @RequiresPermissions("basestation:activeInfo:add")
    String add() {
        return "/cimConfig/basebandEquipmentCorrespondingCarrierUnit/add";
    }

    @GetMapping("/edit/{serial}")
//    @RequiresPermissions("basestation:activeInfo:edit")
    String edit(@PathVariable("serial") Integer serial, Model model) {
        BasebandEquipmentCorrespondingCarrierUnitDO basebandEquipmentCorrespondingCarrierUnit = basebandEquipmentCorrespondingCarrierUnitService.get(serial);
        model.addAttribute("basebandEquipmentCorrespondingCarrierUnit", basebandEquipmentCorrespondingCarrierUnit);
        return "/cimConfig/basebandEquipmentCorrespondingCarrierUnit/edit";
    }

    /**
     * 保存
     */
    @ResponseBody
    @PostMapping("/save")
//    @RequiresPermissions("basestation:activeInfo:add")
    public R save(BasebandEquipmentCorrespondingCarrierUnitDO basebandEquipmentCorrespondingCarrierUnit) {
        if (basebandEquipmentCorrespondingCarrierUnitService.save(basebandEquipmentCorrespondingCarrierUnit) > 0) {
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
    public R update(BasebandEquipmentCorrespondingCarrierUnitDO basebandEquipmentCorrespondingCarrierUnit) {
        basebandEquipmentCorrespondingCarrierUnitService.update(basebandEquipmentCorrespondingCarrierUnit);
        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/remove")
    @ResponseBody
//    @RequiresPermissions("basestation:activeInfo:remove")
    public R remove(Integer serial) {
        if (basebandEquipmentCorrespondingCarrierUnitService.remove(serial) > 0) {
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
        basebandEquipmentCorrespondingCarrierUnitService.batchRemove(serials);
        return R.ok();
    }

    @PostMapping("/importExcel")
    @ResponseBody
    public R importExcel(@RequestParam("file") MultipartFile file) {
        try {
            List<Object> list = ExcelImportUtil.importExcel(file.getInputStream(),BasebandEquipmentCorrespondingCarrierUnitDO.class);
            for (Object basebandEquipmentCorrespondingCarrierUnit : list) {
                save((BasebandEquipmentCorrespondingCarrierUnitDO) basebandEquipmentCorrespondingCarrierUnit);
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
                List<BasebandEquipmentCorrespondingCarrierUnitDO> basebandEquipmentCorrespondingCarrierUnitDO = basebandEquipmentCorrespondingCarrierUnitService.list(query);
                MyExcelExportUtil.exportToFile(basebandEquipmentCorrespondingCarrierUnitDO, out);
            }
            //导出全部数据
            if (type.equals("2")) {
                List<BasebandEquipmentCorrespondingCarrierUnitDO> basebandEquipmentCorrespondingCarrierUnitDO = basebandEquipmentCorrespondingCarrierUnitService.list(null);
                MyExcelExportUtil.exportToFile(basebandEquipmentCorrespondingCarrierUnitDO, out);
            }
            //导出符合条件的全部数据
            /*if (type.equals("3")) {
                query.remove("offset");
                query.remove("limit");
                List<AntennaAttributesDO> AntennaAttributesDO = basebandEquipmentCorrespondingCarrierUnitService.list(query);
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
