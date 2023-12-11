package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public WebDriver driver;
	
	@FindBy(id="username")
	private WebElement usename;
	
	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "login")
	private WebElement login;

	public WebElement getUsename() {
		return usename;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	public Login(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(this.driver, this);
	}
}
