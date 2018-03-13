package com.orion.whitemartProject.pagelibrary;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MyAccountHomePage {

	WebDriver wd;
	static Logger log = Logger.getLogger(MyAccountHomePage.class.getName());

	public By myAccountHomeText = By.xpath(".//*[@id='center_column']/p");
	public By myAccountLabel = By.xpath(".//*[@id='center_column']/h1");

	public MyAccountHomePage(WebDriver wd) {

		this.wd = wd;
	}

	public boolean verifyRegistrationMsg() {

		String msg = wd.findElement(myAccountHomeText).getText();

		if (msg.contains("Welcome to your account. Here you can manage all of your personal information and orders.")) {

			return true;
		} else {

			return false;
		}
	}

}
