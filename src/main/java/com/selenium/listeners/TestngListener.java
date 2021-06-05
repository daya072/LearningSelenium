package com.selenium.listeners;

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

	}

	@Override
	public void transform(IDataProviderAnnotation annotation, Method method) {
		annotation.setParallel(true);
	}

	@Override
	public void alter(List<XmlSuite> suites) {
		System.out.println("This is dataprovider thread count "+ suites.get(0).getDataProviderThreadCount());
	}
}
