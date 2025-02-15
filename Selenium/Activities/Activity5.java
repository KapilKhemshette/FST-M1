import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("Title of the page: " + driver.getTitle());
		WebElement find_checkbox = driver.findElement(By.xpath("//*[@id = 'checkbox']"));
		System.out.println("Before toggling checkbox, check box is:  "+ find_checkbox.isDisplayed());
		driver.findElement(By.xpath("//*[text()='Toggle Checkbox']")).click();
		System.out.println("After toggling checkbox, check box is:  "+ find_checkbox.isDisplayed());
		
		driver.quit();
		

	}

}
