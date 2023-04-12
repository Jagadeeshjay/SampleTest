package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	driver.findElement(By.id("email")).sendKeys("jayy");
	driver.findElement(By.id("pass")).sendKeys("monika123");
	WebElement ele = driver.findElement(By.xpath("//h2[contains(text(),'Facebook ')]"));
	
	System.out.println(ele.getText());
 String title = driver.getTitle();
 System.out.println(title);
 String url = driver.getCurrentUrl();
 System.out.println(url);

 
 
 driver.navigate().to("https://www.amazon.com/");
 WebElement size = driver.findElement(By.id("twotabsearchtextbox"));
 Dimension h = size.getSize();
 h.getHeight();
 System.out.println(h);
Dimension w = size.getSize();
w.getWidth();
System.out.println(w);

WebElement loc = driver.findElement(By.id("twotabsearchtextbox"));
Point x = loc.getLocation();
x.getX();
System.out.println(x);
Point y = loc.getLocation();



y.getY();
System.out.println(y);
driver.close();

}
}
