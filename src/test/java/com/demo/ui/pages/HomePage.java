package com.demo.ui.pages;

import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonObject{

    private static final Logger logger = Logger.getLogger(HomePage.class);
    private WebDriver driver;

    @FindBy(css = "#hf-account-flyout")
    private static WebElement accountButton;

    @FindBy(name = "Alerts")
    private static MobileElement alert;

    public HomePage(WebDriver driver){
        super(driver);
        PropertyConfigurator.configure("log4j.properties");
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void login(){
        accountButton.click();
    }

    public void basicTestApp(){
        alert.click();
    }
}
