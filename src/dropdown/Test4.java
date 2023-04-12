package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement dropdown = driver.findElement(By.name("url"));
		Select s=new Select(dropdown);
		s.selectByIndex(7);

		s.selectByValue("search-alias=deals-intl-ship");
		s.selectByVisibleText("Health & Household");


		List<WebElement> opt = s.getAllSelectedOptions();
		System.out.println(opt.size());

		for(WebElement b:opt)
		System.out.println(b.getText());  //its selecting only 1 because it is Single SelectType
		driver.close();
	}

}
