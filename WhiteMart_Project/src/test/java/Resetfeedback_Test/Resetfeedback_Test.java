package Resetfeedback_Test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Resetfeedback_Test extends AbstractWebDriverTest {
	
	@Before
	
	public void testsetup(){
		
		onHomePage.navigatetoWebApp();
	}
	
	@Test
	
public void test(){
		
		FeedbackPage onFeedbackPage=onHomePage.clickOnFeedback();
		ResetPage onResetPage=onFeedbackPage.filldata().ResetPage();
		Assert.assertTrue(onResetPage.getConfirmationMessage().contains("Feedback"));
	}}
