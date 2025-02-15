
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/keyboard-events");
		
		System.out.println("Title of the page: " + driver.getTitle());
		
		Actions builder = new Actions(driver);
		builder.sendKeys("Anu ").pause(2000).sendKeys(Keys.RETURN).pause(2000).build().perform();
		
		Thread.sleep(2000);
		
		String text = driver.findElement(By.cssSelector("h1.mt-3")).getText();
		System.out.println(text);
		driver.quit();
		
		

	}

}
