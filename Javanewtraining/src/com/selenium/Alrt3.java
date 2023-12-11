package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alrt3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver-win64//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		Actions a=new Actions(driver);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='alert']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='confirmation']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='prompt']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("Hi");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		WebElement findElement = driver.findElement(By.xpath("//button[text()='double-click']"));
		a.doubleClick(findElement).perform();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		
	}

}
