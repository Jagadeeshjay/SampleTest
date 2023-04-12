package practice2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		actitime a=new actitime(driver);
		Thread.sleep(3000);
		a.username("abc");
		Thread.sleep(3000);
		a.password("mnb");
		Thread.sleep(3000);
		a.login();
	}

}
