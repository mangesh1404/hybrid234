package com.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.base.BaseClass;
import com.utilities.DriverUtils;

public class MyListener extends BaseClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		test= report.createTest(result.getName());		
	}
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Tetscase is passed");
	}
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Tetscase is failed");
		String path=DriverUtils.captureScreenshot(result.getName());
		test.addScreenCaptureFromPath(path);
	}
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Tetscase is Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {	
	}
	public void onStart(ITestContext context) {	
	}

	public void onFinish(ITestContext context) {
		report.flush();
	}

	
	
}
