package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/ ");
		driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("manager");
		driver.findElement(By.cssSelector(" button[name=\"login\"]")).click();
	}

}
