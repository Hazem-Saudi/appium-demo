package com.appium.demo.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(AppiumDriver driver) {
        super(driver);
    }
    @FindBy(id = "io.selendroid.testapp:id/my_text_field")
    WebElement textBox;

    public void setTextBox(String input){
        textBox.sendKeys(input);
    }

}
