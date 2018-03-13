package com.test.automation.uiautomation.testBase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static final Logger log=Logger.getLogger(TestBase.class.getName());

	public WebDriver wd;
	String url = "http://automationpractice.com/index.php";
	String browser = "firefox";

	public void init() {

		selectBrowser(browser);
		getUrl(url);
		String log4jConfPath="log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
	}

	public void selectBrowser(String browser) {

		if (browser.equalsIgnoreCase("firefox")) {

			System.getProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\drivers\\geckodriver.exe");
			log.info("creating object of"+browser);
			wd = new FirefoxDriver();
		}
	}

	public void getUrl(String url) {

		log.info("Navigating to"+url);
		wd.get(url);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	}

}
