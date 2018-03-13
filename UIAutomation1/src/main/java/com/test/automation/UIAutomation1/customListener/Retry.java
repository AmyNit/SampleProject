package com.test.automation.UIAutomation1.customListener;

import org.apache.log4j.Logger;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Retry implements IRetryAnalyzer {

	public static Logger log = Logger.getLogger(IRetryAnalyzer.class.getName());

	private int retryCount = 0;
	private int maxRetryCount = 2;

	public boolean retry(ITestResult result) {
		if (retryCount < maxRetryCount) {
			log("Retrying test " + result.getName() + " with status " + getResultStatusName(result.getStatus())
					+ " for the " + (retryCount + 1) + " time(s)");
			retryCount++;
			return true;
		}
		return false;
	}

	public String getResultStatusName(int status) {

		String resultName = null;

		if (status == 1)
			resultName = "SUCCESS";
		if (status == 2)
			resultName = "FAILURE";
		if (status == 3)
			resultName = "SKIP";
		return resultName;
	}

	public void log(String data) {

		log.info(data); // print in console,print in log file
		Reporter.log(data); // Reporter.log is a TestNG class which will data in
							// emailable report.html
	}

}
