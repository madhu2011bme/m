package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CardDetail {
	
	public static WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement firstname;
	@FindBy(id="last_name")
	private WebElement lastname;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement ccnum;
	@FindBy(id="cc_type")
	private WebElement cctype;
	@FindBy(id="cc_exp_month")
	private WebElement ccmonth;
	@FindBy(id="cc_exp_year")
	private WebElement ccyear;
	@FindBy(id="cc_cvv")
	private WebElement cccvv;
	
	@FindBy(id="book_now")
	private WebElement book;
	
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcnum() {
		return ccnum;
	}
	public WebElement getCctype() {
		return cctype;
	}
	public WebElement getCcmonth() {
		return ccmonth;
	}
	public WebElement getCcyear() {
		return ccyear;
	}
	public WebElement getCccvv() {
		return cccvv;
	}
	public WebElement getBook() {
		return book;
	}
	
	public CardDetail(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(this.driver, this);
	}
}
