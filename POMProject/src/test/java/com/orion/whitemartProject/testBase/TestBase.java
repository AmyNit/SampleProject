package com.orion.whitemartProject.testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	
	public static WebDriver wd;
	public static Properties Repository=new Properties();
	
	public File f;
	public FileInputStream fis;
	
	
	public void init() throws IOException{
		loadPropertiesFile();
		selectBrowser(Repository.getProperty("browser"));
		wd.get(Repository.getProperty("url"));
	}
	
	/*
	 *This method loads property file
	 */
	public void loadPropertiesFile() throws IOException{
		
		f=new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\orion\\whitemartProject\\config\\config.properties");
		fis=new FileInputStream(f);
		Repository.load(fis);
		}
	
	/*
	 * This method initializes the browser object
	 */
	
	public WebDriver selectBrowser(String browser){
		if(browser.equals("firefox") || browser.equals("FIREFOX")){
			
			//System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\src\\test\\java\\com\\orion\\resources\\drivers\\geckodriver.exe");   
			WebDriver wd=new FirefoxDriver();
			
			wd.manage().window().maximize();
			return wd;
		}
		else if(browser.equals("chrome") || browser.equals("CHROME")){
		    System.out.println("chrome browser");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			
			wd=new ChromeDriver();
			wd.manage().window().maximize();
			return wd;
		}else if (browser.equals("ie") || browser.equals("IE")){
			wd=new InternetExplorerDriver();
			wd.manage().window().maximize();
			return wd;
	}
		return null;
		}
	
	/*
	 * This method tells browser to wait for 1 second
	 */
	public void waitFor(int sec) throws InterruptedException{
		
		Thread.sleep(sec*1000);
	}
	public void closeBrowser(){
		wd.quit();
	}
/*
 * Implicit wait method
 */
	public void explicitWait(WebElement element,int timeToWaitInSec){
		WebDriverWait wait=new WebDriverWait(wd,timeToWaitInSec);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}}
