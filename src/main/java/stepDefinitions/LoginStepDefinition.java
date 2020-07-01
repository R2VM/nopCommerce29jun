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
        public void userIsOnLoginPage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\avkin\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        driver.findElement(By.id("Email")).sendKeys("test1@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Test@123");
        Thread.sleep(1000);


        }

    @When("^user enters username and password and clicks login button$")
    public void userEntersUsernameAndPasswordAndClicksLoginButton() {
           driver.findElement(By.className("login-button")).click();
           driver.navigate().refresh();
    }

    @Then("^user enters samsung and clicks search button$")
    public void userEntersSamsungAndClicksSearchButton() throws InterruptedException{
           driver.findElement(By.className("ui-autocomplete-input")).sendKeys("Apple");
           Thread.sleep(1000);
           driver.findElement(By.className("search-box-button")).click();
           Thread.sleep(1000);
    }

   // @Then("^user clicks on Add to Cart button$")
    //public void userClicksOnAddToCartButton() {
      //     driver.findElement(By.className("product-box-add-to-cart-button")).click();
   // }

   // @Then("^user navigates to Shopping cart and click on Goto cart button$")
   // public void userNavigatesToShoppingCartAndClickOnGotoCartButton() {
           //driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]"));
          // driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-4\"]")).click();
   // }
}
