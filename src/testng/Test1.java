package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void demo() {
		Reporter.log("hello selenium",true);
		Reporter.log("hello java",true);
		
	}
}
