import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearch {
    private WebDriver driver;

    @Given("user is on google page")
    public void browserIsOpen(){
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
    }


    @When("user enters 'skillfactory' in search box")
    public void userEntersAtextInSearchBox(){
    driver.findElement(By.name("q")).sendKeys("skillfactory");
    }

    @And("click on search button")
    public void hitsEnter(){
    driver.findElement(By.className("gNO89b")).click();
    }

    @Then("user is navigated to search results")
    public void userIsNavigatedToSearchResults(){
    driver.getPageSource().concat("Skillfactory");
   }
    @Then("click on sait 'skillfactory'")
            public void clickButtom(){
        driver.findElement(By.className("l")).click();
            }
}
