package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.utility.ReadConfigData;
import com.utility.ReadExcelSheetData;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class {
	

	
	ReadExcelSheetData excel=new ReadExcelSheetData();
	String Exurl=excel.getExcelData("sheet1", 1, 3);
	String Exname=excel.getExcelData("sheet1", 1, 4);
	String Exsurename=excel.getExcelData("sheet1", 1, 5);
	String Exmobile=excel.getExcelData("sheet1", 1, 6);
	String Expass=excel.getExcelData("sheet1", 1, 7);
	String Exday=excel.getExcelData("sheet1", 1, 8);
	String Exmonth=excel.getExcelData("sheet1", 1, 9);
	String Exyear=excel.getExcelData("sheet1", 1, 10);
	
	ReadConfigData read=new ReadConfigData();
	String URL=read.geturl();		
	String NAME=read.getName();
	String LNAME=read.getLaName();
	String MOBILE=read.getmobile();
	String PASS=read.getnewpass();
	String DAY=read.getday();
	String MONTH=read.getMonth();
	String YEAR=read.getyear();
	
	
	WebDriver driver;
	@BeforeClass
	public void Setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void logoff() throws InterruptedException {
		Thread.sleep(6000);
		driver.quit();
	}

}
