package com.orion.whitemartProject.customListener;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.orion.whitemartProject.testBase.TestBase;

public class Listener extends TestBase implements ITestListener{

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		
		if(!result.isSuccess()){
			String userDirector=System.getProperty("user.dir");
			String customLocation="//src/test//java//com//orion//whitemartProject//screenshots//Screenshots.java";
			String failureImageFileName=userDirector+customLocation+new SimpleDateFormat("MM-dd-yyyy_HH_mm_ss").format(new GregorianCalendar().getTime())+"-"+result.getMethod().getMethodName()+".png";
		    File srcFile=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		    
		    /*
		     * copying FILE to a specific location,Here it is copied to failureImageFileName
		     */
		    try {
				FileUtils.copyFile(srcFile, new File(failureImageFileName));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		    
		    /*To attach the copy of screenchot to testNG report
		     * 
		     */
		    Reporter.log("<a href=\""+failureImageFileName+"\"><img src=\"file:////"+failureImageFileName+"\"alt=\"\""+"height='100' width='100'/>"+"<br/>");
		    Reporter.setCurrentTestResult(null);
		    Reporter.log(result.getName()+"----Test method failed!!!\n");
		}
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	
	
}
