package com.appium.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.appium.pages.CalculatorPage;
import com.appium.utilities.XLUtils;

public class CalculatorDDT extends BaseClass {

	@Test
	public void Test_Case_01() throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/com/appium/testdata/CalculatorData.xlsx";
		logger.info("Get the Data from excel file");
		String num1 = XLUtils.getCellData(path, "Sheet1", 1, 1);
		String num2 = XLUtils.getCellData(path, "Sheet1", 1, 2);
		String expectedresult = XLUtils.getCellData(path, "Sheet1", 1, 3);
		CalculatorPage cal = new CalculatorPage(driver);
		logger.info("Adding Two Number");
		String actualresult = cal.addition(Integer.valueOf(num1), Integer.valueOf(num2));
		logger.info("Validate The Result");
		Assert.assertEquals(actualresult, expectedresult, "Addition Test Case failed");
	}

	@Test
	public void Test_Case_02() throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/com/appium/testdata/CalculatorData.xlsx";
		logger.info("Get the Data from excel file");
		String num1 = XLUtils.getCellData(path, "Sheet1", 2, 1);
		String num2 = XLUtils.getCellData(path, "Sheet1", 2, 2);
		String expectedresult = XLUtils.getCellData(path, "Sheet1", 2, 3);
		CalculatorPage cal = new CalculatorPage(driver);
		logger.info("Subtraction of Two Number");
		String actualresult = cal.subtraction(Integer.valueOf(num1), Integer.valueOf(num2));
		logger.info("Validate The Result");
		Assert.assertEquals(actualresult, expectedresult, "Subtraction Test Case failed");
	}

	@Test
	public void Test_Case_03() throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/com/appium/testdata/CalculatorData.xlsx";
		logger.info("Get the Data from excel file");
		String num1 = XLUtils.getCellData(path, "Sheet1", 3, 1);
		String num2 = XLUtils.getCellData(path, "Sheet1", 3, 2);
		String expectedresult = XLUtils.getCellData(path, "Sheet1", 3, 3);
		CalculatorPage cal = new CalculatorPage(driver);
		logger.info("Multiplication of Two Number");
		String actualresult = cal.multiplication(Integer.valueOf(num1), Integer.valueOf(num2));
		logger.info("Validate The Result");
		Assert.assertEquals(actualresult, expectedresult, "Multiplication Test Case failed");
	}

	@Test
	public void Test_Case_04() throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/com/appium/testdata/CalculatorData.xlsx";
		String num1 = XLUtils.getCellData(path, "Sheet1", 4, 1);
		String num2 = XLUtils.getCellData(path, "Sheet1", 4, 2);
		String expectedresult = XLUtils.getCellData(path, "Sheet1", 4, 3);
		CalculatorPage cal = new CalculatorPage(driver);
		logger.info("Division of Two Number");
		String actualresult = cal.division(Integer.valueOf(num1), Integer.valueOf(num2));
		logger.info("Validate The Result");
		Assert.assertEquals(actualresult, expectedresult, "Division Test Failed");
	}



}
