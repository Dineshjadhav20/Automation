package com.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MouseHoverr_Pom {

	WebDriver localdriver;
	public MouseHoverr_Pom(WebDriver remotedriver)
	{
		localdriver=remotedriver;
		PageFactory.initElements(remotedriver, this);
	}
	
	@FindBy(how=How.XPATH, using="//input[@id=\"email\"]")
	private WebElement Email;
	
	@FindBy(how=How.XPATH, using="//input[@id=\"pass\"]")
	private WebElement Pass;


public void MouseAction() {
	
	Actions Act=new Actions(localdriver);
	Act.sendKeys("dinesh");
	Act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	Act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	Act.keyDown(Pass,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	
	
}		
}