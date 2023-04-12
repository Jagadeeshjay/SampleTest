package dropdown;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		ele.click();
		WebElement mon = driver.findElement(By.id("month"));
		Select s=new Select(mon);
	 List<String> orginalList = new ArrayList();
	 List<String> tempList = new ArrayList();
	 List<WebElement> a = s.getAllSelectedOptions();
	 System.out.println(a.size());
		for(WebElement e:s.getOptions())
		{
			orginalList.add(e.getText());
			tempList.add(e.getText());
		
		}
		System.out.println("list before sorting"+orginalList);
		Collections.sort(tempList);
		System.out.println("list of sorting"+tempList);
		driver.close();
			}
}
