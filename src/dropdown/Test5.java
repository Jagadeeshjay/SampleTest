package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.name("cars"));
		Select s=new Select(ele);
		Thread.sleep(3000);
		s.selectByIndex(2);
		s.selectByValue("299");
		s.selectByVisibleText("More Than INR 500 ( 55 ) ");

		List<WebElement> opt = s.getAllSelectedOptions();
		System.out.println(opt.size());

		for(WebElement b:opt)
		System.out.println(b.getText());  //its selecting all because it is Multiple SelectType
		driver.close();
	}

}
