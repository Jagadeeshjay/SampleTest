package loginscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.netflix.com/in/login");

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.id("id_userLoginId")).sendKeys("abcjay");
driver.findElement(By.name("password")).sendKeys("122345574as");
driver.findElement(By.xpath("//button[@type='submit']")).click();


String acttitle = driver.getTitle();
System.out.println(acttitle);

String url = driver.getCurrentUrl();
System.out.println(url);

if(acttitle.contains("Netflix")) {
	System.out.println("Pass");
}
else {
	System.out.println("fail");
}

	}

}
