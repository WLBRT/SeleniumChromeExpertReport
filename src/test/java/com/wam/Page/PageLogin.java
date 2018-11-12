package com.wam.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wam.SuperClase.SuperClaseChrome;

public class PageLogin extends SuperClaseChrome{
	@FindBy(name="txtUsername") private WebElement boxUsername;
	@FindBy(name="txtPassword") private WebElement boxPassword;
	@FindBy(name="Submit") private WebElement btnLogin;
	
	public PageLogin(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public void getUsername(String strUsername) {
		boxUsername.sendKeys(strUsername);
	}
	
	public void getPassword(String strPassword) {
		boxPassword.sendKeys(strPassword);
	}
	
	public void getBtnlogin() {
		btnLogin.submit();
	}
	
	public void loginTo(String strUsername, String strPassword) {
		this.getUsername(strUsername);
		this.getPassword(strPassword);
		this.getBtnlogin();
	}
}
