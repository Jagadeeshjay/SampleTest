package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoapp.skillrary.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


WebElement ele = driver.findElement(By.xpath("//a[text()='COURSE']"));
Actions a=new Actions(driver);
a.moveToElement(ele).perform();
driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
WebElement e = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));

a.doubleClick(e).perform();

driver.close();


	}

}
