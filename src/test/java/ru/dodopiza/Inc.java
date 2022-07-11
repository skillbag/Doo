package ru.dodopiza;

import org.openqa.selenium.WebDriver;

public class Inc {
    
    private static final String url = "https://dodopizza.ru/";
    private final WebDriver webDriver;
    public Inc(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public void go(){
        webDriver.get(url);
    }
}
