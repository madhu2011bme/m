package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Alrt4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver-win64//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		Actions a=new Actions(driver);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Hi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='idOfButton']")).click();
		Thread.sleep(1000);
		WebElement findElement = driver.findElement(By.xpath("//button[@id='dblClkBtn']"));
		a.doubleClick(findElement).perform();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='female']")).click();
		driver.findElement(By.xpath("//input[@class='Automation']")).click();
		Thread.sleep(1000);
		WebElement findElement1 = driver.findElement(By.xpath("//select[@id='testingDropdown']"));
		Select c = new Select(findElement1);
		c.selectByVisibleText("Automation Testing");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		
		
		
		
		
	}

}
