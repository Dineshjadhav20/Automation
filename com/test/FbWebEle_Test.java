package com.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.pom.FbListofWebelement;

public class FbWebEle_Test extends Base_class {

	@Test
	
	public void WebelementTest()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		FbListofWebelement  ele=new FbListofWebelement(driver);
		ele.SetElement();
	}
}
