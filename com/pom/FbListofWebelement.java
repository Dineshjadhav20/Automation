package com.pom;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FbListofWebelement {

	WebDriver Localdriver;
	public FbListofWebelement(WebDriver remotedriver)
	{
		Localdriver=remotedriver;
		PageFactory.initElements(remotedriver,this);
	}
	
	
	@FindBy(how=How.XPATH, using="//a")
	private List<WebElement> AlllElement;
	



public void SetElement()
{
	Iterator<WebElement> it=AlllElement.iterator();
	while(it.hasNext()) {
		WebElement link=it.next();
		System.out.println(link.getText());
		if(link.equals("Create New Account"))
		{
			link.click();
		}
	}

}
}