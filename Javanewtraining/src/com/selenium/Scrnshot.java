package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Scrnshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver-win64//chromedriver.exe");
		WebDriver exp= new ChromeDriver();
		exp.navigate().to("https://ticketnew.com/movies");
		exp.manage().window().maximize();
		TakesScreenshot a= (TakesScreenshot) exp;
		File src=a.getScreenshotAs(OutputType.FILE);
		File destin= new File("C:\\Users\\WELCOME\\eclipse-workspace\\Javanewtraining\\Screenshot\\exp6.png");
       FileHandler.copy(src, destin); 
		exp.get("https://in.bookmyshow.com/");
		TakesScreenshot b= (TakesScreenshot) exp;
		File src1=b.getScreenshotAs(OutputType.FILE);
		File destin1= new File("C:\\Users\\WELCOME\\eclipse-workspace\\Javanewtraining\\Screenshot\\exp7.png");
      FileUtils.copyFile(src1, destin1);
	}

}
