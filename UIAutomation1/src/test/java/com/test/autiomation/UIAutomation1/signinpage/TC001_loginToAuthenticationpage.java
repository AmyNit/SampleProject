package com.test.autiomation.UIAutomation1.signinpage;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.UIAutomation1.testBase.TestBase;
import com.test.automation.UIAutomation1.uiActions.SigninPage;

public class TC001_loginToAuthenticationpage extends TestBase{
	
public static final Logger log=Logger.getLogger(TC001_loginToAuthenticationpage.class.getName());

SigninPage signinpage;

@BeforeTest

public void testsetup() throws IOException{
	
	init();
	
	
}
	
@Test

public void loginToAuthenticationpageTest(){
	
signinpage=new SigninPage(wd);

log.info("************Starting loginToAuthenticationpageTest************");

signinpage.clickSignin();


log.info("************Ending loginToAuthenticationpageTest************");

		
	
	
}
	
@AfterClass(enabled=false)
public void testShutDown(){
	
	wd.close();
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
