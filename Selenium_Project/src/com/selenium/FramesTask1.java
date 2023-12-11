package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesTask1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://ui.vision/demo/webtest/frames/");
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Frame1");
		
		WebElement frame=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		Thread.sleep(4000);
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Frame2");
		
	
	}

}
