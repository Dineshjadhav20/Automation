package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Sanity_POM {

	WebDriver localdriver;
	public Sanity_POM(WebDriver remotedriver)
	{
		localdriver=remotedriver;
		PageFactory.initElements(remotedriver, this);
		
	}
	@FindBy(how=How.XPATH, using="//a[text()='Create New Account']")
	private  WebElement AcreatBtn;

	
		@FindBy(how=How.XPATH, using="//select[@id=\"day\"]")
		private  WebElement day;
	
		
		public void AcBtn()
		{
			if(AcreatBtn.isDisplayed())
			{
				AcreatBtn.click();
			}
		}
		
		

       public void checkbtn() {

    	   if(!day.isSelected()) {
		  day.sendKeys("20");
    	   }
    	   else
    	   {
    		   System.out.println("not diplayed");
    	   }
       }
}
