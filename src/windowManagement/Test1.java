package windowManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();

Thread.sleep(3000);
driver.manage().window().maximize();//maximize
driver.get("https://www.amazon.com/");

Thread.sleep(3000);//Add interruptexception
driver.manage().window().fullscreen();//fullscreen

Thread.sleep(3000);
driver.manage().window().minimize();//minimize
	}

}
