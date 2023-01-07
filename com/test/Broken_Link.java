package com.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.pom.BrokenLink_POM;

public class Broken_Link extends Base_class {

	@Test
	
	public void TestsBrokenLinks()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		BrokenLink_POM brok=new BrokenLink_POM(driver);
		brok.FindBrokenLink();
				
	}
}
