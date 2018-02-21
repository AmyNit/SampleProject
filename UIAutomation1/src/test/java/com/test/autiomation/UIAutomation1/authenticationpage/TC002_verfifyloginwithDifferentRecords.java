package com.test.autiomation.UIAutomation1.authenticationpage;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.automation.UIAutomation1.testBase.TestBase;
import com.test.automation.UIAutomation1.uiActions.AuthenticationPage;

public class TC002_verfifyloginwithDifferentRecords extends TestBase{
	
	
	public static final Logger log = Logger.getLogger(TC002_verfifyloginwithDifferentRecords.class.getName());

	AuthenticationPage authenticationpage;
	
	@DataProvider(name="loginData")
	public String[][] getTestData(){
		
		String[][] testRecords = getData("TestData.xlsx","LoginTestData");
		
		return testRecords;
		
	}

	@BeforeClass

	public void testSetUp() throws IOException {

		init();
	}
/*
 * The arguments we pass here must me equal to the no of columns in the excel
 */
	@Test(dataProvider="loginData")

	public void loginWithDifferentRecords(String email,String pwd,String runMode) {

		if(runMode.equalsIgnoreCase("n")){
			
			throw new SkipException("User marked it as No in RunMode");
		}
		
		
		authenticationpage = new AuthenticationPage(wd);
		authenticationpage.enterInvalidData(email, pwd);
		authenticationpage.clickSubmit();
        
		boolean status=authenticationpage.verifyAuthenticationErrormsg();
		
		takeScreenshot("testlogin_"+email);
		Assert.assertEquals(true, status);
		
		
	}
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


