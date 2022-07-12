package ru.dodopiza;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.Keys.ENTER;



public class Inc {
    
    private static final String url = "https://dodopizza.ru/";
    private static final String searchcity = "locality-selector-popup__search-input";
    private static final String clickbasket = "//*[@id=\"react-app\"]/nav/div/div[2]/button";
    private static final String clickaccount = "//*[@id=\"react-app\"]/header/div[2]/button";
    private static final String phonenumber = "phn-input";
    private final WebDriver webDriver;
    public Inc(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void go(){
        webDriver.get(url);
    }
    public void searchCity(){
        webDriver.findElement(By.className(searchcity)).sendKeys("Москва", ENTER);
    }
    public void clickBascet(){
        webDriver.findElement(By.xpath(clickbasket)).click();
    }
    public  void clickAccount(){
        webDriver.findElement(By.xpath(clickaccount)).click();
    }
    public void phoneNumber() {
        webDriver.findElement(By.id(phonenumber)).sendKeys(ENTER);
    }
    }





