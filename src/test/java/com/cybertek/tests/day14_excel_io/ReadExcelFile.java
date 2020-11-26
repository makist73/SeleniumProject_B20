package com.cybertek.tests.day14_excel_io;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.cellwalk.CellWalk;

import java.io.File;
import java.io.IOException;

public class ReadExcelFile {

    public static void main(String[] args) throws IOException {
        String path="vytrack_testusers.xlsx";
        File file = new File(path);
    // Step 1. Create excel file object
        // workbook object represents excel file
        // it has spreadsheets thatr we gonna read as well
        Workbook workbook = WorkbookFactory.create(file);

        int numOfSheets = workbook.getNumberOfSheets();
        System.out.println("Number of Sheets = " + numOfSheets);

        // Step 2. Create object of spreadsheet
        Sheet sheet =workbook.getSheet("QA3-short");
        Row row1= sheet.getRow(0);
        // Step4. Read a cell
        Cell cell1 = row1.getCell(0);
        // Step 5. Extract value
        String value1 =cell1.getStringCellValue();
        // Step 6. USe value
        System.out.println("Value of 1st row 1st column = " + value1);
        // get all spreadsheet names
        //
        workbook.forEach(sh-> System.out.println(sh.getSheetName()));
    }
}
