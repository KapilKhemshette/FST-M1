import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage{
	String username,password;
	WebDriver driver;
	Locators loc;
	LoginPage(String username,String password) {
		driver=new FirefoxDriver();	
		loc=new Locators();
		this.username=username;
		this.password=password;
		
	}

	public String login(){
		System.out.println("title of page:"+driver.getTitle());
	
		WebElement Username=driver.findElement(By.id(loc.usernamePath));
	
		WebElement Password=driver.findElement(By.id(loc.passwordPath));
	
		WebElement Login=driver.findElement(By.id(loc.loginPath));

		Username.sendKeys(username);
	
		Password.sendKeys(password);

		Login.click();
	
		String title=driver.getTitle();
		return title;
	}

}
