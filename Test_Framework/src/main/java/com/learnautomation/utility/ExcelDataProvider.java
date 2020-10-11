package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class ExcelDataProvider {

	HSSFWorkbook wb;
	public ExcelDataProvider()
	{
		File src = new File("./TestData/Data.xls");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new HSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println("Unable to read Excel file"+e.getMessage());
		}
	}
	
	public String getStringData(int sheetIndex, int row, int column)
	{
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
	}
	
	public String getStringData(String sheetName, int row, int column)
	{
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}
	
	public double getNumericData(String sheetName, int row, int column)
	{
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();

	}
	
	}

