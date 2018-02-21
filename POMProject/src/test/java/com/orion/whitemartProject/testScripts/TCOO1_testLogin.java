package com.orion.whitemartProject.testScripts;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.orion.whitemartProject.pagelibrary.CreateAccount;
import com.orion.whitemartProject.pagelibrary.MyAccountHomePage;
import com.orion.whitemartProject.pagelibrary.SignIn;
import com.orion.whitemartProject.testBase.TestBase;

import junit.framework.Assert;

public class TCOO1_testLogin extends TestBase {
	
	SignIn signIn;
	CreateAccount createaccount;
	MyAccountHomePage myaccounthome;
	
	
	
	String EmailAddress="email"+System.currentTimeMillis()+"@gmail.com";
	String firstName="Amy";
	String lastName="Nithin";
	String createAccountlastName="Nithin";
	String mailaddress="ammu@gmail.com";
	String pwd="amy1234";
	String day="6";
	String month="January";
	String year="1991";
	
	String yourAddressFirstName="Ammu";
	String yourAddressCompanyName="Orion";
	String primaryAddress="Kochi,Kerala";
	String secondaryAddress="Kingston,Wellington";
	String city="Kochi";
	String state="Colorado";
	String postalCode="60211";
	String additionalInfo="Not Available";
	String mobileNo="02102673739";
	String aliasAddress="Chalakudy,Thrissur";
	
	
	
	
	
	
	
	@BeforeClass
	public void setup() throws IOException{
		init();
		signIn=new SignIn(wd);
		createaccount=new CreateAccount(wd);
		myaccounthome=new MyAccountHomePage(wd);
		}
	
	
	@Test(priority=1,enabled=false,description="Test Login")
	
	public void testLogin() throws InterruptedException{
	
		
		signIn.signInToApplication();
		signIn.enterDataToCreateAccount(EmailAddress);
		Thread.sleep(2000);
		//explicitWait(wd.findElement(createaccount.mrRadioButton),30);
		
		createaccount.userRegistrationTest(firstName, createAccountlastName, EmailAddress, pwd, day, month, year,
				      yourAddressFirstName, yourAddressCompanyName, primaryAddress, secondaryAddress, city, state, 
				      postalCode, additionalInfo, mobileNo, aliasAddress);
	    createaccount.clickRegister();
	   
	    Thread.sleep(1000);
	   // explicitWait(wd.findElement(myaccounthome.myAccountLabel),30);
       
        boolean isSuccess=myaccounthome.verifyRegistrationMsg();
       
        if(isSuccess){
    	 Assert.assertTrue("Registration test passed", true);
        }
        else{
    	   Assert.assertTrue("Registation test failed", false);
    	 
       }
	}

      @Test(priority=2,enabled=true,description="Test Registration with valid data")

      public void testRegistrationWithInValidData() throws InterruptedException{

	   signIn.signOut();
	   signIn.enterDataToCreateAccount(mailaddress);
	   waitFor(2);
	   boolean isSuccess=signIn.verifyErrorMsg();
       
       if(isSuccess){
   	   Assert.assertTrue("Registration test for invalid data passed", true);
       }
       else{
   	   Assert.assertTrue("Registation test for invalid data failed", false);
   	 
      }
	  
		
		

		
	}
}
//@AfterClass

// public void shutDown()
//  {
//  	closeBrowser();
 // }
