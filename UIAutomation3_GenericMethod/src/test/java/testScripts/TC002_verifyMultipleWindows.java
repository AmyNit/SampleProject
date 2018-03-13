package testScripts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageActions.ProductDetailsPage;
import testBase.TestBase;

public class TC002_verifyMultipleWindows extends TestBase {
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

		List<String> windowids = new ArrayList<String>();
		while (itr.hasNext()) {

			windowids.add(itr.next());
		}

		wd.switchTo().window(windowids.get(0));

	}

}
