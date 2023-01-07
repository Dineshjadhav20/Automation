package com.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.pom.WindowHandle_pom;

public class Window001 extends Base_class {

	@Test
	
	public void windowtest001() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WindowHandle_pom act=new WindowHandle_pom(driver);
		
		act.performaction();
		
		act.setname();
	}
}
