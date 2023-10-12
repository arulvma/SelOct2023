package com.tests;


import org.testng.annotations.Test;

import com.common.ProjectGeneric;
import com.pages.HomePage;
//import com.pages.LeadsPage;
import com.pages.SignInPage;


public class TC003_VerifyLeadsPage extends ProjectGeneric {

	@Test(dataProvider="fetchData")
	public void verifyLeadsPage(String userName, String passWord, String Sample) throws Exception {
		
		new SignInPage(driver).enterUsername(userName).enterPassWord(passWord).clickSubmit().verifyHomePage()
		.clickCRMBtn().verifyMyHomPage().clickLeadsTab().verifyLeadPage();
		
		//Why we just import only the com.pages.SignInPage; and how without import any other classes no error is displayed?
		
	}
}
