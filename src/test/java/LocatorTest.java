import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTest {

    private WebDriver webDriver;
    @Before
    public void init() {
        WebDriverManager.chromedriver()
                .setup();
        webDriver = new ChromeDriver();
    }
    @Test
    public void locatorTest() {
        webDriver.navigate().to("https://https://github.com/skillbag");
        WebElement webElement = webDriver.findElement(By.className("repo"));
        webElement.sendKeys("test");
//        List<WebElement> list = webDriver.findElements(By.id("user_email"));
//        list.get(0).sendKeys("test");
//        System.out.println(list.size());
        webDriver.findElement(By.className("btn-mktg btn-primary-mktg width-full width-sm-auto")).click();
    }

}