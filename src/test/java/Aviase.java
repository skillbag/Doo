
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Aviase {
    private WebDriver webDriver;
    @BeforeClass
    public void avia(){
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("https://www.aviasales.ru/search/MOW1507KJA17071?request_source=search_form&payment_method=all");
    }
    @Test
    public void avias(){
        webDriver.manage().timeouts().implicitlyWait(1, SECONDS);
        webDriver.findElement(By.className("gXq4lcPaRs5UPkGeU8wU")).click();
    }
    @Test
    public  void avias1() {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.className("price_85d2b9c")));

    }

            @AfterClass
            public void CloseAvia() {
                //     webDriver.quit();
            }
        }
