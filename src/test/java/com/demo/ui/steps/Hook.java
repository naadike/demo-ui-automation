package com.demo.ui.steps;

import com.demo.ui.factory.BrowserFactory;
import com.demo.ui.pages.BasePageObject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;

public class Hook extends BaseBrowser{

    public static String testName;
    private BaseBrowser baseBrowser;

    public Hook(BaseBrowser baseBrowser){
        this.baseBrowser=baseBrowser;
    }

    @Before
    public void startUp(Scenario scenario) throws MalformedURLException {
        testName = scenario.getName();
        System.out.println("Starting scenarios execution: " +testName);
        baseBrowser.webDriver = BrowserFactory.getBrowser(System.getProperty("browser"));
//        BasePageObject.dataHolderMap.put("scenarioObject",scenario);
//        BasePageObject.dataHolderMap.put("webdriver",baseBrowser.webDriver);
    }

    @After
    public void tearDown(){
        System.out.println("Execution Completed");
        baseBrowser.webDriver.quit();
    }
}
