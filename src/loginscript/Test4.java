package loginscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.id("email")).sendKeys("jay");

driver.findElement(By.name("pass")).sendKeys("123acv6");

driver.findElement(By.name("login")).click();

String acttitle = driver.getTitle();
System.out.println(acttitle);

String url = driver.getCurrentUrl();
System.out.println(url);

if (acttitle.contains("Facebook – log in or sign up")) {
	System.out.println("Pass");
	
}
else {
	System.out.println("Fail");
}

}

}
