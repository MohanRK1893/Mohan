package org.pom.addictianhotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import maven.BaseClass;

public class LoginInPage extends BaseClass{
	
	public LoginInPage() {
		PageFactory.initElements(driver, this);
	}
	
@FindBy(id="username")
private WebElement txtusername;

@FindBy(id="password")
private WebElement txtpassword;

@FindBy(id="login")
private WebElement btnlogin;

public WebElement getTxtusername() {
	return txtusername;
}

public WebElement getTxtpassword() {
	return txtpassword;
}

public WebElement getBtnlogin() {
	return btnlogin;
}

public void Login(String username,String password) {
	sendKeys(getTxtusername(), username);
	sendKeys(getTxtpassword(), password);
	click(getBtnlogin());
}



}
