package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locat_Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver-win64//chromedriver.exe");
		WebDriver exp= new ChromeDriver();
		exp.get("https://ultimateqa.com/automation/?ref=hackernoon.com");
		Thread.sleep(9000);
		exp.findElement(By.xpath("//input[@name='fields[first_name]']")).sendKeys("madhubala");
		exp.findElement(By.xpath("//input[@name='email_address']")).sendKeys("12345");
		exp.findElement(By.xpath("//span[text()='Subscribe']")).click();
		}

}
