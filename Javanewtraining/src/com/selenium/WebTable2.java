package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver-win64//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
        driver.navigate().to("https://cosmocode.io/automation-practice-webtable/");
		List<WebElement> table= driver.findElements(By.xpath("//table/tbody/tr/td"));
		for(WebElement tab:table) {
		System.out.println(tab.getText());}
		System.out.println("");
		WebElement output=driver.findElement(By.xpath("//table/tbody/tr[75]/td[3]"));
		System.out.println(output.getText());
			}

}
