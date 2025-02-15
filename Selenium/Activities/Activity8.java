import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		Actions builder = new Actions(driver);
		driver.get("https://training-support.net/webelements/mouse-events");
		
		System.out.println("Title of the page is " + driver.getTitle());
		
		builder.click(driver.findElement(By.xpath("//h1[text() = 'Cargo.lock']"))).pause(2000).build().perform();
		
		WebElement cargoToml = driver.findElement(By.xpath("//h1[text() = 'Cargo.toml']"));		
		builder.moveToElement(cargoToml).pause(2000).click().pause(2000).build().perform();
		System.out.println("Message after clicked on Cargo.toml - "+ getMessage());
		
		WebElement src = driver.findElement(By.xpath("//h1[text() = 'src']"));
		builder.doubleClick(src).pause(2000).build().perform();
		System.out.println("Message after double clicked on src - "+ getMessage());
		
		WebElement target = driver.findElement(By.xpath("//h1[text() = 'target']"));
		builder.contextClick(target).pause(2000).build().perform();
		driver.findElement(By.xpath("//*[text()= 'Open']")).click();
		Thread.sleep(2000);
		System.out.println("Message after right click on target and select open from list - " + getMessage());
		
		driver.close();

	}

	public static String getMessage() {
        String message = driver.findElement(By.tagName("p")).getText();
        
        return message;
    }
}
