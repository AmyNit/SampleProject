package Resetfeedback_Test;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
	
	protected WebDriver wd;
	public AbstractPage(WebDriver wd){
		
		this.wd=wd;
	}
	public WebDriver getDriver(){
		return wd;
	}
	public HomePage navigatetoWebApp(){
		
		wd.navigate().to("http://www.whitemart.in/Home.aspx");
		
		return new HomePage(wd);
		
	}}
