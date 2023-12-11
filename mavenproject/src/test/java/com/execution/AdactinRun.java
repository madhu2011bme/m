package com.execution;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;
import com.pom.Login;

public class AdactinRun extends BaseClass {

	public static WebDriver driver;

	public static void main(String[] args) throws IOException{

		browserLaunch("chrome");

		get("https://adactinhotelapp.com/");

		Login log = new Login(driver);

		inputElement(log.getUsename(), "madhu123");

		inputElement(log.getPassword(), "weiui3434");

		clickElement(log.getLogin());

	}



}
//	public static WebDriver driver;
//
//	public static void adactin() {
//
//	public static WebDriver driver = BaseClass.browserLaunch("chrome");
//
//	public static LoginPage lp = new LoginPage(driver);
//
//	public static BookHotel bh = new BookHotel(driver);
//
//	public static SelectHotel sh = new SelectHotel(driver);
//
//	public static CardDetail cd = new CardDetail(driver);
//
//	get("https://adactinhotelapp.com/");
//		inputElement(lp.getUsername(),"MadhubalaRavi");
//		inputElement(lp.getPassword(),"Madhu11bala");
//		clickElement(lp.getLogin());
//		selectElement(bh.getLocation(),"byindex",3);
//		selectElement(bh.getHotel(),"byvalue","Hotel Hervey");
//		selectElement(bh.getRoomtype(),"byVisiblevalue","Deluxe");
//		selectElement(bh.getRoomnumber(),"byindex",2);
//		clear(bh.getCheckindate());
//		inputElement(bh.getCheckindate(),"12/12/2023");
//		clear(bh.getCheckoutdate());
//		inputElement(bh.getCheckoutdate(),"14/12/2023");
//		selectElement(bh.getAdultperroom(),"byvalue","2");
//		selectElement(bh.getChildperroom(),"byvalue","1");
//		clickElement(bh.getSearch());
//		clickElement(sh.getChoose());
//		clickElement(sh.getCont());
//		String firstdata= readData(".\\Excel\\NewData.xlsx", 1,1,0);
//		inputElement(cd.getFirstname(),firstdata);
//		String lastdata= readData(".\\Excel\\NewData.xlsx", 1,1,1);
//		inputElement(cd.getLastname(),lastdata);
//		String addressdata= readData(".\\Excel\\NewData.xlsx", 1,1,2);
//		inputElement(cd.getAddress(),addressdata);
//		String ccnumdata= readData(".\\Excel\\NewData.xlsx", 1,3,0);
//		inputElement(cd.getCcnum(),ccnumdata);
//		selectElement(cd.getCctype(),"byvalue","MAST");
//		selectElement(cd.getCcmonth(),"byvalue","3");
//		selectElement(cd.getCcyear(),"byvalue","2026");
//		String cccvvdata= readData(".\\Excel\\NewData.xlsx", 1,3,1);
//		inputElement(cd.getCccvv(),cccvvdata);
//	}
