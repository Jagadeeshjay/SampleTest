package practice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitime {
@FindBy(id="username")
private WebElement usernametb;

@FindBy(name="pwd")
private WebElement passwordtb;

@FindBy(id="loginButton")
private WebElement loginbtn;


public actitime(WebDriver driver){
	PageFactory.initElements(driver,this );
}

public void username(String un) {
	usernametb.sendKeys("jay");
}
	public void password(String pd) {
		passwordtb.sendKeys("manager");
	}	
		public void login() {
			loginbtn.click();
		}
}









