
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://training-support.net/webelements/popups");
		System.out.println("Title of the page: " +driver.getTitle());
		
		driver.findElement(By.id("launcher")).click();
		
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("username"))));
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		
		driver.findElement(By.xpath("//button[text() = 'Submit']")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.tagName("h1"))));
		String message = driver.findElement(By.tagName("h1")).getText();
		System.out.println(message);
		
		driver.close();
		

	}

}
