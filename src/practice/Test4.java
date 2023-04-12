package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {
public static void main(String[] args) {
	WebDriver  driver =new ChromeDriver();
	driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement ele = driver.findElement(By.id("email"));
	Dimension s = ele.getSize();
	int h = s.getHeight();
	System.out.println(h+"height");
	int w = s.getWidth();
	System.out.println(w+"width");

	
	driver.navigate().to("https://www.instagram.com/");
	WebElement id = driver.findElement(By.name("password"));
	Dimension sd = id.getSize();
	int hg = sd.getHeight();
	System.out.println(hg+"height");
	int wi = sd.getWidth();
	System.out.println(wi+"width");
	driver.close();
	
	

}
}
