package Demo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//import net.bytebuddy.agent.builder.AgentBuilder.Default.WarmupStrategy.Enabled;

public class Activity2 {
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/target-practice/");
		
	}
	@Test(priority = 1)
	public void getTitle() {
		String title=driver.getTitle();
		assertEquals(title,"Selenium: Target Practice");
	}
	
	@Test(priority = 2)
	public void incorrectassertion() {
	     WebElement blackButton = driver.findElement(By.cssSelector("button.black"));
	        Assert.assertTrue(blackButton.isDisplayed());
	        Assert.assertEquals(blackButton.getText(), "black");
		
	}
	
	@Test(enabled=false,priority = 3)
	public void m3() {
	    String subHeading = driver.findElement(By.className("sub")).getText();
        Assert.assertTrue(subHeading.contains("Practice"));
		
	}
	
	
	  @Test(priority = 4) public void m4() { 
		  throw new SkipException("Skipping test case");
	  
	  }
	 
	
	
	@AfterClass
	public void tearDown() {
		
		driver.close();
	}

}
