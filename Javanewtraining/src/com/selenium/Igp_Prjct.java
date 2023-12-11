package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Igp_Prjct {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.igp.com/");
		driver.findElement(By.xpath("(//img[@alt='Cakes'])[1]")).click();
		driver.findElement(By.cssSelector("[alt='Designer Cake Online']")).click();
		List<WebElement> cakes=driver.findElements(By.xpath("//div[@class='product-grid-item product-grid-item-revamp col s3']"));
        System.out.println(cakes.size());	
        for(WebElement list: cakes ) {
        	String names= list.getText();
        	System.out.println(names);
        }
	}

}
