
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Wait;


public class Base extends Locators {
	WebDriver driver;
	String URL;
	Base(String url){
		this.driver=new FirefoxDriver();
		this.URL=url;
	}

	public String act2() {
		
		WebElement e=driver.findElement(By.xpath("//div//img[@src]"));
		return e.getAttribute("src");
		
	}
	public String copyright() {
		
		return driver.findElement(By.id(copyRight)).getText();
	}
	

	public void setup() {
		// TODO Auto-generated method stub
		driver.get(URL);
		
		
	}
	public void quit() {
		// TODO Auto-generated method stub
		driver.quit();
		
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		
		return driver.getTitle();
	}
	public void login() {
		
		System.out.println("title of page:"+driver.getTitle());
	
		WebElement Username=driver.findElement(By.xpath(usernamePath));
	
		WebElement Password=driver.findElement(By.xpath(passwordPath));
	
		WebElement Login=driver.findElement(By.xpath(loginPath));

		Username.sendKeys("admin");
	
		Password.sendKeys("pa$$w0rd");

		Login.click();
	
		
	}
	public void color() {
	
		Color color = Color.fromString(driver.findElement(By.className("container-fluid")).getCssValue("color"));
        System.out.println("Color of toolbar is: " + color.asRgb());
        System.out.println(color);
        System.out.println("Color as hexcode: " + color.asHex());;
	}
	public void activityMenu() {
		
		WebElement act = driver.findElement(By.id("grouptab_3"));
		act.click();
		System.out.println("Activities is present :" +act.isDisplayed());
	}
 
	public void readInfo() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
		WebElement sale = driver.findElement(By.id("grouptab_0"));
		sale.click();
		WebElement lead = driver.findElement(By.id("moduleTab_9_Leads"));
		lead.click();
		Thread.sleep(5000);
		
		WebElement adInfo = driver.findElement(By.xpath("(//span[@title='Additional Details'])[1]"));
		adInfo.click();
		
		Alert leadAlrt = driver.switchTo().alert();
		
		String alertText = leadAlrt.getText();
        System.out.println("Text in alert: " + alertText);
	}
}