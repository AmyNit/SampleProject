package com.orion.whitemartProject.pagelibrary;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class SignIn {
	
	WebDriver wd;
	
	static Logger log=Logger.getLogger(SignIn.class.getName());
	
	By signIn=By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a");
	By createAccountEmailAddress=By.xpath("//input[@id='email_create']");
	By alreadyregisteredEmail=By.xpath("email");
	By alreadyregisteredPwd=By.xpath(".//*[@id='passwd']");
	By signTnAlreadyRegistered=By.xpath(".//*[@id='SubmitLogin']");
	By submitCreateAccount=By.xpath("//*[@id='SubmitCreate']");
	By signOut=By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[2]/a");
    By errorMsg=By.xpath(".//*[@id='create_account_error']/ol/li");
	
	/*
	 * creating constructor of class
	 * 'this' keyword is used since class variable( global variable is same as local variable)
	 * Available only for non static method
	 */
	public SignIn(WebDriver wd){
		
	this.wd=wd;
	}
	
	
	
	/**
	 * This method will click on SignIn
	 */
	
	public void clickonSignIn(){
		
		log.info("clicking on SingIn link");
		wd.findElement(signIn).click();
	}
	
	/**
	 * This method will enter email address to Create Account
	 * @param emailAddress
	 */
	public void enterEmailAddressToCreateAccount(String emailAddress){
		
		log.info("Entering email address to Create Account");
		wd.findElement(createAccountEmailAddress).sendKeys(emailAddress);
	}
	/**
	 * This method will  click submit to Create Account
	 * @param emailAddress
	 */
public void clickSubmitToCreateAccount(){
		
		log.info("click submit to Create Account");
		wd.findElement(submitCreateAccount).click();
	}
	
	/**
	 * This method will enter email address to Already Registered user
	 * @param emailAddress
	 */
	
	public void enterAddressToAlreadyRegistered(String emailAddress){
		
		log.info("Entering email address to Already Registered User");
		wd.findElement(alreadyregisteredEmail).sendKeys(emailAddress);
		
	}
	
	/**
	 * This method will enter password to Already Registered user
	 * @param pwd
	 */
	public void enterpwdToAlreadyRegistered(String pwd){
		
		log.info("Entering password to Already Registered User");
		wd.findElement(alreadyregisteredPwd).sendKeys(pwd);
		
	}
	
	/**
	 * This method will click on SignIn for a Already Registered User
	 */
	public void clickOnSignTnToAccount(){
		
		log.info("Clicking SignIn for Already Registered User ");
		wd.findElement(signTnAlreadyRegistered).click();
		
	}
	
	/*
	 *generic method to signIn to Application 
	 * 
	 */
	public void signInToApplication(){
		clickonSignIn();
		
	}
	
	/*
	 * Generic method to enter data to Create Account
	 */
	
	public void enterDataToCreateAccount(String EmailAddress){
	enterEmailAddressToCreateAccount(EmailAddress);
	clickSubmitToCreateAccount();
	}
	
	/*
	 * This method will click on Sign Out button
	 */
	public void signOut(){
		
		log.info("clicking on signout button");
		
		try {
			boolean isDisplayed=wd.findElement(signOut).isDisplayed();
			if(isDisplayed){
			wd.findElement(signOut).click();
			}
		} catch (Exception e) {
		
			Assert.assertTrue(false,"sign out button is not displayed");
		}
		
		
		
		
	}



	public boolean verifyErrorMsg() {
    
		String errormsg=wd.findElement(errorMsg).getText();
		
		if(errormsg.contains("An account using this email address has already been registered. Please enter a valid password or request a new one.")){
			
			return true;
		}
		else{
		
		
		return false;
	}
	
}}
