package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alrt2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver-win64//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='alertBox']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='promptBox']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Madhubala");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		
	}

}
