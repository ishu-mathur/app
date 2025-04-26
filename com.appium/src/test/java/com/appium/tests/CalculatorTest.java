package com.appium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.appium.pages.CalculatorPage;

public class CalculatorTest extends BaseClass {
	
	@Test
	public void Test_Case_01() {
		logger.info("Running TestCase 01 ");
		CalculatorPage cal = new CalculatorPage(driver);
		logger.info("Adding Two Number");
		String result = cal.addition(8,2);
		logger.info("Validation of result");
		if (result.equals("10")) {
			Assert.assertTrue(true);
			logger.info("Addition TestCase Passed");
		}
		else {
			Assert.assertTrue(false);
			logger.warn("Addtion Test Case is Failed");
		}
	}
	
	
	@Test
	public void Test_Case_02() {
		logger.info("Running TestCase 02 ");
		CalculatorPage cal = new CalculatorPage(driver);
		logger.info("Subtraction of Two Number");
		String result = cal.subtraction(8,2);
		logger.info("Validation of result");
		if (result.equals("6")) {
			Assert.assertTrue(true);
			logger.info("Subtraction TestCase Passed");
		}
		else {
			Assert.assertTrue(false);
			logger.warn("Subtraction Test Case is Failed");
		}
	}
	
	
	@Test
	public void Test_Case_03() {
		logger.info("Running TestCase 03 ");
		CalculatorPage cal = new CalculatorPage(driver);
		logger.info("Muliplication of Two Number");
		String result = cal.multiplication(8,2);
		logger.info("Validation of result");
		if (result.equals("16")) {
			Assert.assertTrue(true);
			logger.info("Multiplication TestCase Passed");
		}
		else {
			Assert.assertTrue(false);
			logger.warn("Multiplication TestCase Failed");
		}
	}
	
	
	@Test
	public void Test_Case_04() {
		logger.info("Running TestCase 04");
		CalculatorPage cal = new CalculatorPage(driver);
		logger.info("Muliplication of Two Number");
		String result = cal.division(8,2);
		logger.info("Validation of result");
		if (result.equals("4")) {
			Assert.assertTrue(true);
			logger.info("Division TestCase Passed");
		}
		else {
			Assert.assertTrue(false);
			logger.warn("Division TestCase Failed");
		}
	}

}
