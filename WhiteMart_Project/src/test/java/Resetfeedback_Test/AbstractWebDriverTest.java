package Resetfeedback_Test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbstractWebDriverTest {
	
	protected WebDriver wd;
    protected HomePage onHomePage;
    
    @Before
    
    public void setup(){
    	
    	wd=new FirefoxDriver();
    	onHomePage=new HomePage(wd);
    	}
   
    @After
    
    public void shutdown()
    
    {
    	wd.close();
    	
    }
    
}
