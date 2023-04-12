package practice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//declaration
public class skillrary {
@FindBy(id="email")
private WebElement usernametb;

@FindBy(id="password")
private WebElement passwordtb;

@FindBy(name="login")
private WebElement logitb;

//initialization
public skillrary(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

//utilization
public void username(String name) {
	usernametb.sendKeys("admin");
}
	public void password(String pwd) {
		passwordtb.sendKeys("manager");
	}
	public void login() {
		logitb.click();
	}
	
		}
	
	




	
	

