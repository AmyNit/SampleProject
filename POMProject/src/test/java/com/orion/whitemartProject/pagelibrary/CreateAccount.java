package com.orion.whitemartProject.pagelibrary;

import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class CreateAccount {
    
	WebDriver wd;
	static Logger log=Logger.getLogger(CreateAccount.class.getName());
	
	
	
	By createAccountLabel=By.xpath(".//*[@id='noSlide']/h1");
	By yourPersonalInformationLabel=By.xpath(".//*[@id='account-creation_form']/div[1]/h3");
	
	public By mrRadioButton=By.xpath(".//*[@id='id_gender1']");
	By mrsRadioButton=By.xpath(".//*[@id='id_gender2']");
	By firstName=By.xpath(".//*[@id='customer_firstname']");
	By lastName=By.xpath(".//*[@id='customer_lastname']");
	By MailAddress=By.xpath("//input[@id='email']");
	By password=By.xpath(".//*[@id='passwd']");
	By days=By.xpath(".//*[@id='days']/option"); 
	By months=By.xpath(".//*[@id='months']/option"); 
	By years=By.xpath(".//*[@id='years']/option");
	By signUpForOurNewsLetter=By.xpath(".//*[@id='newsletter']");
	By receiveSpecialOffer=By.xpath(".//*[@id='optin']");
	
	By yourAddressTitle=By.xpath(".//*[@id='account-creation_form']/div[2]/h3");
	
	By yourAddressFirstName=By.id("firstname");
	By yourAddressLastName=By.id("lastname");
	By yourAddressCompany=By.xpath(".//*[@id='company']");
	By yourAddressPrimaryAddress=By.xpath(".//*[@id='address1']");
	By yourAddressSecondaryAddress=By.xpath(".//*[@id='address2']");
	By yourAddressCity=By.xpath(".//*[@id='city']");
	By yourAddressState=By.xpath(".//*[@id='id_state']");
	By yourAddressPostalCode=By.xpath(".//*[@id='postcode']");
	By yourAddressCountry=By.xpath(".//*[@id='id_country']");
	By yourAddressAdditionalInformation=By.xpath(".//*[@id='other']");
	By yourAddressHomePhone=By.xpath(".//*[@id='phone']");
	By yourAddressMobilePhone=By.xpath(".//*[@id='phone_mobile']");
	By yourAddressaliasaddress=By.xpath(".//*[@id='alias']");
	By Register=By.xpath(".//*[@id='submitAccount']");
	
	/*create a method for WebDriver
	 * 
	 */
	public CreateAccount(WebDriver wd){
		
		this.wd=wd;
		}

	/*
	 * This method will verify Create Account label in CreateAccount page
	 */
	
	public boolean verifyCreateAccountLabel(){
		
		log.info("verifying Create Account label in UI");
		try {
			wd.findElement(createAccountLabel).isDisplayed();
			return true;
		} catch (Exception e) {
		
			return false;
		}
		}
	/*
	 * This method will verify Personal Information label in Create Account page
	 */
	
	public boolean verifyPersonalInformationLabel(){
		
		log.info("verifying the Personal Information Label");
		try {
			wd.findElement(yourPersonalInformationLabel).isDisplayed();
			return true;
		} catch (Exception e) {
		
			return false;
		}
		
		
	}
	
	/*
	 * This method will select Mr Radio Button in CreateAccount page
	 */
	public void selectMrRadioButton(){
		log.info("selecting the Mr radio button");
		wd.findElement(mrRadioButton).click();
		}
	
	/*
	 * This method will select Mrs Radio Button in CreateAccount page
	 */
	
	public void selectMrsRadioButton(){
		log.info("selecting the Mrs radio button");
		wd.findElement(mrsRadioButton).click();
		}
	/*
	 * This method will enter FirstName in CreateAccount page
	 */
	
	public void enterFirstName(String firstName){
		log.info("entering the FirstName");
		wd.findElement(this.firstName).clear();
		wd.findElement(this.firstName).sendKeys(firstName);
		}
	
	/*
	 * This method will enter LastName in CreateAccount page
	 */
	
	public void enterLastName(String lastName){
		log.info("entering the Last Name");
		wd.findElement(this.lastName).sendKeys(lastName);
		}
	
	/*
	 * This method will enter Email address in CreateAccount page
	 */
	
	public void enterEmailAddress(String mailAddress){
		log.info("entering the Email Address");
		wd.findElement(MailAddress).clear();
		wd.findElement(MailAddress).sendKeys(mailAddress);
		}
	/*
	 * This method will enter Password in CreateAccount page
	 */
	
	public void enterPassword(String pwd){
		log.info("entering the Password");
		this.wd.findElement(password).sendKeys(pwd);
		}
	/*
	 * This method will select Day from Dropdown in CreateAccount page
	 */
	
	public void selectDayInDropDown(String day) throws InterruptedException{
		
		log.info("clicking Day in drop down list");
		
		//wd.findElement(days).click();
		Thread.sleep(1000);
		
		String day1="//*[@id='days']/option[";
	    String day2="]";
	    
	    log.info("selecting Day in drop down list");
		wd.findElement(By.xpath(day1+day+day2)).click();
			}
	/*
	 * This method will select Month from drop down in CreateAccount page
	 */
	
	public void selectMonthInDropDown(String month) throws InterruptedException{
		
		wd.findElement(months).click();
		Thread.sleep(1000);
		log.info("selecting Month in drop down list");
		
		List<WebElement> monthsdata=wd.findElements(months);
		for(WebElement m:monthsdata){
			if(m.getText().trim().toLowerCase().equals(month.toLowerCase())){
				
				log.info("selecting month from month drop down list");
				m.click();
			}}}
		
	/*
	 * This method will select Year from drop down in CreateAccount page
	 */
	
	public void selectYearInDropDown(String year) throws InterruptedException{
		
		wd.findElement(years).click();
		Thread.sleep(1000);
		log.info("selecting Year in drop down list");
		
		List<WebElement> yeardata=wd.findElements(years);
		for(WebElement y:yeardata){
			if(y.getText().trim().equals(year)){
				
				log.info("selecting Year from year drop down list");
				y.click();
			}}}
	/*
	 * This method will tick the check box sign up for our newsletter
	 */
	
	public void signUpForNewsletter(){
		
		log.info("clicking Sign up for our News Letter");
		wd.findElement(signUpForOurNewsLetter).click();
	}
	/*
	 * This method will verify Your Address label in CreateAccount page
	 */
	
	public boolean verifyYourAddressLabel(){
		
		log.info("verifying Your Address label");
		
		try {
			wd.findElement(yourAddressTitle).isDisplayed();
			return true;
			
		} catch (Exception e) {
			
			return false;
		}}
	/*
	 * This method will enter first Name in Your Address section in CreateAccount page
	 */
	public void enterYourAddressFirstName(String FirstName){
		
		log.info("Entering firstName in Your Address section in Create Account page");
		wd.findElement(yourAddressFirstName).clear();
		wd.findElement(yourAddressFirstName).sendKeys(FirstName);
	}
	/*
	 * This method will enter the company name in Your Address section in CreateAccount page
	 */
	
	public void enterCompanyName(String companyName){
		
		log.info("Entering the company name");
		wd.findElement(yourAddressCompany).sendKeys(companyName);
	}
	
	/*
	 * This method will enter primary address in Your Address section in CreateAccount page
	 */
	public void enterPrimaryAdddress(String address1){
		
		log.info("Entering the primary address in Your Address Section in CreateAccount page");
		wd.findElement(yourAddressPrimaryAddress).sendKeys(address1);
		}
	/*
	 * This method will enter secondary address in Your Address section in CreateAccount page
	 */
	public void enterSecondaryAddress(String address2){
		
		log.info("Entering secondary Address in Your Address section in CreateAccount page");
		wd.findElement(yourAddressSecondaryAddress).sendKeys(address2);
	}
	
	/*
	 * This method will enter city name in Your Address section in CreateAccount page
	 */
	
	public void enterCity(String cityName){
		
		log.info("Entering city in Your Address section in CreateAccount page");
		wd.findElement(yourAddressCity).sendKeys(cityName);
	}
	
	/*
	 * This method will select state from dropDown in Your Address section in CreateAccount page
	 */
	public void enterState(String stateName){
		
		log.info("Entering state in Your Address section in Create Account page");
	    new Select(wd.findElement(yourAddressState)).selectByVisibleText(stateName);
				
	}
	
	/*
	 * This method will enter postal code in your Address section in CreateAccount page
	 */
	public void enterPostalCode(String postCode){
		
		log.info("Entering postal code in Your Address section in Create Account page");
		wd.findElement(yourAddressPostalCode).sendKeys(postCode);
		
	}
	/*
	 * This method will enter additional Information in Your Address section in CreateAccount page
	 */
	
	public void enterAdditionalInformation(String addInfo)
	{
		log.info("Entering additional information in Your Address section in Create Account page");
		wd.findElement(yourAddressAdditionalInformation).sendKeys(addInfo);
	}
	/*
	 * This method will enter Mobile No in Your Address section in Create Account page
	 */
	
	public void enterMobileNo(String mobileNo){
		
		log.info("Entering mobile no in Your Address section in CreateAccount page");
		wd.findElement(yourAddressMobilePhone).sendKeys(mobileNo);
		
	}
	
	/*
	 * This method will enter Alias Address in Your Address section in CreateAccount page
	 */
	public void enterAliasAddress(String aliasAddress){
		
		log.info("claering the alias address field in Your Address section in CreateAccount page");
		wd.findElement(yourAddressaliasaddress).clear();
		
		log.info("Entering alias address in Your Address section in CreateAccount page");
		wd.findElement(yourAddressaliasaddress).sendKeys(aliasAddress);
		}
	
	/*
	 * This method will click on Register button in CreateAccount page
	 */
	public void clickRegister(){
		
		log.info("Clicking Register button in Create Account page");
		wd.findElement(Register).click();
	}
	
	
	
	/*
	 * Generic method enter data to fill the form in Create Account page
	 */
	
	public void userRegistrationTest(String firstName,String lastName,String mailaddress,String pwd,String day,String month,String year,String yourAddressFirstName,
			String yourAddressCompanyName,String primaryAddress,String secondaryAddress,String city,String state,String postalCode,String additionalInfo,
			String mobileNo,String aliasAddress) throws InterruptedException{
	
	verifyCreateAccountLabel();
	verifyPersonalInformationLabel();
    selectMrRadioButton();
    enterFirstName(firstName);
    enterLastName(lastName);
    enterEmailAddress(mailaddress);
    enterPassword(pwd);
    selectDayInDropDown(day);
    selectMonthInDropDown(month);
    selectYearInDropDown(year);
    signUpForNewsletter();
    verifyYourAddressLabel();
    enterYourAddressFirstName(yourAddressFirstName);
    enterCompanyName(yourAddressCompanyName);
    enterPrimaryAdddress(primaryAddress);
    enterSecondaryAddress(secondaryAddress);
    enterCity(city);
    enterState(state);
    enterPostalCode(postalCode);
    enterAdditionalInformation(additionalInfo);
    enterMobileNo(mobileNo);
    enterAliasAddress(aliasAddress);
   // createaccount.clickRegister();
	
	
	
	
	}
	
	
	}
	


