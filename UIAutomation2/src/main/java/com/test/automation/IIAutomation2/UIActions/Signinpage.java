package com.test.automation.IIAutomation2.UIActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signinpage {

	public static final Logger log = Logger.getLogger(Signinpage.class.getName());

	public final String clothing = "Clothing";
	public final String newIn = "New In";

	WebDriver wd;

	@FindBy(xpath = "html/body/div[2]/ul/li[1]/a")
	WebElement womenButton;

	public Signinpage(WebDriver wd) {

		this.wd = wd;

		PageFactory.initElements(wd, this);

	}

	public void clickWomen() {

		womenButton.click();

	}

	public void clickOnNavigationMenu(String menuname) {

		log.info("clicking on " + menuname + " navigation menu");
		wd.findElement(By.xpath("//a[contains(text(),'" + menuname + "') and @aria-expanded='false']")).click();

	}

	public void clickOnNewIninClothing(String product) {

		log.info("clicking on " + product + " in clothing");
		wd.findElement(By
				.xpath("//a[contains(text(),'Clothing') and @aria-selected='true']/following-sibling::div/child::ul/child::li/child::a[contains(text(),'"
						+ product + "')]"));

	}

	public void clickOnNewIninShoes(String product) {

		log.info("clicking on " + product + " in clothing");
		wd.findElement(By
				.xpath("//a[contains(text(),'Clothing') and @aria-selected='true']/following-sibling::div/child::ul/child::li/child::a[contains(text(),"
						+ product + "')]"));

	}

}
