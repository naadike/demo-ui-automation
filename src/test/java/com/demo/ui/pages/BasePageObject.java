package com.demo.ui.pages;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;

import java.util.HashMap;
import java.util.Map;

public class BasePageObject {
    private static final Logger logger = Logger.getLogger(BasePageObject.class);

    private WebDriver driver;
    public static Map<String,Object> dataHolderMap = new HashMap<>();
    public BasePageObject(WebDriver driver){
        PropertyConfigurator.configure("log4j.properties");
        this.driver=driver;
    }


    // extent reports pending
//    public void logReport(Status status, String message){
//        ExtentReportUtil.
//
//    }


}
