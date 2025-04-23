package com.appium.tests;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	AndroidDriver driver;

	@BeforeTest
	public void setup() throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("deviceName", "Motorole moto g64 5G");
		capabilities.setCapability("udid", "");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("automationName", "uiautomator2");
		capabilities.setCapability("platformversion", "15");
		capabilities.setCapability("appium:newCommandTimeout", 60);
		//capabilities.setCapability("app", ""); // add .apk file path
		capabilities.setCapability("appPackage", "com.google.android.calculator");
		capabilities.setCapability("appActivity", "");

		URL url = URI.create("").toURL();

		driver = new AndroidDriver(url, capabilities);

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
