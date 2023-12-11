package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Prjt {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String a = driver.getTitle();
		String b = "faCEBoOK";
		if (a.toLowerCase().contains(b.toLowerCase()));
		{
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Madhubala");
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Madhubala");
			driver.findElement(By.xpath("//button[@name='login']")).click();
			TakesScreenshot c= (TakesScreenshot) driver;
			File src=c.getScreenshotAs(OutputType.FILE);
			File destin= new File("C:\\Users\\WELCOME\\eclipse-workspace\\Javanewtraining\\Screenshot\\FbError1.png");
	        FileUtils.copyFile(src, destin);
	}
		 driver.navigate().back();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Madhu");
		 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9922992211");
		 driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("m@dhu");
		 WebElement findElement1 = driver.findElement(By.xpath("//select[@id='day']"));
			Select d = new Select(findElement1);
			d.selectByValue("2");
			Thread.sleep(1000);
			WebElement findElement2 = driver.findElement(By.xpath("//select[@id='month']"));
			Select e = new Select(findElement2);
			e.selectByValue("5");
			Thread.sleep(1000);
			WebElement findElement3 = driver.findElement(By.xpath("//select[@id='year']"));
			Select f = new Select(findElement3);
			f.selectByValue("1993");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//label[text()='Female']")).click();
			driver.findElement(By.xpath("//button[@name='websubmit']")).click();
			TakesScreenshot x= (TakesScreenshot) driver;
			File src1=x.getScreenshotAs(OutputType.FILE);
			File destin1= new File("C:\\Users\\WELCOME\\eclipse-workspace\\Javanewtraining\\Screenshot\\FbError2.png");
	        FileUtils.copyFile(src1, destin1);
	        Thread.sleep(2000);
	        driver.close(); 
	}

}
