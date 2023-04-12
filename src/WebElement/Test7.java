package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
			
		Thread.sleep(3000);
      WebElement checkbox = driver.findElement(By.name("sex"));
	if(checkbox.isSelected()){
	System.out.println("Pass");

	}
	else {
		System.out.println("Fail");
		
	}
	driver.close();
     	}

}
