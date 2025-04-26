package com.appium.tests;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.appium.utilities.ReadConfig;
import org.apache.log4j.PropertyConfigurator;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	AndroidDriver driver;
	ReadConfig readconfig = new ReadConfig();
	public static Logger logger;

	@BeforeTest
	public void setup() throws MalformedURLException {
		logger = Logger.getLogger("Appium");
		PropertyConfigurator.configure("./Configuration/Log4j.properties");
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("platformName", readconfig.getPlatfromName());
		capabilities.setCapability("appium:deviceName", readconfig.getdeviceName());
		capabilities.setCapability("appium:platformVersion", readconfig.getplatformVersion());
		capabilities.setCapability("appium:automationName", readconfig.getautomationName());
		capabilities.setCapability("appium:appPackage", readconfig.getappPackageCalculator());
		capabilities.setCapability("appium:appActivity", readconfig.getappActivityCalculator());
		capabilities.setCapability("appium:newCommandTimeout", 60);
		// capabilities.setCapability("appium:app", ""); // add .apk file path

		URL url = URI.create("http://127.0.0.1:4723/").toURL();

		driver = new AndroidDriver(url, capabilities);

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
