package Demo;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_Calculator {
	
	private Calculator cal;
	
	@BeforeClass
	public void setup() {
		cal=new Calculator();
	}
	
	@Test
	public void test_add(){
		Assert.assertEquals(cal.add(2,2), 4);
	}
	
}
