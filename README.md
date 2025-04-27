This is a robust and scalable mobile automation testing framework using Appium, structured around the Page Object Model (POM) design pattern. It supports data-driven testing, centralized configuration, logging, and rich HTML reporting with ExtentReports
🚀 Features
  Page Object Model (POM) design
  Appium for mobile (Android/iOS) automation
  TestNG for test execution and grouping
  Data-driven testing using Excel
  Centralized config management with .properties files
  ExtentReports for beautiful HTML test reports
  Logging with Log4j
  Easy project scalability and maintenance


📁 Project Structure

 project-root/
│
├── src/
│   └── test/
│       └── java/
│           └── com/
│               └── appium/
│                   ├── pages/         # Page classes (UI locators + methods)
│                   ├── tests/         # All test case classes
│                   ├── testdata/      # Excel File
│                   └── utilities/     # Reusable utility classes (e.g., config reader, logger)
│
├── Configuration/                     # Properties files (e.g., config.properties, log4j.properties)
├── log/                               # Log output files
├── test-output/                       # TestNG & ExtentReports results
├── pom.xml                            # Maven dependencies and build config
├── testng.xml                         # TestNG suite configuration
└── extent-config.xml                  # ExtentReport appearance config


🧱 Package Breakdown

📦 com.appium.pages
Contains Page Object classes, each representing a screen in the app. These encapsulate element locators and related UI methods to promote reusability.

📦 com.appium.tests
Holds all test classes. Each class tests a specific functionality using the page methods.

📦 com.appium.testdata
Holds all testdata file like excel for performing the Data-Driven Testing

📦 com.appium.utilities
Utility classes used across the framework:
  ReadConfig.java – loads key-value pairs from .properties files
  XLUtils.java – handles Excel reading
  Reporting.java – ExtentReports setup and log methods

📂 Other Project Directories
  🛠️ Configuration/
      Stores config files such as:
          config.properties – Appium server URL, device name, platform, app package/activity, etc.
          log4j.properties – Logging setup
          
  📊 test-output/
      Generated after each run by TestNG and ExtentReports.

  🧾 log/
      Stores log files for test execution, helpful for debugging and CI visibility.

          
