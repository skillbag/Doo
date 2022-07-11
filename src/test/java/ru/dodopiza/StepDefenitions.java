package ru.dodopiza;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.openqa.selenium.Keys.ENTER;

public class StepDefenitions {
    public static final WebDriver webDriver;
    private static String url = "https://dodopizza.ru/";



    static {
        System.setProperty("webDriver.chrome.driver", "/usr/local/bin/chromedriver");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
    @Given("url of restaurant")
    public void UrlOfRestaurant() {
        webDriver.get(url);
    }

    @Then("chose city 'Москва'")
    public void ChoseCityMoscow() {
        webDriver.findElement(By.className("locality-selector-popup__search-input")).sendKeys("Москва", ENTER);
    }
    @And("assert that chose city is 'Москва'")
    public void AssertThatChoseCityIsMoscow(String expected) {
        final var actual = webDriver.findElement(By.id("header__about-slogan-text_link")).getText();
        assertEquals(expected, actual);
    }

    @Then("chose city 'Балтимор'")
    public void ChoseCityIsBaltimor () {
        webDriver.findElement(By.className("locality-selector-popup__search-input")).sendKeys("Балтимор", ENTER);

    }

    @And("assert that user got message 'Пиццерия в этом городе еще не открылась'")
    public void AssertThatUserGotMessage (String error) {
        final var actual =  webDriver.findElement(By.className("locality-selector-popup__table-empty-text")).getText();
        assertEquals(error, actual);
    }
    }




