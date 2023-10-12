package com.tests;


//import org.openqa.selenium.WebDriver;
//import org.testng.DependencyMap;
import org.testng.annotations.Test;

import com.common.ProjectGeneric;
//import com.pages.LeadsPage;

import com.pages.SignInPage;



public class TC001_LogintoApplication extends ProjectGeneric {
	

	@Test(dataProvider = "fetchData")
	
	public void loginToApplication(String userName, String passWord, String sample) throws Exception {
		
		
		  System.out.println("Entered userName is: "+userName); 
		  System.out.println("Entered password is: "+passWord);		  
		  System.out.println("sample value is: " +sample);
		  
		  new SignInPage(driver).enterUsername(userName).enterPassWord(passWord).
		  clickSubmit().verifyHomePage();
		
		//if commented the import of com.pages.SignInPage; then unable to call the methods which are defined in the SignInPage class 
		//but here verifyHomePage method is not defined in the SignInPage class actually it is defined in HomePage class and is not imported in the TC001_LogintoApplication class
		//How it works and why we did't face any issue in the .verifyHomePage(); statement?
		
	}
	
		
		
}
