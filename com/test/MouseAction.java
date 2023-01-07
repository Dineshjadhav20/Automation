package com.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.pom.MouseHoverr_Pom;

public class MouseAction extends Base_class{

	@Test
	public void MousweactTest()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MouseHoverr_Pom act =new MouseHoverr_Pom(driver);
		act.MouseAction();
	}
}
