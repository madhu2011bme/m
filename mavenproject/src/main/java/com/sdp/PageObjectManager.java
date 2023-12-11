package com.sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.BookHotel;
import com.pom.CardDetail;
import com.pom.LogOut;
import com.pom.Login;
import com.pom.SelectHotel;

public class PageObjectManager {

	public  WebDriver driver;
	public Login lp;
	private BookHotel bh;
	private SelectHotel sh;
	private CardDetail cd;
	private LogOut lop;

	public Login getInstanceLp() {
		lp = new Login(driver);
		return lp;
	}

	public BookHotel getInstanceBh() {
		bh = new BookHotel(driver);
		return bh;
	}

	public SelectHotel getInstanceSh() {
		sh = new SelectHotel(driver);
		return sh;
	}

	public CardDetail getInstanceCd() {
		cd = new CardDetail(driver);
		return cd;
	}

	public LogOut getInstanceLop() {
		lop = new LogOut(driver);
		return lop;
	}

	public PageObjectManager(WebDriver driver) {
		
		this.driver = driver;

		PageFactory.initElements(this.driver, this);
	}
}
