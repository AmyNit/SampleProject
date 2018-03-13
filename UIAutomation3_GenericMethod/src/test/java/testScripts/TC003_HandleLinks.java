package testScripts;

import java.util.Iterator;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageActions.ProductDetailsPage;
import testBase.TestBase;

public class TC003_HandleLinks extends TestBase {
	public static final Logger log = Logger.getLogger(TC001_selectProducts.class.getName());

	ProductDetailsPage productdetails;

	@BeforeTest

	public void setUp() {
		init();
		productdetails = new ProductDetailsPage(wd);
	}

	@Test

	public void test() throws InterruptedException {

		ScrollDown();
		productdetails.clickFblink();

		Iterator<String> itr = getallWindows();

		String parentwindow = itr.next();
		String childwindow = itr.next();

		wd.switchTo().window(childwindow);

		boolean status = productdetails.verifynewwindowmsg();
		wd.switchTo().window(parentwindow);
		Assert.assertEquals(true, status);

	}

}
