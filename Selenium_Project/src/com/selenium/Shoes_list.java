package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shoes_list {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.metroshoes.com/men-shoes/occasion/ethnic.html");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//span[@style='color:#000;'])[6]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//a[text()='Ethnic Shoes'])[1]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//a[text()='Casual Shoes'])[5]")).click();
		List<WebElement> shoes=driver.findElements(By.xpath("//div[@class='col-md-3 col-sm-6 col-xs-6 col-6 new-class']"));
        System.out.println(shoes.size());	
        for(WebElement list: shoes ) {
        	String names= list.getText();
        	System.out.println(names);
        }        
	}

}
