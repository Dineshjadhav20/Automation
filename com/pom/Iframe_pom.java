package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Iframe_pom {

	WebDriver localdriver;
	public Iframe_pom(WebDriver remotedriver)
	{
		localdriver=remotedriver;
		PageFactory.initElements(remotedriver, this);
	}
	
	
	
	@FindBy(how=How.XPATH, using="(//iframe) [1]")
	private WebElement iframe;
	
	@FindBy(how=How.XPATH, using="(//input[@type=\"text\"])[1]")
	private WebElement name;




public void perform2()
{
	localdriver.switchTo().frame(iframe);
}

public void SetName()
{
	name.sendKeys("dineshjadhav");
}
}