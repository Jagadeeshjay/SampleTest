package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver  driver =new ChromeDriver();
driver.manage().window().maximize();
  driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

 WebElement ele = driver.findElement(By.id("email"));
 ele.sendKeys("jay");
driver.findElement(By.id("pass")).sendKeys("jay1224njn");
String url = driver.getCurrentUrl();
System.out.println(url);
String acttitle = driver.getTitle();
System.out.println(acttitle);
if(acttitle.contains("Facebook – log in or sign up")) {
	System.out.println("pass");
}
else {
	System.out.println("fail");
}
driver.close();
	}
	

}
