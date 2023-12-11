package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver-win64//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/webtables");
		WebElement output=driver.findElement(By.xpath("//div[text()='Cantrell']"));
		System.out.println(output.getText());
	}

}
