package com.test.automation.UIAutomation1.testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.test.automation.UIAutomation1.customListener.ListenerClass;
import com.test.automation.UIAutomation1.customListener.WebEventListener;
import com.test.automation.UIAutomation1.excelReader.ExcelReader;

public class TestBase {

	public static final Logger log = Logger.getLogger(TestBase.class.getName());

	public WebDriver wd;
	public WebDriverWait wait;
	
	String url = "http://automationpractice.com/index.php";
	String browser = "firefox";
	ExcelReader excel;
	public Properties prop1 = new Properties();
	
	public EventFiringWebDriver driver;
	public WebEventListener eventListener;

	public static ExtentReports extent;
	public static ExtentTest test;
	public ITestResult result;

	

	public EventFiringWebDriver getDriver() {

		return driver;
	}

	public void setDriver(EventFiringWebDriver driver) {

		this.driver = driver;
	}

	public void init() throws IOException {

		loadORProperties();

		extent = new ExtentReports(System.getProperty("user.dir")
				+ "\\src\\main\\java\\com\\test\\automation\\UIAutomation1\\report\\test.html", false);

		selectBrowser(prop1.getProperty("browser"));
		geturl(prop1.getProperty("url"));
		String log4jConfPath = "log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
	}

	public void geturl(String url) {

		log.info("Navigating to " + url);

		wd.get(url);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	public void selectBrowser(String browser) {

		if (browser.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\drivers\\geckodriver.exe");
			wd = new FirefoxDriver();

			driver = new EventFiringWebDriver(wd); // EventFiringWebDriver will
													// help to register
													// WebEventListener
			eventListener = new WebEventListener();
			driver.register(eventListener);

		} else if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\drivers\\geckodriver.exe");
			wd = new ChromeDriver();

			driver = new EventFiringWebDriver(wd); // EventFiringWebDriver will
													// help to register
													// WebEventListener
			eventListener = new WebEventListener();
			driver.register(eventListener);

		} else if (browser.equalsIgnoreCase("ie")) {

			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\drivers\\geckodriver.exe");
			wd = new InternetExplorerDriver();

			driver = new EventFiringWebDriver(wd); // EventFiringWebDriver will
													// help to register
													// WebEventListener
			eventListener = new WebEventListener();
			driver.register(eventListener);

		}

	}

	public String[][] getData(String excelname, String sheetname) {

		String path = System.getProperty("user.dir") + "\\src\\main\\java\\com\\test\\automation\\UIAutomation1\\data\\"
				+ excelname;
		excel = new ExcelReader(path);

		String[][] data = excel.getDataFromSheet(sheetname, excelname);

		return data;

	}

	public void waitForElement(int sec, WebElement element) {

		wait = new WebDriverWait(wd, sec);

		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public void takeScreenshot(String name) {

		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");

		File srcfile = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);

		try {

			String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath()
					+ "\\src\\main\\java\\com\\test\\automation\\UIAutomation1\\screenshot\\";
			File destfile = new File(
					(String) reportDirectory + name + "_" + formater.format(calendar.getTime()) + ".png");

			FileUtils.copyFile(srcfile, destfile);

			Reporter.log("<a href='" + destfile.getAbsolutePath() + "'><img src='" + destfile.getAbsolutePath()
					+ "'height='100' width='100'/></a>");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void loadORProperties() throws IOException {

		File file = new File(System.getProperty("user.dir")
				+ "\\src\\main\\java\\com\\test\\automation\\UIAutomation1\\config\\or.properties");
		FileInputStream fis = new FileInputStream(file);
		prop1.load(fis);
	}

	public void getResult(ITestResult result) {

		if (result.getStatus() == ITestResult.SUCCESS) {

			test.log(LogStatus.PASS, result.getName(), "test passed");
		} else if (result.getStatus() == ITestResult.SKIP) {

			test.log(LogStatus.SKIP, result.getName(), "test is skipped and skip reason is:-" + result.getThrowable());
		} else if (result.getStatus() == ITestResult.FAILURE) {

			test.log(LogStatus.ERROR, result.getName(), "test failed:-" + result.getThrowable());
			test.log(LogStatus.FAIL,test.addScreenCapture(captureScreen("")));
		} else if (result.getStatus() == ITestResult.STARTED) {

			test.log(LogStatus.INFO, result.getName(), "test started");
		}

	}
	
	public String captureScreen(String fileName) {

		if(fileName==""){
			fileName="blank";
		}
		
		File destfile=null;
		
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");

		File srcfile = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);

		try {

			String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath()
					+ "\\src\\main\\java\\com\\test\\automation\\UIAutomation1\\screenshot\\";
			destfile = new File(
					(String) reportDirectory + fileName + "_" + formater.format(calendar.getTime()) + ".png");

			FileUtils.copyFile(srcfile, destfile);

			Reporter.log("<a href='" + destfile.getAbsolutePath() + "'><img src='" + destfile.getAbsolutePath()
					+ "'height='100' width='100'/></a>");

		} catch (IOException e) {
			e.printStackTrace();
		}
		return destfile.toString();

	}
	
	
	@AfterMethod()
	
	public void afterMethod(){
		
		getResult(result); // check whether method passed, failed or skipped
		
	}
	
	@BeforeMethod()
	
	public void beforeMethod(Method result){
		
		test=extent.startTest(result.getName());  // gives the name of method
		test.log(LogStatus.INFO, result.getName()+"test started");	
	}
	
	@AfterClass(alwaysRun=true)
	
	public void endTest(){
		closeBrowser();
	}
public void closeBrowser(){
		
		wd.quit();
		log.info("browser closed");
		extent.endTest(test);
		extent.flush();
	}


}