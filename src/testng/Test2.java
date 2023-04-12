package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void calls() {
		Reporter.log("calls",true);
	}
		@Test
		public void settings() {
			Reporter.log("settings",true);
		}
			@Test
			public void chats(){
				Reporter.log("chats",true);
			}
}
