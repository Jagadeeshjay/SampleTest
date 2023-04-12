package practice2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test5 {
@Test(priority =-1,invocationCount=2)
public void calls() {
	Reporter.log("calls",true);
}
	@Test(priority =1,invocationCount=4,enabled=false)
	public void setting() {
		Reporter.log("setting",true);
	}
		@Test(invocationCount=3)
		public void chats() {
			Reporter.log("chats",true);
			
}
}
