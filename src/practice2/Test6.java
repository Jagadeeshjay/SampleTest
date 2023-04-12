package practice2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test6 {
@Test(priority=1,invocationCount=1,enabled=false)
public void jay() {
	Reporter.log("jay",true);
}
@Test(priority=-1,invocationCount=2)
public void jaya() {
	Reporter.log("jaya",true);
}
@Test(priority=1,invocationCount=3)
public void monica() {
	Reporter.log("monica",true);
}
}
