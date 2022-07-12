package ru.dodopiza;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import static org.openqa.selenium.Keys.ENTER;

    public class StepDefenitions {
    public static final WebDriver webDriver;
    private static final Inc inc;



    static {
        System.setProperty("webDriver.chrome.driver", "/usr/local/bin/chromedriver");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        inc = new Inc(webDriver);
    }

    @Given("url of restaurant")
    public void UrlOfRestaurant() {
        inc.go();
    }

    @Then("chose city 'Москва'")
    public void ChoseCityMoscow() {
    inc.searchCity();
    }

    @And("click on basket")
    public void PutOnBasket() {
    inc.clickBascet();
    }


    @And("click to login to your account")
    public void ClickToLoginToYourAccount() {
        inc.clickAccount();
    }
    @And("keep a phone number")
    public void KeepPhoneNumber() {
        inc.phoneNumber();
    }
}


