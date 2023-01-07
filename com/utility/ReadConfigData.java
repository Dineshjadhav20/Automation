package com.utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigData {

	Properties pro;
	public ReadConfigData() 
	{
		String path="C:\\Users\\dinesh\\eclipse-workspace\\Framwork_practice\\testdata\\Fb_Test_Data";
		try{
		FileInputStream fis=new FileInputStream(path);
		 pro=new Properties();
		pro.load(fis);
		}
		catch(Exception e) {
			System.out.println("file not found because"+e);
		}
	}
	
		public String geturl()
		{
			String url=pro.getProperty("FbUrl");
			return url;
		}
		
		public String getName()
		{
			String fname=pro.getProperty("Name");
			return fname;
		}
	
		public String getLaName()
		{
			String lname=pro.getProperty("Surname");
			return lname;
		}
		
		public String getmobile()
		{
			String mobileno=pro.getProperty("Mobile");
			return mobileno;
		}
		
		public String getnewpass()
		{
			String pass=pro.getProperty("NewPassword");
			return pass;
		}
		

		public String getday()
		{
			String day=pro.getProperty("Date");
			return day;
		}
		
		public String getMonth()
		{
			String month=pro.getProperty("Month");
			return month;
		}
		
		public String getyear()
		{
			String year=pro.getProperty("Year");
			return year;
		}

}

