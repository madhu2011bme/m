package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Orange_Prjt {

	@SuppressWarnings({ "unchecked", "deprecation" })
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String a = driver.getTitle();
		String b = "OrangeHRM";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		WebElement x = driver.findElement(By.xpath("(//p[@class='oxd-text oxd-text--p'])[1]"));
		String st = x.getText();
		String first = st.substring(0, 8);
		String second = st.substring(11, 16);
		WebElement c = driver.findElement(By.xpath("(//p[@class='oxd-text oxd-text--p'])[2]"));
		String pass = c.getText();
		String first1 = pass.substring(0, 8);
		String second2 = pass.substring(11, 19);
		WebElement y = driver.findElement(By.xpath("(//label[@class='oxd-label'])[1]"));
		String str = y.getText();
		WebElement z = driver.findElement(By.xpath("(//label[@class='oxd-label'])[2]"));
		String str1 = z.getText();
		System.out.println(str);
		if (a.equals(b)) {
			if (first.equals(str)) {
				driver.findElement(By.xpath("//input[@name='username']")).sendKeys(second);
			}
			if (first1.equals(str1)) {
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys(second2);
			}
		}
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='My Info']")).click();
		TakesScreenshot info = (TakesScreenshot) driver;
		File src = info.getScreenshotAs(OutputType.FILE);
		File destin = new File("C:\\Users\\WELCOME\\eclipse-workspace\\Javanewtraining\\Screenshot//MyInfoPage.png");
		FileUtils.copyFile(src, destin);
		Thread.sleep(500);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).clear();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("");
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]")).sendKeys("714");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@placeholder='yyyy-mm-dd'])[1]")).sendKeys("2024-06-04");
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[7]")).sendKeys("0098");
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[8]")).clear();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[8]")).sendKeys("7141-111-23");
		driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@placeholder='yyyy-mm-dd'])[2]")).clear();
		Thread.sleep(1000);
//	    driver.findElement(By.xpath("(//input[@placeholder='yyyy-mm-dd'])[2]")).sendKeys("1990-11-10");
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[10]")).sendKeys("NO");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Shreyas Anto A Kulkarni");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		TakesScreenshot admin = (TakesScreenshot) driver;
		File src1 = admin.getScreenshotAs(OutputType.FILE);
		File destin1 = new File("C:\\Users\\WELCOME\\eclipse-workspace\\Javanewtraining\\Screenshot\\Adminpage.png");
		FileUtils.copyFile(src1, destin1);
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		TakesScreenshot main = (TakesScreenshot) driver;
		File src2 = main.getScreenshotAs(OutputType.FILE);
		File destin2 = new File("C:\\Users\\WELCOME\\eclipse-workspace\\Javanewtraining\\Screenshot//Mainpage.png");
		FileUtils.copyFile(src2, destin2);
		Thread.sleep(500);
		driver.close();
	}

}
