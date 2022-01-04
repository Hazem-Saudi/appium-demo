package com.appium.demo.utilities;

import java.util.Arrays;
import java.util.List;

public class Constants {
    public static final List<String> CAPS_KEYS = Arrays.asList("platformName", "platformVersion","deviceName"
            ,"app","noReset");
    public static final List<String> CAPS_VALUES = Arrays.asList("Android", "10","Pixel 3a API 29"
            ,System.getProperty("user.dir")+"\\src\\main\\resources\\selendroid-test-app-0.17.0.apk","true");
    public static final String URL ="http://localhost:4723/wd/hub";

}
