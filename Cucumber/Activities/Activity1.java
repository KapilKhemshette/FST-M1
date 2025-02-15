package stepDefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity1 {
		
	static WebDriver driver;
	static WebDriverWait wait;
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	
	@Given("^User is on Google Home Page$")
	public void user_is_on_google_home_page() {
		driver.get("https://www.google.com/");
	    String title = driver.getTitle();
	    Assertions.assertEquals(title, "Google", "Title is not correct. Opened different screen");
	}

	@When("^User types in Cheese and hits ENTER$")
	public void user_types_in_cheese_and_hits_enter() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class ='gLFyf']")));
		driver.findElement(By.xpath("//*[@class ='gLFyf']")).sendKeys("Java", Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logo")));
		Assertions.assertEquals(driver.getTitle(), "Java - Google Search", "Incorrect search result");
	    
	}

	@Then("^Show how many search results were shown$")
	public void show_how_many_search_results_were_shown() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logo")));
		Thread.sleep(5000);
		String resultStats = driver.findElement(By.id("result-stats")).getText();
        System.out.println("Number of results found: " + resultStats);
	}

	@And("^Close the browser$")
	public void close_the_browser() {
	    driver.close();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}


}
