package stepDefinitions;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Activity4 {
	
	
	static WebDriver driver;
	static WebDriverWait wait;
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Given("^User is on admin Login page$")
	public void user_on_login_page() {
		driver.get("https://training-support.net/webelements/login-form");
		String title = driver.getTitle();
		Assertions.assertEquals(driver.getTitle(), "Selenium: Login Form");
		System.out.println(title);
	}
	
	@When("User enters {string} and {string}")
	public void enter_username_password(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[text()='Submit']")).click();
	}
	
//	@Then("page title read and confirmation message")
//	public void read_title_confirm_message() {
//	       wait.until(ExpectedConditions.titleContains("Login Success"));
//		   wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.tagName("h1"))));
//		   String title = driver.getTitle();
//		   Assertions.assertEquals(title, "Selenium: Login Success!");
//		   Assertions.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Login Success!", "Logged In Successfully");
//		   System.out.println(title);
//		   System.out.println(driver.findElement(By.tagName("h1")).getText());
//	}
//	
//	@And("^Close all Browser$")
//	public void close_browser() {
//		driver.close();
//	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	

}
