package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prgm1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver-win64//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.indiaglitz.com/");
		driver.getTitle();
		driver.navigate().to("https://www.swiggy.com/");
		driver.getCurrentUrl();
		driver.navigate().to("zomato.com/chennai/order-food-online");		
		
	}

}
