package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsltXpath1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://user.readylink.in/customer_portal");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/form/div[2]/div/input")).sendKeys("Madhu");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/form/div[3]/div/input")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/form/div[4]/div/div/div/label/input")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/form/div[5]/div/div/button")).click();
		}

}
