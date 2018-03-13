package com.test.automation.uiAutomation.createAccountPage;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.uiautomation.testBase.TestBase;
import com.test.automation.uiautomation.uiActions.HomePage;

public class TC001_verifyLoginWithInvalidCredentials extends TestBase {

	public static final Logger log = Logger.getLogger(TC001_verifyLoginWithInvalidCredentials.class.getName());

	HomePage homepage;

	@BeforeTest

	public void testSetUp1() {

		init();

	}

	@Test

	public void verifyLoginWithInvalidCredentials() {

		log.info("*********starting verifyLoginWithInvalidCredentials test************");
		homepage = new HomePage(wd);
		homepage.loginToApplication("hello@gmail.com", "2618723");
		Assert.assertEquals(homepage.verifyErrormsgonInvalidLogin(), "Authentication failed.");

		log.info("**********Finished verifyLoginWithInvalidCredentials test***********");
	}

}
