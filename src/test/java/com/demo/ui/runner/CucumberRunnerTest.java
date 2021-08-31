package com.demo.ui.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber"},
        features = {"src/test/resources/ui/features/dotcom/"},
        glue = {"com.demo.ui.steps"})
public class CucumberRunnerTest {
}
