package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://facebook.com/");
driver.findElement(By.linkText("Forgotten password?" )).click();

driver.findElement(By.id("identify_email")).sendKeys("1234567");
driver.findElement(By.id("did_submit")).click()
;
	}

}
