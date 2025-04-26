package com.appium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class CalculatorPage {
	
	AndroidDriver driver;
	
	public CalculatorPage(AndroidDriver d) {
		driver = d;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id ="com.google.android.calculator:id/digit_0")
	WebElement digit0;
	
	@FindBy(id ="com.google.android.calculator:id/digit_1")
	WebElement digit1;
	
	@FindBy(id ="com.google.android.calculator:id/digit_2")
	WebElement digit2;
	
	@FindBy(id ="com.google.android.calculator:id/digit_3")
	WebElement digit3;
	
	@FindBy(id ="com.google.android.calculator:id/digit_4")
	WebElement digit4;
	
	@FindBy(id ="com.google.android.calculator:id/digit_5")
	WebElement digit5;
	
	@FindBy(id ="com.google.android.calculator:id/digit_6")
	WebElement digit6;
	
	@FindBy(id ="com.google.android.calculator:id/digit_7")
	WebElement digit7;
	
	@FindBy(id ="com.google.android.calculator:id/digit_8")
	WebElement digit8;
	
	@FindBy(id ="com.google.android.calculator:id/digit_9")
	WebElement digit9;
	
	@FindBy(id="com.google.android.calculator:id/eq")
	WebElement equal;
	
	@FindBy(id="com.google.android.calculator:id/op_mul")
	WebElement multiplication;
	
	@FindBy(id="com.google.android.calculator:id/op_add")
	WebElement addition;
	
	@FindBy(id="com.google.android.calculator:id/op_sub")
	WebElement subtraction;
	
	@FindBy(id="com.google.android.calculator:id/op_div")
	WebElement division;
	
	@FindBy(id="com.google.android.calculator:id/result_final")
	WebElement result;
	
	
	
    private void enterNumber(int number) {
        char[] digits = String.valueOf(number).toCharArray();
        for (char digit : digits) {
            switch (digit) {
                case '0': digit0.click(); break;
                case '1': digit1.click(); break;
                case '2': digit2.click(); break;
                case '3': digit3.click(); break;
                case '4': digit4.click(); break;
                case '5': digit5.click(); break;
                case '6': digit6.click(); break;
                case '7': digit7.click(); break;
                case '8': digit8.click(); break;
                case '9': digit9.click(); break;
            }
        }
    }
	
	
    public String addition(int a , int b) {
    	enterNumber(a);
    	addition.click();
    	enterNumber(b);
    	equal.click();
    	return result.getText();
    }
	
    
    public String multiplication(int a , int b) {
    	enterNumber(a);
    	multiplication.click();
    	enterNumber(b);
    	equal.click();
    	return result.getText();
    }
	

    public String subtraction(int a , int b) {
    	enterNumber(a);
    	subtraction.click();
    	enterNumber(b);
    	equal.click();
    	return result.getText();
    }
    
    
    public String division(int a , int b) {
    	enterNumber(a);
    	division.click();
    	enterNumber(b);
    	equal.click();
    	return result.getText();
    }

}
