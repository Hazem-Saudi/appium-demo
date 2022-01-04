package com.appium.demo.tests;

import com.appium.demo.pages.HomePage;
import com.appium.demo.utilities.DriverHandler;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class OpenAppTest extends BaseTest {
    HomePage homePageObject;

    @Test
    public void openAppHappyScenario() throws InterruptedException {
        homePageObject = new HomePage(DriverHandler.getDriver());
        Thread.sleep(5000);
        homePageObject.setTextBox("Appium Demo");
        Thread.sleep(10000);

    }
}
