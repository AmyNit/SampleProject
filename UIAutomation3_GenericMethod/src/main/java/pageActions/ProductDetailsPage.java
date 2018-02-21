package pageActions;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class ProductDetailsPage extends TestBase {

	public static final Logger log = Logger.getLogger(ProductDetailsPage.class.getName());

	public final String SONYKLV32R412D = "SONY KLV-32R412D";
	public final String SONYKLV22P413D = "SONY KLV-22P413D";

	@FindBy(xpath = "//div[@class='category-products']/ul/li/div/div/a")
	List<WebElement> products;

	@FindBy(xpath = "html/body/footer/div[2]/div/div/div[3]/div/ul/li[1]/a")
	WebElement facebooklink;

	@FindBy(xpath = "html/body/footer/div[2]/div/div/div[3]/div/ul/li[2]/a")
	WebElement twitterlink;

	@FindBy(xpath = "html/body/footer/div[2]/div/div/div[3]/div/ul/li[3]/a")
	WebElement googleplus;
	
	@FindBy(xpath="html/body/header/div[2]/div/div[1]/a")
	WebElement newwindowmsg;

	public ProductDetailsPage(WebDriver wd) {
		this.wd = wd;
		PageFactory.initElements(wd, this);

	}

	public void selectProduct(String product) {

		waitForElement(30, wd.findElement(By.xpath("//a[contains(text(),'" + product + "')]")));

		System.out.println(wd.findElement(By.xpath("//a[contains(text(),'" + product + "')]")));
		wd.findElement(By.xpath("//a[contains(text(),'" + product + "')]")).click();
		log.info("clicked on " + product);

	}

	public List<WebElement> selectProduct() {

		List<WebElement> element = products;

		return element;
	}

	public void clickFblink() {
     
		facebooklink.click();
		log.info("clicked on fb link and object is:-"+facebooklink.toString());
	}

	public void clicktwitterlink() {

		twitterlink.click();
		log.info("clicked on twitterlink and object is :-"+twitterlink.toString());
	}

	public void clickGooglepluslink() {
 
		googleplus.click();
	    
		log.info("cliked on google plus link and object is :- "+googleplus.toString());
	}
	
	public boolean verifynewwindowmsg(){
		
		
		try {
			newwindowmsg.isDisplayed();
			
			log.info("new window msg is displayed and object is:-"+newwindowmsg.toString());
			return true;
		} catch (Exception e) {
		
			return false;
		}
		
	}
	
	
	
	
	
	
	

}
