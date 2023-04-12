package loginscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoapp.skillrary.com/login.php?type=login");

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.id("email")).sendKeys("ädmin");


driver.findElement(By.id("password")).sendKeys("1234avs");


driver.findElement(By.name("login")).click();

String acttitle = driver.getTitle();
System.out.println(acttitle);

String url = driver.getCurrentUrl();
System.out.println(url);

if(acttitle.contains("SkillRary Courses")) {
	System.out.println("Pass");
	
}
else {
	System.out.println("Fail");
}

	}

}
