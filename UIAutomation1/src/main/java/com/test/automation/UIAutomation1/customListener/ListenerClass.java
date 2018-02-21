package com.test.automation.UIAutomation1.customListener;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.test.automation.UIAutomation1.testBase.TestBase;

public class ListenerClass extends TestBase implements ITestListener{
	
	

	public void onTestStart(ITestResult arg0) {
		
	Reporter.log("Test started running   "+arg0.getMethod().getMethodName());	
		
	}

	public void onTestSuccess(ITestResult arg0) {
		Calendar calendar=Calendar.getInstance();
		SimpleDateFormat formater=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		
		String methodName=arg0.getName();
		Reporter.log("Test is success   "+arg0.getMethod().getMethodName());
		
		if(arg0.isSuccess()){
		File srcfile=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		
		try {
			
			String reportDirectory=new File(System.getProperty("user.dir")).getAbsolutePath()+"\\src\\main\\java\\com\\test\\automation\\UIAutomation1\\";
			File destfile=new File((String)reportDirectory+"success_screenshots\\"+methodName+"_"+formater.format(calendar.getTime())+".png");
			
			FileUtils.copyFile(srcfile, destfile);
			
			Reporter.log("<a href='"+destfile.getAbsolutePath()+"'><img src='"+destfile.getAbsolutePath()+"'height='100' width='100'/></a>");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
		
	}

	public void onTestFailure(ITestResult arg0) {


		Calendar calendar=Calendar.getInstance();
		SimpleDateFormat formater=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		
		String methodName=arg0.getName();
		Reporter.log("Test failed   "+arg0.getMethod().getMethodName());
		
		
		if(!arg0.isSuccess()){ 
		File srcfile=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		
		try {
			
			String reportDirectory=new File(System.getProperty("user.dir")).getAbsolutePath()+"\\src\\main\\java\\com\\test\\automation\\UIAutomation1\\";
			File destfile=new File((String)reportDirectory+"success_screenshots\\"+methodName+"_"+formater.format(calendar.getTime())+".png");
			
			FileUtils.copyFile(srcfile, destfile);
			
			Reporter.log("<a href='"+destfile.getAbsolutePath()+"'><img src='"+destfile.getAbsolutePath()+"'height='100' width='100'/></a>");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	}
	

	public void onTestSkipped(ITestResult arg0) {
	
		Reporter.log("Test is skipped"+arg0.getMethod().getMethodName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext arg0) {
	
		
		
	}

}
