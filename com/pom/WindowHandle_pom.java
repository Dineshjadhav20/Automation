package com.pom;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WindowHandle_pom {
	String parent;
	WebDriver localdriver;
	public WindowHandle_pom (WebDriver remotedriver)
	{
		localdriver=remotedriver;
		PageFactory.initElements(remotedriver, this);
	}
	
	@FindBy(how=How.XPATH, using="//li[@id=\"Open New Window\"]")
	private WebElement window;
	
		@FindBy(how=How.XPATH, using="//a[text()='Click Here']")
		private WebElement btn;
		
		@FindBy(how=How.XPATH, using="//input[@name=\"s\"]")
		private WebElement name;
		
		public void performaction1()
		{
			
			
		}
		
		public void performaction()
		{
			String parent=localdriver.getWindowHandle();
			btn.click();
			Set<String> Childwindow=localdriver.getWindowHandles();
			Iterator<String> it=Childwindow.iterator();
			while(it.hasNext()) {
				String chlid=it.next();
				localdriver.switchTo().window(chlid);
			}
		}
		

		public void setname()
		{
			name.sendKeys("patil");
			localdriver.switchTo().window(parent);
			name.sendKeys("dinesh");
		}
	}

