package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver  driver =new ChromeDriver();
		driver.manage().window().maximize();
		  driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("password")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[text()='Sign in'])[1]")).submit();
		
		
		
		
		
		
		
	}

}
