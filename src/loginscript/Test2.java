package loginscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("admin");

driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345678");

driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

String actTitle = driver.getTitle();
System.out.println(actTitle);

String url = driver.getCurrentUrl();
System.out.println(url);

if(actTitle.contains("Online Shopping Site for Mobiles,")) {
	System.out.println("Pass");

}
else
{
	System.out.println("Fail");
	
}
driver.close();
	}

}
