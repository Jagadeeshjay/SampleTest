package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver  driver =new ChromeDriver();
		driver.manage().window().maximize();
		  driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		Point l = ele.getLocation();
		int x = l.getX();
		System.out.println(x+"x co-ordinate ");
		
		int y = l.getY();
		System.out.println(y+"y co-ordinate");
		
		
		driver.navigate().to("https://www.nykaa.com/");
		WebElement nyk = driver.findElement(By.name("search-suggestions-nykaa"));
		nyk.sendKeys("cosmetic");
		nyk.isDisplayed();
		System.out.println("pass");
		Point loc = nyk.getLocation();
		int m = loc.getX();
		System.out.println(m+"cordinate");
		int n = loc.getY();
		System.out.println(n+"cordinate");
		
		
	}

}
