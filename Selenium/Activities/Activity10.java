
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10{
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/drag-drop");
		
		Actions builder = new Actions(driver);
		
		WebElement football = driver.findElement(By.xpath("//*[@alt = 'A Football']"));
		WebElement Dropzone1 = driver.findElement(By.xpath("//*[@id = 'dropzone1']"));
		WebElement Dropzone2 = driver.findElement(By.xpath("//*[@id = 'dropzone2']"));
		String DropZone1Text = driver.findElement(By.xpath("//*[text() = 'Dropzone1']")).getText();		
		String DropZone2Text = driver.findElement(By.xpath("//*[text() = 'Dropzone2']")).getText();
		
		builder.clickAndHold(football).moveToElement(Dropzone1).release().pause(2000).build().perform();
		
//		builder.dragAndDrop(football, Dropzone1).pause(2000).build().perform();
		
		assert DropZone1Text != "Dropzone1";
		System.out.println("Dropzone1 is changed to " + Dropzone1.getText() + " Ball is dropped in Dropzone1");
		
		builder.dragAndDrop(football, Dropzone2).pause(2000).build().perform();
		assert DropZone2Text != "Dropzone2";
		System.out.println("Dropzone2 is changed to " + Dropzone2.getText() + " Ball is dropped in Dropzone2");
		
		driver.close();
	}
}