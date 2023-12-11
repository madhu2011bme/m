package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsltXpath2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://netbanking.kotak.com/knb2/");
		driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/div[3]/div/div/div/app-crn-card-nick/app-card-layout/div/form/div[2]/div/input")).sendKeys("Madhu");
		driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/div[3]/div/div/div/app-crn-card-nick/app-card-layout/div/form/div[4]/div[2]/input")).sendKeys("34ETM");
		driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/div[3]/div/div/div/app-crn-card-nick/app-card-layout/div/form/div[7]/button")).click();
		//Thread.sleep(2000);
		
		
	}

}
