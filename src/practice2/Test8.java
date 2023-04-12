package practice2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test8 {
@DataProvider
	public Object getData() {
		Object[][] obj=new Object[3][2];
		obj[0][0]="12ax";
		obj[0][1]="123456";
		obj[1][0]="admin";
		obj[1][1]="123456";
		obj[2][0]="xyz";
	    obj[2][1]="n2346^";
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
