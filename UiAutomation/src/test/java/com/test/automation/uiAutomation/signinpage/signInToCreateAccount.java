package com.test.automation.uiAutomation.signinpage;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.uiautomation.testBase.TestBase;
import com.test.automation.uiautomation.uiActions.signInPage;

public class signInToCreateAccount extends TestBase {

	public static final Logger log = Logger.getLogger(signInToCreateAccount.class.getName());

	signInPage signinpage;

	@BeforeTest

	public void testSetUp() {

		init();

	}

	@Test

	public void verifySignInToCreateAccount() {

		signinpage = new signInPage(wd);

		log.info("*****starting verifySignInToCreateAccount test******");
		signinpage.clickSignIn();

	}
}