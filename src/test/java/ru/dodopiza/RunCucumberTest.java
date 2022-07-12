package ru.dodopiza;

import io.cucumber.core.backend.StepDefinition;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
    @CucumberOptions(features = "classpath:features")
    public class RunCucumberTest {
    @AfterClass
    public static void finalizeResources(){
    StepDefenitions.webDriver.close();
}
    }

