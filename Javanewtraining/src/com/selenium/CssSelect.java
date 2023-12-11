package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		driver.findElement(By.cssSelector("[name='firstname']")).sendKeys("Madhu");
		driver.findElement(By.cssSelector("[name^='last']")).sendKeys("bala");
		driver.findElement(By.cssSelector("input#password_step_input")).sendKeys("Alliswell");
		driver.findElement(By.cssSelector("[name$='ail__']")).sendKeys("9787947676");
		driver.findElement(By.cssSelector("[name*='web']")).click();
			
	}

}
