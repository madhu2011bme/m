package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsltPrgm3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://selfcare.actcorp.in/home");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/app-root/mat-drawer-container/mat-drawer-content/app-landing/div[4]/div[5]/input[2]")).sendKeys("9787947676");
		
	}

}
