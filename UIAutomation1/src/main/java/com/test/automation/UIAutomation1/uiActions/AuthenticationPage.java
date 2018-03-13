package com.test.automation.UIAutomation1.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.test.automation.UIAutomation1.testBase.TestBase;

public class AuthenticationPage extends TestBase  {
	
	
	
	public static final Logger log=Logger.getLogger(AuthenticationPage.class.getName());

	@FindBy(xpath=".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signinButton;
	
	@FindBy(xpath=".//*[@id='email']")
	WebElement emailField;
	
	@FindBy(xpath=".//*[@id='passwd']")
	WebElement passwordField;
	
	@FindBy(id="SubmitLogin")
	WebElement submitButton;
	
	@FindBy(xpath=".//*[@id='center_column']/div[1]/ol/li")
	WebElement authenticationFailedmsg;
	
	@FindBy(xpath=".//*[@id='center_column']/div[1]/ol/li")
	WebElement authenticationfailed;
	
	
	
	
	
	
	public AuthenticationPage(WebDriver wd){
		
		this.wd=wd;
		
		PageFactory.initElements(wd, this);
		
	}
	
	
	public void enterInvalidData(String email,String pwd){
	
	log("clicking on signinButton");
	signinButton.click();
	
	log("Entering invalid email address:- "+email+" Object is :- "+emailField.toString());	
		
	emailField.clear();
	emailField.sendKeys(email);
	
	log("Entering invalid passoword:- "+pwd+" Object is :-"+passwordField.toString());
	
	passwordField.clear();
	passwordField.sendKeys(pwd);
	
	
		
	}
	
	public void clickSubmit(){
		
		
		log("clicking on submit button and Object is :- "+submitButton);
		submitButton.click();	
		
	}
	
	public boolean verifyAuthenticationErrormsg(){
		
		
		
		
		try {
			
			waitForElement(300,authenticationFailedmsg);
			authenticationFailedmsg.isDisplayed();
			return true;
		
		} catch (Exception e)
		
		{
			
			return false;
		}
		
	}
	
	
public void  log(String data){
		
		log.info(data);   
		Reporter.log(data);  
	}
	
	
	
	
	
	
	

}
