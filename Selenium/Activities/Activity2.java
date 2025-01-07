import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity2 {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		// TODO Auto-generated method stub
		driver.get("https://training-support.net/webelements/login-form");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        String message = driver.findElement(By.tagName("h1")).getText();
        System.out.println(message);

        driver.close();

	}

}