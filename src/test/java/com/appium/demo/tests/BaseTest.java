package com.appium.demo.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.appium.demo.utilities.*;

import java.net.MalformedURLException;

public class BaseTest {

    @BeforeMethod
    public void startDriver() throws MalformedURLException {
       DriverHandler.initiateDriver();
    }
    @AfterMethod
    public void tearDown(){
        DriverHandler.quitDriver();
    }
}
