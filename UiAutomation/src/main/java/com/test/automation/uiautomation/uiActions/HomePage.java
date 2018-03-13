package com.test.automation.uiautomation.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public static final Logger log = Logger.getLogger(HomePage.class.getName());
	WebDriver wd;

	@FindBy(xpath = ".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signIn;

	@FindBy(xpath = ".//*[@id='email']")
	WebElement loginEmailAddress;

	@FindBy(xpath = ".//*[@id='passwd']")
	WebElement password;

	@FindBy(id = "SubmitLogin")
	WebElement submitButton;

	@FindBy(xpath = ".//*[@id='center_column']/div[1]/ol/li")
	WebElement authenticationFailed;

	@FindBy(xpath = ".//*[@id='center_column']/div[1]/ol/li")
	WebElement authenticationfailed;

	public HomePage(WebDriver wd) {

		PageFactory.initElements(wd, this);

	}

	public void loginToApplication(String email, String pwd) {

		log.info("clicking in SignIn and object is:-" + signIn.toString());
		signIn.click();

		log.info("Entering email address:-" + email + " Object is:-" + loginEmailAddress.toString());
		loginEmailAddress.sendKeys(email);

		log.info("Entering password:-" + pwd + "object is:-" + password.toString());
		password.sendKeys(pwd);

		log.info("clicking on submit button and object is:-" + submitButton.toString());
		submitButton.click();

	}

	public String verifyErrormsgonInvalidLogin() {

		log.info("error message:-" + authenticationfailed.getText());
		return authenticationfailed.getText();
	}

}
