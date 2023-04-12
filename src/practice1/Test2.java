package practice1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		
		WebElement ele = driver.findElement(By.id("cars"));
		Select s=new Select(ele);
		Thread.sleep(3000);
		s.selectByIndex(2);
		s.selectByValue("399");
		s.selectByVisibleText("More Than INR 500 ( 55 )");
		
		Thread.sleep(3000);
		s.deselectByIndex(2);
		s.deselectByValue("399");
		s.deselectByVisibleText("More Than INR 500 ( 55 )");
		
		
		
		List<WebElement> opt = s.getOptions();
		System.out.println(opt.size());
		
		for(WebElement b:opt) {
			System.out.println(b.getText());
			System.out.println(s.isMultiple());
			if(s.isMultiple()) {
			System.out.println("pass");
		}
	}

	}
}
