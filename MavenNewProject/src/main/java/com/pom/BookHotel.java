package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	
public WebDriver driver;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement roomnumber;
	
	@FindBy(id="datepick_in")
	private WebElement checkindate;
	
	@FindBy(id="datepick_out")
	private WebElement checkoutdate;
	
	@FindBy(id="adult_room")
	private WebElement adultperroom;
	
	@FindBy(id="child_room")
	private WebElement childperroom;
	
	@FindBy(id="Submit")
	private WebElement search;

	

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnumber() {
		return roomnumber;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getAdultperroom() {
		return adultperroom;
	}

	public WebElement getChildperroom() {
		return childperroom;
	}

	public WebElement getSearch() {
		return search;
	}
	
	public BookHotel(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(this.driver, this);
	}
}
