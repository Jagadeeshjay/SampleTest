package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class instagram {

	@FindBy(name="username")
	private WebElement usernametb;
	
	@FindBy(name="password")
	private WebElement passwordtb;
	
	@FindBy(xpath="//div[text()='Log In']")
	private WebElement loginbtn;
	
	public instagram(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void username(String name) {
		usernametb.sendKeys("admin jay");
	}
	public void password(String pwd) {
		passwordtb.sendKeys("manager");
	}
	public void login () {
		loginbtn.click();
	}
	
	
}
