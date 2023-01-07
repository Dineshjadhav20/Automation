package com.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.pom.Sanity_POM;

public class Sanity_Test extends Base_class{
	
	@Test
	public void SanityTesting()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Sanity_POM test=new Sanity_POM(driver);
		test.AcBtn();
		test.checkbtn();
		
	}
	
	
	
}
