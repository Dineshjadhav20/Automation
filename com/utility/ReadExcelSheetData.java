package com.utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ReadExcelSheetData {
	XSSFWorkbook Data;
	
	public ReadExcelSheetData() {
		
		String path="C:\\Users\\dinesh\\eclipse-workspace\\Framwork_practice\\ExData\\TESt.xlsx";
		try {
		FileInputStream Fis=new FileInputStream(path);
		 Data=new XSSFWorkbook(Fis);
		}
		catch (Exception e)
		{
			System.out.println("file not found because"+e);
		}
	}
		public String getExcelData(String Sheet, int RowNO, int CellNO)
		{
			return Data.getSheet(Sheet).getRow(RowNO).getCell(CellNO).getStringCellValue();
		}
	}

