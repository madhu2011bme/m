package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loc_Task {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver-win64//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		WebElement findElement= driver.findElement(By.name("user-name"));
		findElement.sendKeys("Madhubala");
		driver.findElement(By.id("password")).sendKeys("99999999");
		driver.findElement(By.className("btn_action")).click();
		
	}


}





















