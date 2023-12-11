package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver-win64//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://qavbox.github.io/demo/webtable/");
		List<WebElement> table= driver.findElements(By.xpath("//table/tbody/tr/td"));
		List<WebElement> table1= driver.findElements(By.xpath("//table/thead/tr/th"));
		for(WebElement tab:table1) {
		System.out.println(tab.getText());}
		for(WebElement tab:table) {
			System.out.println(tab.getText());}
		}
		
	}


