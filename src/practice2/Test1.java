package practice2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		skillrary s=new skillrary(driver);
		Thread.sleep(3000);
		s.username("jay");
		Thread.sleep(3000);
		s.password("moni");
		Thread.sleep(3000);
		s.login();

	}

}
