import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity1Test {
	Base base;
	@BeforeTest
	public void setup() {
		base=new Base("");
		base.setup();
		
	}
	@Test
	public void title() {
		String title=base.getTitle();
		Assert.assertEquals(title, "SuiteCRM");
		System.out.println(title);
		}

	@AfterTest
	public void test_quit() {
		base.quit();
	
	}

}
