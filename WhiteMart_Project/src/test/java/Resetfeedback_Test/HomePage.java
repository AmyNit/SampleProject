package Resetfeedback_Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends AbstractPage {
	
	public HomePage(WebDriver wd){
		
		super(wd);
	}
	public FeedbackPage clickOnFeedback(){
		
		List<WebElement> links=wd.findElements(By.tagName("a"));
		for(WebElement link:links){
			if(link.getText().equals("Feedback")){
				link.click();
				break;
			}}

	return new FeedbackPage(wd);
			
	}}
	


