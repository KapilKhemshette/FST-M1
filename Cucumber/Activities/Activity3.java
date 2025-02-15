package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity3 {
	
	static WebDriver driver;
	static WebDriverWait wait;
	static Alert alert;
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
   
	
	@Given("^User is on the page$")
	public void user_is_on_the_page() {
		driver.get("https://training-support.net/webelements/alerts");
	    String title = driver.getTitle();
	    Assertions.assertEquals(title, "Selenium: Alerts");
	}

	@When("^User clicks the Simple Alert button$")
	public void user_clicks_the_simple_alert_button() {
	    driver.findElement(By.id("simple")).click();
	}
	
	@When("^User clicks the Confirm Alert button$")
	public void user_clicks_the_confirm_alert_button() {
	    driver.findElement(By.id("confirmation")).click();
	}

	@When("^User clicks the Prompt Alert button$")
	public void user_clicks_the_prompt_alert_button() {
	    driver.findElement(By.id("prompt")).click();	    
	}

	@Then("^Alert opens$")
	public void alert_opens() {
	    alert = driver.switchTo().alert();
	}

	@And("^Read the text from it and print it$")
	public void read_the_text_from_it_and_print_it() {
	    String alertText = alert.getText();
	    System.out.println(alertText);
	}
	
	@And("^Write a custom message in it$")
	public void write_a_custom_message_in_it() {
	    alert.sendKeys("Welcome to JAVA Training session");
	}


	@And("^Close the alert$")
	public void close_the_alert() {
	    alert.accept();
	}
	
	@And("^Close the alert with Cancel$")
	public void close_the_alert_with_cancel() {
	    alert.dismiss();
	}


	@And("^Read the result text$")
	public void read_the_result_text() {
		String text = driver.findElement(By.id("result")).getText();
	    System.out.println(text);
	}

	@And("^Close Browser$")
	public void close_browser() {
	   driver.close();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
