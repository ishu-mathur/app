package com.appium.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
Properties pro;
	
	public ReadConfig() {
		
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}catch(Exception e) {
			System.out.println("Exception is "+ e.getMessage());
		}
	}
	
	
	public String getPlatfromName() {
		String platformName = pro.getProperty("platformName");
		return platformName;
	}
	
	public String getdeviceName() {
		String deviceName = pro.getProperty("deviceName");
		return deviceName;
	}
	
	public String getplatformVersion() {
		String platformVersion = pro.getProperty("platformVersion");
		return platformVersion;
	}
	
	
	public String getautomationName() {
		String automationName = pro.getProperty("automationName");
		return automationName;
	}
	
	public String getappPackageCalculator() {
		String appPackageCalculator = pro.getProperty("appPackageCalculator");
		return appPackageCalculator;
	}
	
	public String getappActivityCalculator() {
		String appActivityCalculator = pro.getProperty("appActivityCalculator");
		return appActivityCalculator;
	}
	
	public String getappPackageDiale() {
		String appPackageDialer = pro.getProperty("appPackageDialer");
		return appPackageDialer;
	}
	
	public String getappActivityDialer() {
		String appActivityDialer = pro.getProperty("appActivityDialer");
		return appActivityDialer;
	}
	
	public String getnewCommandTimeout() {
		String newCommandTimeout = pro.getProperty("newCommandTimeout");
		return newCommandTimeout;
	}


}
