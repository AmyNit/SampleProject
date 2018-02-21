package testScripts;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageActions.ProductDetailsPage;
import testBase.TestBase;

public class TC001_selectProducts extends TestBase{

	
public static final Logger log=Logger.getLogger(TC001_selectProducts.class.getName());


ProductDetailsPage productdetails;

@BeforeTest

public void setUp(){
	init();
	productdetails=new ProductDetailsPage(wd);
}
	
@Test

public void test() throws InterruptedException{
	
productdetails.selectProduct(productdetails.SONYKLV22P413D);
	
productdetails.selectProduct(productdetails.SONYKLV32R412D);	
	
	
	
	
}	
}
