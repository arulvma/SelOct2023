package com.tests;


import org.testng.annotations.Test;

import com.common.ProjectGeneric;
import com.pages.HomePage;
//import com.pages.LeadsPage;
import com.pages.SignInPage;


public class TC002_VerifyMyHomePageNavigaion extends ProjectGeneric {	

	@Test(dataProvider = "fetchData")	
	//public void verifyCRMButton(String userName, String passWord) throws Exception {
		//when run this above statement i.e., > public void verifyCRMButton(String userName, String passWord) throws Exception
		//we got an exception named: org.testng.internal.reflect.MethodMatcherException:
		
		
		//org.testng.internal.reflect.MethodMatcherException: 
		//[public void com.tests.TC002_VerifyMyHomePageNavigaion.verifyCRMButton(java.lang.String,java.lang.String) throws java.lang.Exception] has no parameters defined but was found to be using a data provider (either explicitly specified or inherited from class level annotation).
		//Data provider mismatch
		
		//Method: verifyCRMButton([Parameter{index=0, type=java.lang.String, declaredAnnotations=[]}, Parameter{index=1, type=java.lang.String, declaredAnnotations=[]}])
		
		//Arguments: [(java.lang.String) DemoSalesManager,(java.lang.String) crmsfa,(java.lang.String) dummy1]
		 
		//Exception root cause:
		//In the method, we just have 2 parameters but the Arguments which we get from dataProvider is 3
		//these 3 arguments are not able to send into the method parameters since method only has 2 parameters, so there is no room for the 3rd parameter 
		
		//we can fix this exception by providing 3rd parameter to the method as below
		//which's why in TC001_LogintoApplication this test no exception occurred since it already has 3 parameters & can accommodate 3 arguments from the dataprovider
		
		public void verifyCRMButton(String userName, String passWord, String sample) throws Exception {
		
		System.out.println("Enetered into verifyCRMButton methodsss!!! ");
		
		System.out.println("the driver session value is: "+driver.getSessionId());

		new SignInPage(driver).enterUsername(userName).enterPassWord(passWord).clickSubmit().verifyHomePage().clickCRMBtn().verifyMyHomPage();
		
		//In the above statement, we just called the methods from the different classes SignInPage, HomePage,  MyHomPage
		//but we only import the SignInPage but HomePage,  MyHomPage classes not imported
		//How it works?
		
		//Method: verifyCRMButton(	
		//[Parameter{index=0, type=java.lang.String, declaredAnnotations=[]}, 
		//Parameter{index=1, type=java.lang.String, declaredAnnotations=[]}]
		//)
		
		//Arguments: [(java.lang.String) DemoSalesManager,
					//(java.lang.String) crmsfa,
					//(java.lang.String) dummy1]
		
	}
}
