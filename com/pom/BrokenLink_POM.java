package com.pom;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BrokenLink_POM {

	WebDriver localdriver;
	public BrokenLink_POM(WebDriver remotedriver)
	{
		localdriver=remotedriver;
		PageFactory.initElements(remotedriver, this);
		
	}
		@FindBy(how=How.XPATH, using="//a")
		private List <WebElement>links;
		
	
		
		public void FindBrokenLink() {
			
			for(int a=0;a<links.size();a++)
			{
				WebElement Singlelink=links.get(a);
				String Atribute=Singlelink.getAttribute("href");
				try {
				URL url=new URL(Atribute);
				HttpURLConnection urlconnection=(HttpURLConnection)url.openConnection();
				urlconnection.setConnectTimeout(4000);
				urlconnection.connect();
				if(urlconnection.getResponseCode()==401) {
					System.out.println("status ok");
					System.out.println(Singlelink.getText());
				}
				else
				{
					System.out.println("broken link");
					System.out.println(Singlelink.getText());
				}
				}
				catch(Exception e)
				{
					System.out.println("found exception due to"+e);
				}
				
			}
	}
}
