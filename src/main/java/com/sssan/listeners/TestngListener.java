package com.sssan.listeners;

import java.lang.reflect.Method;
import java.util.List;

import org.testng.IAlterSuiteListener;
import org.testng.IAnnotationTransformer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.IDataProviderAnnotation;
import org.testng.xml.XmlSuite;

public class TestngListener implements ITestListener, IAnnotationTransformer, IAlterSuiteListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("I am on test start listener..");
	}

	@Override
	public void onTestSuccess(ITestResult result) {

	}

	@Override
	public void onTestFailure(ITestResult result) {

	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("I am on test finsish listener..");
	}

	@Override
	public void transform(IDataProviderAnnotation annotation, Method method) {
		boolean parallelFlag = true;
		annotation.setParallel(parallelFlag);
	}

	@Override
	public void alter(List<XmlSuite> suites) {
		System.out.println("This is dataprovider thread count "+ suites.get(0).getDataProviderThreadCount());
	}
}
