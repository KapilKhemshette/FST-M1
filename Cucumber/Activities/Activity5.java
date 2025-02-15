//package stepDefinitions;
//
//import java.time.Duration;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import io.cucumber.java.After;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Activity5 {
//	
//	    static WebDriver driver;
//	    static WebDriverWait wait;
//	    
////	    @Given("^User is on Login page$")
////	    public void loginPage() {
////	        driver = new ChromeDriver();
////	        driver.manage().window().maximize();
////	        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
////	        driver.get("https://training-support.net/webelements/login-form");
////	    }
//
////	    @When("User enters {string} and {string}")
////	    public void user_enters_and(String username, String password) {
////	        driver.findElement(By.id("username")).sendKeys(username);
////	        driver.findElement(By.id("password")).sendKeys(password);
////	        driver.findElement(By.xpath("//button[@type='submit']")).click();
////	    }
//	    
////	    @Then("^Read the page title and confirmation message$")
////	    public void readTitleAndHeading() {
////	        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("action-confirmation")));
////	        String pageTitle = driver.getTitle();
////	        String confirmMessage = driver.findElement(By.id("action-confirmation")).getText();
////
////	        System.out.println("Page title is: " + pageTitle);
////	        System.out.println("Login message is: " + confirmMessage);
////	        
////	        if(confirmMessage.contains("admin")) {
////	            Assert.assertEquals(confirmMessage, "Welcome Back, admin");
////	        } else {
////	            Assert.assertEquals(confirmMessage, "Invalid Credentials");
////	        }
////	    }
////	    
////	    @And("^Close the Browser$")
////	    public void closeBrowser() {
////	        driver.close();
////	    }
//
//	    @After
//	    public void tearDown() {
//	    	driver.quit();
//	    }
//	
//
//}
