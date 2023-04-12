package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			//typecasting
			TakesScreenshot ts=(TakesScreenshot)driver;
			
			//access the method photo will be stored in ram
			File ram = ts.getScreenshotAs(OutputType.FILE);
			
			//Specify the location photo should be stored
			File desti=new File("./photo/instagram.png");
			
			//copy and paste from ram and specify location
			FileUtils.copyFile(ram, desti);
			
			
			driver.navigate().to("https://www.nykaa.com/");
			TakesScreenshot ts1=(TakesScreenshot)driver;
			File ram1 = ts1.getScreenshotAs(OutputType.FILE);
			File desti1=new File("./photo/nykaa.png");
			FileUtils.copyFile(ram1,desti1);
	}

}
