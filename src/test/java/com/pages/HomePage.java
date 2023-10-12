package com.pages;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.common.ProjectGeneric;

public class HomePage extends ProjectGeneric {
	
	
	public static String welComLablActVal = prop.getProperty("homPagWelcomLablActVal");
	public static String welComLablLocatrVal = prop.getProperty("welcomLabl_Xpath");
	public static String crmBtnLocatorVal = prop.getProperty("crmBtn_ByLink");	
	
	//public RemoteWebDriver driver;
	
	public HomePage(RemoteWebDriver driver) {//HomePage is a constructor or what is it?
		
		this.driver = driver;//what we do in this statement
	}
	
	public HomePage verifyHomePage () {	 
		verifyTextContainsByXpath(welComLablLocatrVal, welComLablActVal);
		return this;
	}
	
	public MyHomPage clickCRMBtn() throws Exception {
	
		clickByLink(crmBtnLocatorVal);
		return new MyHomPage(driver);
	}	

}

