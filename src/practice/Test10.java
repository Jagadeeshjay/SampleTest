package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver  driver =new ChromeDriver();
		driver.manage().window().maximize();
		  driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	WebElement ele = driver.findElement(By.xpath("//a[text()='COURSE']"));
	Actions a=new Actions(driver);
	a.moveToElement(ele).perform();
	Thread.sleep(3000);
	WebElement ele1 = driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]"));
	a.moveToElement(ele1).click().perform();
	
	WebElement abc = driver.findElement(By.id("add"));
	a.doubleClick(abc).perform();
	
	driver.navigate().to("https://www.google.com/");
	WebElement mnb = driver.findElement(By.name("q"));
	a.contextClick(mnb).perform();
	
	driver.navigate().to("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
	WebElement block3 = driver.findElement(By.xpath("(//h1[@class='draghandle'])[3]"));
	WebElement block4 = driver.findElement(By.xpath("(//h1[@class='draghandle'])[4]"));
	Thread.sleep(3000);
	a.dragAndDrop(block3, block4).perform();
	}

}
