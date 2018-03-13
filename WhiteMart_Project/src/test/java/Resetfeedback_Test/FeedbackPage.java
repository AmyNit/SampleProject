package Resetfeedback_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FeedbackPage extends AbstractPage {
	
	public FeedbackPage(WebDriver wd){
	super(wd);

}
	public FeedbackPage filldata(){
		
		wd.findElement(By.id("txtname1")).clear();
		wd.findElement(By.id("txtname1")).sendKeys("Amy");
		wd.findElement(By.id("txtmail")).clear();
		wd.findElement(By.id("txtmail")).sendKeys("amruthapb2@gmail.com");
		wd.findElement(By.id("txtcomments")).clear();
		wd.findElement(By.id("txtcomments")).sendKeys("Good Service");
		return new FeedbackPage(wd);
	}
	public ResetPage ResetPage(){
		

		wd.findElement(By.id("lnkreset")).click();
		return new ResetPage(wd);
		
}}
