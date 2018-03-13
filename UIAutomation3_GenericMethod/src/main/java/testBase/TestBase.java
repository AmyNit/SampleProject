package testBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class TestBase {
	public static final Logger log = Logger.getLogger(TestBase.class.getName());

	public WebDriver wd;
	public WebDriverWait wait;
	String url = "http://www.whitemart.in/entertainmant-appliences/led-tv.html";
	String browser = "firefox";

	public void init() {

		selectBrowser(browser);
		geturl(url);
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
		} else if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\drivers\\geckodriver.exe");
			wd = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("ie")) {

			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\drivers\\geckodriver.exe");
			wd = new InternetExplorerDriver();

		}

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

	public void ScrollDown() {

		JavascriptExecutor jse = (JavascriptExecutor) wd;

		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}

	public Iterator<String> getallWindows() {

		Set<String> windows = wd.getWindowHandles();
		Iterator<String> itr = windows.iterator();

		return itr;

	}

}
