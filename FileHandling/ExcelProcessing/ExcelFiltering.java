package org.example;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ExcelFiltering {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(
                "src/main/java/org/example/resources/students.xlsx");
        Workbook inputWorkbook = new XSSFWorkbook(fis);
        Sheet sheet = inputWorkbook.getSheetAt(0);


        Workbook outWorkbook = new XSSFWorkbook();
        Sheet outSheet = outWorkbook.createSheet("Age > 20");

        Row header = outSheet.createRow(0);
        header.createCell(0).setCellValue("Name");
        header.createCell(1).setCellValue("Age");

        int outputRowIndex = 1;

        for (Row row : sheet) {

            if (row.getRowNum() == 0) continue;

            String name = row.getCell(0).getStringCellValue();
            int age = (int) row.getCell(1).getNumericCellValue();

            if (age > 20) {
                Row dataRow = outSheet.createRow(outputRowIndex++);
                dataRow.createCell(0).setCellValue(name);
                dataRow.createCell(1).setCellValue(age);
            }
        }


        for (int i = 0; i < 2; i++) {
            outSheet.autoSizeColumn(i);
        }

        FileOutputStream fos = new FileOutputStream(
                "src/main/java/org/example/resources/greater_than_20.xlsx");
        outWorkbook.write(fos);


        fos.close();
        outWorkbook.close();
        inputWorkbook.close();
        fis.close();
    }
}
