
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://training-support.net/webelements/tables");
		System.out.println("Title of the page: " + driver.getTitle());
		
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("No. of rows are: " +rows.size());
		
		List<WebElement> columns = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		System.out.println("No. of columns are: " +columns.size());
		
		List<WebElement> thridRowValues = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
		System.out.println("Third row values are : ");
		for (WebElement cell : thridRowValues){
			System.out.println(cell.getText());
		}
		
		WebElement secondRowSecondColumn = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
		System.out.println("Second row second column value : "+ secondRowSecondColumn.getText());
		
		driver.close();

	}

}
