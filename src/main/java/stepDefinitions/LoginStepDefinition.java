package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinition {
    WebDriver driver;
    //WebDriver Manager;


       @Given("^user is on login page$")
        public void userIsOnLoginPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\avkin\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
        driver.manage().window().maximize();
        driver.findElement(By.id("Email")).sendKeys("vivekraoba@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Test@123");


        }

    @When("^user enters username and password and clicks login button$")
    public void userEntersUsernameAndPasswordAndClicksLoginButton() {
           driver.findElement(By.className("login-button")).click();
    }

    @Then("^user enters samsung and clicks search button$")
    public void userEntersSamsungAndClicksSearchButton() throws InterruptedException{
           driver.findElement(By.className("ui-autocomplete-input")).sendKeys("Samsung");
           Thread.sleep(1000);
           driver.findElement(By.className("search-box-button")).click();
    }
}
