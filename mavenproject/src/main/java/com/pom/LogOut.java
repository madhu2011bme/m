package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
public static WebDriver driver;
	
	@FindBy(id="my_itinerary")
	private WebElement itinerary;
	
	@FindBy(id="logout")
	private WebElement logout;

	public LogOut(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(this.driver, this);
	}
	public WebElement getItinerary() {
		return itinerary;
	}

	public WebElement getLogout() {
		return logout;
	}
	
}
