package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test1 {

	@DataProvider
	public Object getData() {
		Object[][] obj=new Object[3][2];
		obj[0][0]="1234656789";
		obj[0][1]="852963741";
		
		obj[1][0]="admin";
		obj[1][1]="manager";
		
		obj[2][0]="abc123p67&%$";
		obj[2][1]="kajvbkn215";
		return obj;
	}
	@Test(dataProvider="getData")
	public void demo(String username,String password) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		
		Thread.sleep(5000);
	}
	
}
