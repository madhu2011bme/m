package com.Basic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.driver.chrome", "D:\\\\Eclipse\\\\chromedriver-win64//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("windows.arguments[0]3", "");
	}

}
