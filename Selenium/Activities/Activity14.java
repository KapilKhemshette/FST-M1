
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/tables");
		System.out.println("Title of the page: " + driver.getTitle());
		
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("No. of rows are: " +rows.size());
		
		List<WebElement> columns = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		System.out.println("No. of columns are: " +columns.size());
		
		String bookName_fifthrow = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText();
		System.out.println("FifthRow Book Name : " + bookName_fifthrow);
		
		driver.findElement(By.xpath("//table/thead/tr/th[5]")).click();
		
		String fifthrow_book_aftersorting = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText();
		System.out.println("FifthRow Book Name after sorting : " + fifthrow_book_aftersorting);
		
		driver.close();

	}

}
