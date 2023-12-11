package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Prjt {

	@SuppressWarnings({ "deprecation"})
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		String a = driver.getCurrentUrl();
		String b = "amazon";
		if (a.contains(b));{
			WebElement findElement=driver.findElement(By.xpath("//select[@name='url']"));
			Select x=new Select(findElement);
			x.selectByVisibleText("Books");
			List<WebElement> options= x.getOptions();
			for(WebElement y:options)
			{
			System.out.println(y.getText());
			}
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Comics");
		List<WebElement> findElement1=driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
        for(WebElement list:findElement1) {
        	String t="comics";
        	String text = list.getText();
        	if(text.equals(t)) {
        		driver.findElement(By.xpath("//input[@type='submit']")).click();
        		driver.findElement(By.xpath("//span[text()='Results']//ancestor::div[4]//parent::div[1]//div[@data-index='3']//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']")).click();
        		String windowHandle = driver.getWindowHandle();
        		Set<String> windowHandles = driver.getWindowHandles();
        		for(String abc:windowHandles) {
        			if(!abc.equals(windowHandle)) {
        				driver.switchTo().window(abc);
        				WebElement findElement2 = driver.findElement(By.xpath("//span[@id='productTitle']"));
        				System.out.println(findElement2.getText());
        				driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        				TakesScreenshot tc= (TakesScreenshot) driver;
        				File src=tc.getScreenshotAs(OutputType.FILE);
        				File destin= new File("C:\\Users\\WELCOME\\eclipse-workspace\\Selenium_Project\\Screeshot1\\exp1.png");
        		       FileHandler.copy(src, destin); 
        		       driver.findElement(By.xpath("//input[@value='Proceed to checkout']")).click();
        		       TakesScreenshot ts= (TakesScreenshot) driver;
       				File src1=ts.getScreenshotAs(OutputType.FILE);
       				File destin1= new File("C:\\Users\\WELCOME\\eclipse-workspace\\Selenium_Project\\Screeshot1\\exp2.png");
       		       FileHandler.copy(src1, destin1);
       		    driver.close();
        			}
        			
        		}
        	}
        	
        }
	
		}
		}}

