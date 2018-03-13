package com.test.automation.uiautomation.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signInPage {

	public static final Logger log = Logger.getLogger(signInPage.class.getName());

	WebDriver wd;

	@FindBy(xpath = ".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signInButton;

	public signInPage(WebDriver wd) {

		this.wd = wd;
		PageFactory.initElements(wd, this);

	}

	public void clickSignIn() {

		log.info("clicking on signIn button and the object is:-" + signInButton.toString());

		signInButton.click();

	}

}
