package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity2 {
	
	static WebDriver driver;
	static WebDriverWait wait;
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
//	
	@Given("^User is on Login page$")
	public void user_is_on_login_page() {
//		WebDriverManager.chromedriver().setup();
		
		driver.get("https://training-support.net/webelements/login-form");	 
		Assertions.assertEquals(driver.getTitle(), "Selenium: Login Form");
	}

	@When("^User enters username and password$")
	public void user_enters_username_and_password() {
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//*[text()='Submit']")).click();
	   
	}

	@Then("^Read the page title and confirmation message$")
	public void read_the_page_title_and_confirmation_message() {
		 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("action-confirmation")));
	        String pageTitle = driver.getTitle();
	        String confirmMessage = driver.findElement(By.id("action-confirmation")).getText();

	        System.out.println("Page title is: " + pageTitle);
	        System.out.println("Login message is: " + confirmMessage);
	        
	        if(confirmMessage.contains("admin")) {
	            Assert.assertEquals(confirmMessage, "Welcome Back, admin");
	        } else {
	            Assert.assertEquals(confirmMessage, "Invalid Credentials");
	        }
	}

	@And("^Close the Browser$")
	public void close_the_browser() {
		driver.close();
	  
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
