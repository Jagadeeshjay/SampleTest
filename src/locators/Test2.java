package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://facebook.com/ ");

driver.findElement(By.partialLinkText("Forgotten " )).click();
driver.findElement(By.id("identify_email")).sendKeys("2365687");
driver.findElement(By.id("did_submit" )).click();
	}

}
