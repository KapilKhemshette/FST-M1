
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/dynamic-content");
		System.out.println("Title of the page is " +driver.getTitle());
		
		WebElement click_me_button = driver.findElement(By.id("genButton"));		
		click_me_button.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text() = 'release']")));
		System.out.println("Printing word on console - " + driver.findElement(By.xpath("//h2[text() = 'release']")).getText());
		
		driver.close();
		
	}

}
