package com.testng;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.pom.Login;
import com.sdp.PageObjectManager;

public class BasicTestNg extends BaseClass {

	public static PageObjectManager pom;

	@Test(priority = 1)

	public void setProperty() throws IOException {
		browserLaunch("chrome");
	}

	@Test(priority = 2)
	public void getUrl() {
		getUrl("https://adactinhotelapp.com/");
	}

	@Test(priority = 3)
	public void loginPage() {
		pom = new PageObjectManager(driver);
		inputElement(pom.getInstanceLp().getUsename(), "MadhubalaRavi");

		inputElement(pom.getInstanceLp().getPassword(), "EX2P46");

		clickElement(pom.getInstanceLp().getLogin());
	}

	@Test(priority = 4)
	public void bookHotel() {
		selectElement(pom.getInstanceBh().getLocation(), "byindex", 3);
		selectElement(pom.getInstanceBh().getHotel(), "byvalue", "Hotel Hervey");
		selectElement(pom.getInstanceBh().getRoomtype(), "byVisiblevalue", "Deluxe");
		selectElement(pom.getInstanceBh().getRoomnumber(), "byindex", 2);
		clear(pom.getInstanceBh().getCheckindate());
		inputElement(pom.getInstanceBh().getCheckindate(), "12/12/2023");
		clear(pom.getInstanceBh().getCheckoutdate());
		inputElement(pom.getInstanceBh().getCheckoutdate(), "14/12/2023");
		selectElement(pom.getInstanceBh().getAdultperroom(), "byvalue", "2");
		selectElement(pom.getInstanceBh().getChildperroom(), "byvalue", "1");
		clickElement(pom.getInstanceBh().getSearch());
	}
	@Test(priority=5)
	public void selectHotel() {
		clickElement(pom.getInstanceSh().getChoose());
		clickElement(pom.getInstanceSh().getCont());
	}
	@Test(priority = 6)
	public void cardDetail() throws IOException {
		String firstdata = readData(".\\Excel\\NewData.xlsx", 1, 1, 0);
		inputElement(pom.getInstanceCd().getFirstname(), firstdata);
		String lastdata = readData(".\\Excel\\NewData.xlsx", 1, 1, 1);
		inputElement(pom.getInstanceCd().getLastname(), lastdata);
		String addressdata = readData(".\\Excel\\NewData.xlsx", 1, 1, 2);
		inputElement(pom.getInstanceCd().getAddress(), addressdata);
		inputElement(pom.getInstanceCd().getCcnum(), "2132345767543112");
		selectElement(pom.getInstanceCd().getCctype(), "byvalue", "MAST");
		selectElement(pom.getInstanceCd().getCcmonth(), "byvalue", "3");
		selectElement(pom.getInstanceCd().getCcyear(), "byvalue", "2026");
		String cccvvdata = readData(".\\Excel\\NewData.xlsx", 1, 3, 1);
		inputElement(pom.getInstanceCd().getCccvv(), cccvvdata);
		clickElement(pom.getInstanceCd().getBook());
	}
	@Test(priority = 7)
	public void logOut() {
		implicitWait(40, TimeUnit.SECONDS);
		clickElement(pom.getInstanceLop().getItinerary());
		clickElement(pom.getInstanceLop().getLogout());
	}
}
