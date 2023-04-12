package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver  driver =new ChromeDriver();
		driver.manage().window().maximize();
		  driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchtb = driver.findElement(By.id("twotabsearchtextbox"));
		searchtb.sendKeys("speaker");
		Thread.sleep(5000);
		List<WebElement> search = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		System.out.println(search.size());
		for(WebElement b:search) {
		System.out.println(b.getText());
		
		}
		driver.close();
	}

}
