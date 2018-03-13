package Resetfeedback_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResetPage extends AbstractPage {
	
	public ResetPage(WebDriver wd){
	super(wd);
}
	public String getConfirmationMessage(){
		
    return wd.findElement(By.className("feedbacks")).getText();
}}
