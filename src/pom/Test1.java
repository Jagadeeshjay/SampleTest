package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


facebook fb=new facebook(driver);
Thread.sleep(3000);
fb.username("admin");
Thread.sleep(3000);
fb.password("manager");
Thread.sleep(3000);
fb.login();
	}

}
