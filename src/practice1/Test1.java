package practice1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
																				
		WebElement ele = driver.findElement(By.name("url"));                          
		Select s=new Select(ele);
		s.selectByIndex(10);
		s.selectByValue("search-alias=electronics-intl-ship");
		s.selectByVisibleText("Electronics");
		
		List<WebElement> opt = s.getAllSelectedOptions();
		System.out.println(opt.size());
		
		for(WebElement b:opt) {
			System.out.println(b.getText());
			System.out.println(s.isMultiple());
			Thread.sleep(3000);
			if(s.isMultiple()) {
				s.deselectAll();	
			}
			else {
				System.out.println("it is not multiple selected dropdown");
			}
		}
		
		

	}
}