package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver=new FirefoxDriver();
		driver.get("https://training-support.net");
	}
	
	@Test(priority = 1)
	public void getTile() {
		
		String tile=driver.getTitle();
		System.out.println("Title of the page : "+tile);
		
		Assert.assertEquals("Training Support", tile); 
		}
	@Test(priority = 2)
	public void aboutPage() {
		driver.findElement(By.linkText("About Us")).click();
		String aboutpagetile=driver.getTitle();
		System.out.println("Title of the page : "+aboutpagetile);
		//Assert.assertEquals("", aboutpagetile);
		
	
	}
	@Test(priority = 3)
	public void tearDown() {
		System.out.println("Closing driver");
		driver.quit();
	}
		
	}
	


