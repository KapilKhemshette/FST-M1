import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity3Test {
	Base base;
	@BeforeTest
	public void setup() {
		base=new Base("");
		base.setup();
	}
	@Test
	public void copyRightTest() {
	System.out.println(base.copyright());
}
	@AfterTest
	public void quit() {
		base.quit();
	}

}
