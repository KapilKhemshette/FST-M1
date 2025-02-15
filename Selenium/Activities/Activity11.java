import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		driver.get("https://training-support.net/webelements/dynamic-controls");
		String title = driver.getTitle();
		System.out.println("Title of the page " + title);
		
		WebElement checkbox_element = driver.findElement(By.id("checkbox"));
		WebElement toggle_checkbox = driver.findElement(By.xpath("//*[text() = 'Toggle Checkbox']"));
		
		
		toggle_checkbox.click();
		wait.until(ExpectedConditions.invisibilityOf(checkbox_element));
		assert !checkbox_element.isDisplayed();
		System.out.println("Checkbox is disappeared");
		
		toggle_checkbox.click();
		wait.until(ExpectedConditions.visibilityOf(checkbox_element));
		assert checkbox_element.isDisplayed();
		System.out.println("Checkbox is appeared");
		checkbox_element.click();
		System.out.println("Check box is selected - " + checkbox_element.isSelected());
		
		driver.quit();
	}

}
