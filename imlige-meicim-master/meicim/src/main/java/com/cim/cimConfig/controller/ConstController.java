package com.cim.cimConfig.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.cim.utils.MyExcelExportUtil;
import com.xuxueli.poi.excel.ExcelImportUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cim.cimConfig.domain.ConstDO;
import com.cim.cimConfig.service.ConstService;
import com.cim.utils.PageUtils;
import com.cim.utils.Query;
import com.cim.utils.R;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/cimConfig/const")
public class ConstController {
    @Autowired
    private ConstService constService;

    @GetMapping()
//    @RequiresPermissions("basestation:activeInfo:activeInfo")
    String Const() {
        return "/cimConfig/const/const";
    }

    @PostMapping("/importExcel")
    @ResponseBody
    public R importExcel(@RequestParam("file") MultipartFile file) {
        try {
            List<Object> list = ExcelImportUtil.importExcel(file.getInputStream(),ConstDO.class);
            for (Object const1 : list) {
                save((ConstDO) const1);
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
                List<ConstDO> constDOS = constService.list(query);
                MyExcelExportUtil.exportToFile(constDOS, out);
            }
            //导出全部数据
            if (type.equals("2")) {
                List<ConstDO> constDOS = constService.list(null);
                MyExcelExportUtil.exportToFile(constDOS, out);
            }
            //导出符合条件的全部数据
            /*if (type.equals("3")) {
                query.remove("offset");
                query.remove("limit");
                List<AntennaAttributesDO> AntennaAttributesDO = antennaAttributesService.list(query);
                MyExcelExportUtil.exportToFile(AntennaAttributesDO, out);
            }*/
        } catch (Exception e) {
            e.printStackTrace();
//            logger.info("exportExcel出错"+e.getMessage());
        } finally {
            out.close();
        }
    }

    @ResponseBody
    @GetMapping("/list")
//    @RequiresPermissions("basestation:activeInfo:activeInfo")
    public PageUtils list(@RequestParam Map<String, Object> params) {
        //查询列表数据
        Query query = new Query(params);
        List<ConstDO> constList = constService.list(query);
        int total = constService.count(query);
        PageUtils pageUtils = new PageUtils(constList, total);
        return pageUtils;
    }

    @GetMapping("/add")
//    @RequiresPermissions("basestation:activeInfo:add")
    String add() {
        return "/cimConfig/const/add";
    }

    @GetMapping("/edit/{serial}")
//    @RequiresPermissions("basestation:activeInfo:edit")
    String edit(@PathVariable("serial") Integer serial, Model model) {
    	ConstDO const1 = constService.get(serial);
        model.addAttribute("const", const1);
        return "/cimConfig/const/edit";
    }

    /**
     * 保存
     */
    @ResponseBody
    @PostMapping("/save")
//    @RequiresPermissions("basestation:activeInfo:add")
    public R save(ConstDO const1) {
        if (constService.save(const1) > 0) {
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
    public R update(ConstDO const1) {
        if (constService.update(const1)>0) {
            return R.ok();
        }
        return R.error();
    }

    /**
     * 删除
     */
    @PostMapping("/remove")
    @ResponseBody
//    @RequiresPermissions("basestation:activeInfo:remove")
    public R remove(Integer serial) {
        if (constService.remove(serial) > 0) {
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
    	constService.batchRemove(serials);
        return R.ok();
    }

}
