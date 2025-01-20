import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity6Test {

	Base base;
	LoginPage login;
	@BeforeTest
	public void setupTest()
	{
		base=new Base("http://alchemy.hguy.co/crm");
		//login=new LoginPage("admin","pa$$w0rd");
		base.setup();
	}
	@Test
	public void loginTest() {
		base.login();
	}
	@Test
	public void testLogin(){
		
		base.activityMenu();
		
	}
	@AfterTest
	public void quitTest() {
		base.quit();
	}
	

}
