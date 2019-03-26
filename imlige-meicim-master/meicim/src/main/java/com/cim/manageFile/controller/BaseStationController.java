package com.cim.manageFile.controller;

import com.cim.manageFile.domain.BaseStationDO;
import com.cim.manageFile.service.BaseStationService;
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
@RequestMapping("/manageFile/baseStation")
public class BaseStationController {
    @Autowired
    private BaseStationService baseStationService;

    @GetMapping()
//    @RequiresPermissions("basestation:activeInfo:activeInfo")
    String ManageFile() {
        return "/manageFile/baseStation";
    }

    @ResponseBody
    @GetMapping("/list")
//    @RequiresPermissions("basestation:activeInfo:activeInfo")
    public PageUtils list(@RequestParam Map<String, Object> params) {
        //查询列表数据
        Query query = new Query(params);
        List<BaseStationDO> baseStationList = baseStationService.list(query);
        int total = baseStationService.count(query);
        PageUtils pageUtils = new PageUtils(baseStationList, total);
        return pageUtils;
    }

    @GetMapping("/add")
//    @RequiresPermissions("basestation:activeInfo:add")
    String add() {
        return "/manageFile/add";
    }

    @GetMapping("/edit/{index}")
//    @RequiresPermissions("basestation:activeInfo:edit")
    String edit(@PathVariable("index") Integer index, Model model) {
        BaseStationDO baseStation = baseStationService.get(index);
        model.addAttribute("baseStation", baseStation);
        return "/manageFile/edit";
    }

    /**
     * 保存
     */
    @ResponseBody
    @PostMapping("/save")
//    @RequiresPermissions("basestation:activeInfo:add")
    public R save(BaseStationDO baseStation) {
        if (baseStationService.save(baseStation) > 0) {
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
    public R update(BaseStationDO baseStation) {
        if (baseStationService.update(baseStation) > 0) {
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
    public R remove(Integer index) {
        if (baseStationService.remove(index) > 0) {
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
    public R remove(@RequestParam("ids[]") Integer[] indexs) {
        baseStationService.batchRemove(indexs);
        return R.ok();
    }


    @PostMapping("/importExcel")
    @ResponseBody
    public R importExcel(@RequestParam("file") MultipartFile file) {
        try {
            List<Object> list = ExcelImportUtil.importExcel(file.getInputStream(),BaseStationDO.class);
            for (Object baseStation : list) {
                save((BaseStationDO) baseStation);
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
                List<BaseStationDO> baseStationDOS = baseStationService.list(query);
                MyExcelExportUtil.exportToFile(baseStationDOS, out);
            }
            //导出全部数据
            if (type.equals("2")) {
                List<BaseStationDO> baseStationDOS = baseStationService.list(null);
                MyExcelExportUtil.exportToFile(baseStationDOS, out);
            }
            //导出符合条件的全部数据
            /*if (type.equals("3")) {
                query.remove("offset");
                query.remove("limit");
                List<BaseStationDO> baseStationDOS = baseStationService.list(query);
                MyExcelExportUtil.exportToFile(baseStationDOS, out);
            }*/
        } catch (Exception e) {
            e.printStackTrace();
//            logger.info("exportExcel出错"+e.getMessage());
        } finally {
            out.close();
        }
    }
}
