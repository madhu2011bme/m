package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionPrg {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);	
		 WebElement mini = driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
			Actions abc= new Actions(driver);
			abc.contextClick(mini).build().perform();
			Robot a= new Robot();
			a.keyPress(KeyEvent.VK_DOWN);
			a.keyRelease(KeyEvent.VK_DOWN);
			a.keyPress(KeyEvent.VK_ENTER);
			a.keyRelease(KeyEvent.VK_ENTER);
			
			
			WebElement sell = driver.findElement(By.xpath("//a[text()='Sell']"));
			Actions exp= new Actions(driver);
			exp.contextClick(sell).build().perform();
			Robot b= new Robot();
			b.keyPress(KeyEvent.VK_DOWN);
			b.keyRelease(KeyEvent.VK_DOWN);
			b.keyPress(KeyEvent.VK_ENTER);
			b.keyRelease(KeyEvent.VK_ENTER);
			
			String windowHandle=driver.getWindowHandle();
			System.out.println(windowHandle);
			Thread.sleep(2000);
			Set<String> windowHandles=driver.getWindowHandles();
			for(String x:windowHandles)
				{
				System.out.println(x);
			if(!windowHandle.equals(x)) {
				driver.switchTo().window(x);	
				Thread.sleep(1000);	
			}
			else {	
			}
				}
				}		
	}
