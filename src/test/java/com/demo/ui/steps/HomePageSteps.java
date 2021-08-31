package com.demo.ui.steps;

import com.demo.ui.pages.HomePage;
import com.demo.util.TestDataProvider;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class HomePageSteps {

    public WebDriver driver;
    public HomePage homePage;

    public HomePageSteps(BaseBrowser baseBrowser){
        this.driver= baseBrowser.webDriver;
        homePage = new HomePage(this.driver);
    }

    @Given("^User navigates to HomePage$")
    public void userOpensWalmartPage(){
        System.out.println("Navigate to HomePage ");
        driver.navigate().to(TestDataProvider.TestData.HOME_URL_PATTERN.val());
    }


    @When("^User Clicks Account Button in HomePage$")
    public void loginStep(){
        homePage.login();
    }

    @When("User performs basic ops in the app")
    public void basicTestApp(){
        homePage.basicTestApp();
    }

}
