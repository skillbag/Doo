import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LocatorTest {

    private WebDriver webDriver;
    @Before
    public void init() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }
    @Test
    public void locatorTest() {
        webDriver.navigate().to("https://www.aviasales.ru/search/MOW1507KJA17071?request_source=search_form&payment_method=all/");
        WebElement webElement = webDriver.findElement(By.id("destination"));
         webElement.sendKeys("Краснодар");
//       List<WebElement> list = webDriver.findElements(By.id("user_email211"));
//       list.get(0).sendKeys("test");
 //      System.out.println(list.size());

        webDriver.findElement(By.className("h_uOQxZa7wOkty3_3R18")).click();
    }

}