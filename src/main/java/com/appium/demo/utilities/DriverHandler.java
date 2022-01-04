package com.appium.demo.utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;


public class DriverHandler {
    static AppiumDriver driver;

    public static DesiredCapabilities setCaps(List<String> capsKeys, List<String> capsValues) {
        DesiredCapabilities caps = new DesiredCapabilities();
        for (int i =0;i<Constants.CAPS_KEYS.size();i++)
        {
            caps.setCapability(capsKeys.get(i), capsValues.get(i));
        }
        return caps;
    }

    public static void initiateDriver() throws MalformedURLException {
        driver = new AndroidDriver(new URL(Constants.URL)
                , setCaps(Constants.CAPS_KEYS, Constants.CAPS_VALUES));
    }

    public static AppiumDriver getDriver(){
        return driver;
    }

    public static void quitDriver(){
        driver.quit();
    }
}
