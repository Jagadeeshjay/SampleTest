package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver  driver =new ChromeDriver();
		driver.manage().window().maximize();
		  driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	WebElement ele = driver.findElement(By.xpath("//a[text()='Forgot password?']"));
		ele.click();
	if(	ele.isEnabled()) {
		System.out.println("button is enabled");
		
	}
	else {
		System.out.println("button not enabled");
		
	}
		
	driver.close();	
		
		
	}

}
