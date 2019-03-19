package com.cim.cimConfig.controller;

import com.cim.cimConfig.domain.PortAttributesDO;
import com.cim.cimConfig.service.PortAttributesService;
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
@RequestMapping("/cimConfig/portAttributes")
public class PortAttributesController {
    @Autowired
    private PortAttributesService portAttributesService;

    @GetMapping()
//    @RequiresPermissions("basestation:activeInfo:activeInfo")
    String PortAttributes() {
        return "/cimConfig/portAttributes/portAttributes";
    }

    @ResponseBody
    @GetMapping("/list")
//    @RequiresPermissions("basestation:activeInfo:activeInfo")
    public PageUtils list(@RequestParam Map<String, Object> params) {
        //查询列表数据
        Query query = new Query(params);
        List<PortAttributesDO> portAttributesList = portAttributesService.list(query);
        int total = portAttributesService.count(query);
        PageUtils pageUtils = new PageUtils(portAttributesList, total);
        return pageUtils;
    }

    @GetMapping("/add")
//    @RequiresPermissions("basestation:activeInfo:add")
    String add() {
        return "/cimConfig/portAttributes/add";
    }

    @GetMapping("/edit/{serial}")
//    @RequiresPermissions("basestation:activeInfo:edit")
    String edit(@PathVariable("serial") Integer serial, Model model) {
        PortAttributesDO portAttributes = portAttributesService.get(serial);
        model.addAttribute("portAttributes", portAttributes);
        return "/cimConfig/portAttributes/edit";
    }

    /**
     * 保存
     */
    @ResponseBody
    @PostMapping("/save")
//    @RequiresPermissions("basestation:activeInfo:add")
    public R save(PortAttributesDO portAttributes) {
        if (portAttributesService.save(portAttributes) > 0) {
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
    public R update(PortAttributesDO portAttributes) {
        portAttributesService.update(portAttributes);
        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/remove")
    @ResponseBody
//    @RequiresPermissions("basestation:activeInfo:remove")
    public R remove(Integer serial) {
        if (portAttributesService.remove(serial) > 0) {
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
        portAttributesService.batchRemove(serials);
        return R.ok();
    }

    @PostMapping("/importExcel")
    @ResponseBody
    public R importExcel(@RequestParam("file") MultipartFile file) {
        try {
            List<Object> list = ExcelImportUtil.importExcel(file.getInputStream(),PortAttributesDO.class);
            for (Object portAttributes : list) {
                save((PortAttributesDO) portAttributes);
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
                List<PortAttributesDO> portAttributesDO = portAttributesService.list(query);
                MyExcelExportUtil.exportToFile(portAttributesDO, out);
            }
            //导出全部数据
            if (type.equals("2")) {
                List<PortAttributesDO> portAttributesDO = portAttributesService.list(null);
                MyExcelExportUtil.exportToFile(portAttributesDO, out);
            }
            //导出符合条件的全部数据
            /*if (type.equals("3")) {
                query.remove("offset");
                query.remove("limit");
                List<AntennaAttributesDO> AntennaAttributesDO = portAttributesService.list(query);
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
