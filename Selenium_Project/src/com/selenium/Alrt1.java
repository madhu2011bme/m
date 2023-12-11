package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alrt1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver-win64//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@id='alertButton']")).click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
	Thread.sleep(5000);
	driver.switchTo().alert().accept();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[4]")).click();
	Thread.sleep(4000);
	driver.switchTo().alert().sendKeys("Madhu");
	Thread.sleep(4000);
	driver.switchTo().alert().accept();	

	}

}
