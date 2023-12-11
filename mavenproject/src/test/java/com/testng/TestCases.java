package com.testng;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.pom.Login;
import com.sdp.PageObjectManager;

public class TestCases extends BaseClass {
	
	public static PageObjectManager pom;

	@Test(priority = 1)
	private void setProperty() throws IOException {
		
		browserLaunch("chrome");
	}

	@Test(priority = 2)
	private void getUrl() {
		get("https://adactinhotelapp.com/");
	}

	@Test(priority = 3)
	private void loginPage() {
		 pom = new PageObjectManager(driver);
		inputElement(pom.getInstanceLp().getUsename(), "MadhubalaRavi");
		inputElement(pom.getInstanceLp().getPassword(), "Madhu11bala");
		clickElement(pom.getInstanceLp().getLogin());
//		Login log = new Login(driver);
//
//		inputElement(log.getUsename(), "Madhubala");
//
//		inputElement(log.getPassword(), "Madhu11bala");
//
//		clickElement(log.getLogin());

	}

//	@Test
//	private void bookHotel() {
//		selectElement(pom.getInstanceBh().getLocation(), "byindex", 3);
//		selectElement(pom.getInstanceBh().getHotel(), "byvalue", "Hotel Hervey");
//		selectElement(pom.getInstanceBh().getRoomtype(), "byVisiblevalue", "Deluxe");
//		selectElement(pom.getInstanceBh().getRoomnumber(), "byindex", 2);
//		clear(pom.getInstanceBh().getCheckindate());
//		inputElement(pom.getInstanceBh().getCheckindate(), "12/12/2023");
//		clear(pom.getInstanceBh().getCheckoutdate());
//		inputElement(pom.getInstanceBh().getCheckoutdate(), "14/12/2023");
//		selectElement(pom.getInstanceBh().getAdultperroom(), "byvalue", "2");
//		selectElement(pom.getInstanceBh().getChildperroom(), "byvalue", "1");
//		clickElement(pom.getInstanceBh().getSearch());
//	}
//
//	@Test
//	private void searchHotel() {
//		clickElement(pom.getInstanceSh().getChoose());
//		clickElement(pom.getInstanceSh().getCont());
//	}
//
//	@Test
//	private void cardDetail() throws IOException {
//		String firstdata = readData(".\\Excel\\NewData.xlsx", 1, 1, 0);
//		inputElement(pom.getInstanceCd().getFirstname(), firstdata);
//		String lastdata = readData(".\\Excel\\NewData.xlsx", 1, 1, 1);
//		inputElement(pom.getInstanceCd().getLastname(), lastdata);
//		String addressdata = readData(".\\Excel\\NewData.xlsx", 1, 1, 2);
//		inputElement(pom.getInstanceCd().getAddress(), addressdata);
//		inputElement(pom.getInstanceCd().getCcnum(), "2132345767543112");
//		selectElement(pom.getInstanceCd().getCctype(), "byvalue", "MAST");
//		selectElement(pom.getInstanceCd().getCcmonth(), "byvalue", "3");
//		selectElement(pom.getInstanceCd().getCcyear(), "byvalue", "2026");
//		String cccvvdata = readData(".\\Excel\\NewData.xlsx", 1, 3, 1);
//		inputElement(pom.getInstanceCd().getCccvv(), cccvvdata);
//		clickElement(pom.getInstanceCd().getBook());
//	}
//
//	@Test
//	private void logOut() {
//		clickElement(pom.getInstanceLop().getItinerary());
//		clickElement(pom.getInstanceLop().getLogout());
//	}
}
