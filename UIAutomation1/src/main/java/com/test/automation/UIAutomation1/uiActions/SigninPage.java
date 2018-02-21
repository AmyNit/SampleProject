package com.test.automation.UIAutomation1.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.test.automation.UIAutomation1.testBase.TestBase;

public class SigninPage extends TestBase {
	
	
	public static final Logger log=Logger.getLogger(SigninPage.class.getName());
	
	
	@FindBy(xpath=".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signinButton;
	

	public SigninPage(WebDriver wd){
		
		this.wd=wd;
		
		PageFactory.initElements(wd, this);
	}
	
	public void clickSignin(){
		
	log("Clicking on Signin button and the object is");	
	
	signinButton.click();	
		
		
	}
	
	
public void  log(String data){
		
		log.info(data);   //print in console,print in log file
		Reporter.log(data);  //Reporter.log is a TestNG class which will print data in emailable report.html
	}	
	
	
	
	
	
	
	
	
	
	
	
	

}
