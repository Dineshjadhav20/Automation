package com.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.pom.Iframe_pom;

public class Iframe_Test extends Base_class {

	@Test
	
	public void Iframe001()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Iframe_pom IF=new Iframe_pom(driver);
		
		IF.perform2();
		IF.SetName();
		
	}
}
