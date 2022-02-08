package com.appiumautomation.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.appiumautomation.base.Base;
import com.appiumautomation.utilities.P1_HomePage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Ecommerce_test extends Base{
	
	@Test
	public void mySecondTest() throws IOException, InterruptedException 
	{
		AndroidDriver<AndroidElement> driver =capabilities();
		Thread.sleep(2000);
		//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Appium");
		
		P1_HomePage home= new P1_HomePage(driver);
		//home.nameField.sendKeys("appium");
		home.getNameField().sendKeys("appium");
		Thread.sleep(2000);
		
		driver.hideKeyboard();

		home.femaleOption.click();
		home.maleOption.click();

		home.dropDownClick.click();
	}
}
