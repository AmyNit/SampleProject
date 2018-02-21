package com.test.automation.UIAutomation2.signinPage;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.test.automation.IIAutomation2.UIActions.Signinpage;
import com.test.automation.ILAutomation2.testBase.TestBase;


public class TC001_genericmethods extends TestBase{
	public static final Logger log = Logger.getLogger(Signinpage.class.getName());

     Signinpage signinpage;

	@BeforeTest

	public void testSetUp() {

		init();
	}

	@Test

	public void genericMethodTest() throws InterruptedException {

		signinpage = new Signinpage(wd);
		signinpage.clickWomen();
		signinpage.clickOnNavigationMenu(signinpage.clothing);
		signinpage.clickOnNewIninClothing(signinpage.newIn);
		signinpage.clickOnNewIninShoes(signinpage.newIn);
		
	}
	
	@AfterClass(enabled=false)
	
	
	public void testShutDown(){
		
		wd.close();
	}

}


