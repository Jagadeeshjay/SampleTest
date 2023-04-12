package practice2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallel {
public WebDriver driver;
@Parameters({"BrowserName"})
@Test

public void demo(String browser) {
	if(browser.equals("chrome"))
		driver=new ChromeDriver();
	else {
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	driver.findElement(By.name("username")).sendKeys("jay");
	driver.findElement(By.name("password")).sendKeys("mni134");
	driver.findElement(By.xpath("//div[text()='Log In']")).click();
	String title = driver.getTitle();
    Reporter.log(title,true);
	String url = driver.getCurrentUrl();
	Reporter.log(url,true);
	System.out.println(url);
	driver.close();
}

}


