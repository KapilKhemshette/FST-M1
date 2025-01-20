import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity4Test {
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
	public void testLogin(){
		base.login();
		
	}
	@AfterTest
	public void quitTest() {
		base.quit();
	}
	

}
