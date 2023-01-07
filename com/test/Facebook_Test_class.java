package com.test;



import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.pom.FacebookAc_pom;
import com.utility.TakeScreenShot;


public class Facebook_Test_class extends Base_class{

	@Test
	
	public void Test20()
	{
		FacebookAc_pom act=new FacebookAc_pom(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		act.performactionACBtn();
		act.setName(Exname);
		act.setSureName(Exsurename);
		act.setmobile(Exmobile);
		act.setpassword(Expass);
		act.setday(Exday);
		act.setmonth(Exmonth);
		act.setyear(Exyear);
		act.performactionmale();
		
		
		
	}
}
