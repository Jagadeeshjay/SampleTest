package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/search/result/?q=Moisturizer&root=search&searchType=Manual&sourcepage=Search+Page");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.findElement(By.xpath("(//span[contains(text(),'Estee Lauder')])[2]")).click();
		Set<String> child = driver.getWindowHandles();
		for(String b:child) {
			driver.switchTo().window(b);
		}
		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		driver.findElement(By.xpath("//span[@class='cart-count']")).click();
		driver.switchTo().frame(0);

		driver.findElement(By.xpath("(//span[@class='css-9sv7cv ehes2bo0'])[2]")).click();
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		driver.switchTo().defaultContent();
	}

}
