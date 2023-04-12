package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebook {
@FindBy(id="email")
private WebElement usernametb;

@FindBy(id="pass")
private WebElement passwordtb;

@FindBy(name="login")
private WebElement loginbtn;



public  facebook (WebDriver driver) {
PageFactory.initElements(driver,this);
}

public void username(String name) {
	usernametb.sendKeys("admin");
}
public void password(String pwd) {
	passwordtb.sendKeys("manager");
}
public void login() {
	loginbtn.click();
}
}