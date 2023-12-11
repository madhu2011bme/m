package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateData {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver-win64//chromedriver.exe");
		WebDriver exp= new ChromeDriver();
		exp.get("https://formstone.it/components/dropdown/demo/");
		Thread.sleep(5000);
		exp.findElement(By.xpath("//select[@id='demo_native']")).click();
		List<WebElement> options= exp.findElements(By.xpath("//select[@id='demo_native']"));
		 System.out.println(options.size());	
	        for(WebElement list: options) {
	        	String names= list.getText();
	        	System.out.println(names);
	        	String a= "Two";
	        	if(a.equals(names)) {
	        		System.out.println("Validation executed");
	        	}
	        	else {
	        		System.out.println("Not valid");
	        	}
	        }        
		
	}

}
