package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://luxire.com/ ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		WebElement ele = driver.findElement(By.xpath("//button[@class='drawerbtn']"));
		
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		
		Actions a1 =new Actions(driver);
		a1.moveToElement(ele).perform();
		
		//acton,bgfngfc
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[text()='All Shirts'])[2]")).click();
	}
	

}
