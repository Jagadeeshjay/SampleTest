package scroll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement ele = driver.findElement(By.xpath("//h2[text()='For your Fitness Needs']"));
		org.openqa.selenium.Point loc = ele.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		
		//typecasting
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+", "+y+")");
		
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();",ele);
		
	}

}
