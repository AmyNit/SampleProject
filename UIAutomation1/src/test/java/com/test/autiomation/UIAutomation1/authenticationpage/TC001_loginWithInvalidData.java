package com.test.autiomation.UIAutomation1.authenticationpage;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.UIAutomation1.testBase.TestBase;
import com.test.automation.UIAutomation1.uiActions.AuthenticationPage;

public class TC001_loginWithInvalidData extends TestBase {

	public static final Logger log = Logger.getLogger(TC001_loginWithInvalidData.class.getName());

	AuthenticationPage authenticationpage;

	@BeforeClass

	public void testSetUp() throws IOException {

		init();
	}

	@Test

	public void loginWithInvalidDataTest() {

		
			try {
				log("===============starting loginWithInvalidDataTest =================");
				authenticationpage = new AuthenticationPage(wd);
				authenticationpage.enterInvalidData("hello@gmail.com", "7621983719");
				authenticationpage.clickSubmit();

				Assert.assertEquals(true, authenticationpage.verifyAuthenticationErrormsg());
				takeScreenshot("VerifyErrorMsg");
			} catch (AssertionError e) {
				
				takeScreenshot("VerifyErrorMsg");
				Assert.assertTrue(false, "VerifyErrorMsg");
			}
			
			log("===============Ending loginWithInvalidDataTest =================");
			
				}
	

public void  log(String data){
		
		log.info(data);   //print in console,print in log file
		Reporter.log(data);  //Reporter.log is a TestNG class which will data in emailable report.html
	}
	
	
	

}
