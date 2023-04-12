package navigateAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.com/");
//Navigate
Thread.sleep(3000);
driver.navigate().to("https://facebook.com/");

Thread.sleep(3000);
driver.navigate().back();//back

Thread.sleep(3000);// select Add throwexception
driver.navigate().forward();//forward

Thread.sleep(3000);
driver.navigate().refresh();//refresh
	}

}
