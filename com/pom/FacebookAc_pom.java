package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FacebookAc_pom {

	WebDriver localdrver;
	public FacebookAc_pom(WebDriver remotedriver) {
		localdrver=remotedriver;
		PageFactory.initElements(remotedriver,this );
	}
	
	@FindBy(how=How.XPATH, using="//a[text()='Create New Account']")
	private WebElement CreatAcBtn;
	
	@FindBy(how=How.XPATH, using="//input[@name=\"firstname\"]")
	private WebElement name;
	
	@FindBy(how=How.XPATH, using="//input[@name=\"lastname\"]")
	private WebElement surname;
	
	@FindBy(how=How.XPATH, using="//input[@name=\"reg_email__\"]")
	private WebElement mobile;
	
	@FindBy(how=How.XPATH, using="//input[@name=\"reg_passwd__\"]")
	private WebElement password;
	
	@FindBy(how=How.XPATH, using="//select[@name=\"birthday_day\"]")
	private WebElement day;
	
	@FindBy(how=How.XPATH, using="//select[@name=\"birthday_month\"]")
	private WebElement month;
	
	@FindBy(how=How.XPATH, using="//select[@name=\"birthday_year\"]")
	private WebElement year;
	
	@FindBy(how=How.XPATH, using="(//input[@name=\"sex\"])[2]")
	private WebElement sex;
	
	
	public void performactionACBtn()
	{
		CreatAcBtn.click();
		
	}
	
	public void setName(String NAME)
	{
		name.sendKeys(NAME);
		
	}
	
	public void setSureName(String LNAME)
	{
		surname.sendKeys(LNAME);
		
	}
	
	public void setmobile(String MOBILE)
	{
		mobile.sendKeys(MOBILE);
		
	}
	
	public void setpassword(String PASS)
	{
		password.sendKeys(PASS);
		
	}
	
	public void setday(String DAY)
	{
		day.sendKeys(DAY);
		
	}
	
	public void setmonth(String MONTH)
	{
		Select sect=new Select(month);
		sect.selectByValue(MONTH);
		
	}
	
	public void setyear(String YEAR)
	{
		year.sendKeys(YEAR);
		
	}
	
	public void performactionmale()
	{
		sex.click();
		
		
	}
}
