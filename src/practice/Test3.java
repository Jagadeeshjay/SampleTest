package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver  driver =new ChromeDriver();
		driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'Facebook ')]"));
		System.out.println(text.getText());
		
		
		driver.navigate().to("https://demoapp.skillrary.com/");
		WebElement ele = driver.findElement(By.xpath("//h1[contains(text(),'Welcome ')]"));
		System.out.println(ele.getText());
		
		driver.close();
	}
	

}
