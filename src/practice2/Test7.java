package practice2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test7 {
@DataProvider
public Object getData() {
	Object[] []obj=new Object[3][2];
	obj[0][0]="12bbJHA";
	obj[0][1]="12357895";
	obj[1][0]="Admmin";
	obj[1][1]="manager";
	obj[2][0]="xyz$";
	obj[2][1]="xyz$1223487643";
	return obj;
}
	@Test(dataProvider="getData")
	public void demo(String username,String password) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.name("pass")).sendKeys(password);
	
}
}
