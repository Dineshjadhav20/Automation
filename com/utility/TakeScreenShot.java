package com.utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class TakeScreenShot {
	
	WebDriver localdriver;
	public void Takess(WebDriver remotedriver) {
		localdriver=remotedriver;
		PageFactory.initElements(remotedriver,this);
		
		 WebElement Ss= localdriver.findElement(By.xpath("//a[text()='Create New Account']"));
			File Source=Ss.getScreenshotAs(OutputType.FILE);
			String path="C:\\Users\\dinesh\\eclipse-workspace\\Framwork_practice\\ExData\\pj";
			File destination=new File(path+".jpg");
			try
			{
			FileUtils.copyFile( Source, destination);
			}
			catch (Exception e)
			{
				System.out.println("not found"+e);
			}
	}
	

}
