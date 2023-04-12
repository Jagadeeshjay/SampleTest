package practice1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.whatsapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		TakesScreenshot ts= (TakesScreenshot)driver;
		File ram = ts.getScreenshotAs(OutputType.FILE);
		File desti=new File("./photo/whatsapp.png");
		FileUtils.copyFile(ram,desti);
		
	}

}
