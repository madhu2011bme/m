package com.execution;

import com.baseclass.BaseClass;
import com.pom.Login;
import com.sdp.PageObjectManager;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Adactin extends BaseClass {

	public static WebDriver driver;

	public static void adc() throws IOException {

		WebDriver driver = BaseClass.browserLaunch("chrome");
		PageObjectManager pom = new PageObjectManager(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		get("https://adactinhotelapp.com/");
		inputElement(pom.getInstanceLp().getUsename(), "MadhubalaRavi");
		inputElement(pom.getInstanceLp().getPassword(), "Madhu11bala");
		clickElement(pom.getInstanceLp().getLogin());
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
		clickElement(pom.getInstanceSh().getChoose());
		clickElement(pom.getInstanceSh().getCont());
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
		clickElement(pom.getInstanceLop().getItinerary());
		clickElement(pom.getInstanceLop().getLogout());

	}

	public static void main(String[] args) throws IOException {

		adc();
	}

}
