package com.execution;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;

public class AdactinRunner extends BaseClass  {
			public static WebDriver driver;
			
			public static void main(String[] args) throws IOException {
				driver=browserLaunch("chrome");
				get("https://adactinhotelapp.com/");
				WebElement username=driver.findElement(By.id("username"));
				inputElement(username,"MadhubalaRavi");
				WebElement password=driver.findElement(By.id("password"));
				inputElement(password,"Madhu11bala");
				WebElement login=driver.findElement(By.xpath("//input[@type='Submit']"));
				clickElement(login);
			 	WebElement location= driver.findElement(By.xpath("//select[@name='location']"));
			 	selectElement(location,"byindex",3);
			 	WebElement hotel=driver.findElement(By.xpath("//select[@name='hotels']"));
				selectElement(hotel,"byvalue","Hotel Hervey");
				WebElement roomtype = driver.findElement(By.xpath("//select[@id='room_type']"));
				selectElement(roomtype,"byVisiblevalue","Deluxe");
				WebElement roomnumber=driver.findElement(By.xpath("//select[@id='room_nos']"));
				getOptions(roomnumber);
				selectElement(roomnumber,"byindex",2);
				WebElement checkindate=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
				if(checkindate.isDisplayed()) {
					clear(checkindate);
					}
				inputElement(checkindate,"12/12/2023");
				WebElement checkoutdate=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
				if(checkoutdate.isDisplayed()) {
					clear(checkoutdate);
					}
				inputElement(checkoutdate,"14/12/2023");
				WebElement adultperroom = driver.findElement(By.xpath("//select[@id='adult_room']"));
				selectElement(adultperroom,"byvalue","2");
				WebElement childperroom = driver.findElement(By.xpath("//select[@id='child_room']"));
				selectElement(childperroom,"byvalue","1");
				WebElement search= driver.findElement(By.xpath("//input[@type='submit']"));
						clickElement(search);
				WebElement choose=driver.findElement(By.xpath("//input[@type='radio']"));
				clickElement(choose);
				WebElement cont=driver.findElement(By.xpath("//input[@value='Continue']"));
				clickElement(cont);
                WebElement firstname=driver.findElement(By.xpath("//input[@name='first_name']"));
				String firstdata= readData(".\\Excel\\NewData.xlsx", 1,1,0);
				inputElement(firstname,firstdata);
				WebElement lastname=driver.findElement(By.xpath("//input[@name='last_name']"));
				String lastdata= readData(".\\Excel\\NewData.xlsx", 1,1,1);
				inputElement(lastname,lastdata);
				WebElement address=driver.findElement(By.xpath("//textarea[@name='address']"));
				String addressdata= readData(".\\Excel\\NewData.xlsx", 1,1,2);
				inputElement(address,addressdata);
				WebElement ccnum=driver.findElement(By.xpath("//input[@name='cc_num']"));
				String ccnumdata= readData(".\\Excel\\NewData.xlsx", 1,3,0);
				inputElement(ccnum,ccnumdata);
				WebElement cctype= driver.findElement(By.xpath("//select[@id='cc_type']"));
				selectElement(cctype,"byvalue","MAST");
				WebElement ccmonth=driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
				selectElement(ccmonth,"byvalue","3");
				WebElement ccyear=driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
				selectElement(ccyear,"byvalue","2026");
				WebElement cccvv=driver.findElement(By.xpath("//input[@name='cc_cvv']"));
				String cccvvdata= readData(".\\Excel\\NewData.xlsx", 1,3,1);
				inputElement(cccvv,cccvvdata);
				WebElement book=driver.findElement(By.xpath("//input[@value='Book Now']"));
				clickElement(book);
				WebElement itin=driver.findElement(By.xpath("//input[@id='my_itinerary']"));
				clickElement(itin);

	}

}
