package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
public static WebDriver driver;
	
	

public WebElement getChoose() {
	return choose;
}

public WebElement getCont() {
	return cont;
}

	@FindBy(id="radiobutton_0")
	private WebElement choose;

	@FindBy(id="continue")
	private WebElement cont;
	
	public SelectHotel(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(this.driver, this);
}
	
}
