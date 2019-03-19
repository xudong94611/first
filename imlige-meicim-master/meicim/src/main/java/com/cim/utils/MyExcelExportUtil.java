package com.cim.utils;

import java.io.OutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.xuxueli.poi.excel.ExcelExportUtil;

public class MyExcelExportUtil extends com.xuxueli.poi.excel.ExcelExportUtil {
    private static Logger logger = LoggerFactory.getLogger(com.xuxueli.poi.excel.ExcelExportUtil.class);
    /**
     * 导出Excel文件到磁盘
     * @chancelai dataList
     * @chancelai outputStream
     */
    public static void exportToFile(List<?> dataList, OutputStream outputStream){
// workbook
        Workbook workbook = exportWorkbook(dataList);
        try {
// workbook 2 FileOutputStream
            workbook.write(outputStream);
// flush
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new RuntimeException(e);
        } finally {
            try {
                if (outputStream!=null) {
                    outputStream.close();
                }
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
                throw new RuntimeException(e);
            }
        }
    }
}