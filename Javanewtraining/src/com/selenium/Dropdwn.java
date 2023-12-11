package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdwn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver-win64//chromedriver.exe");
		WebDriver exp= new ChromeDriver();
		exp.get("https://demoqa.com/select-menu");
		Thread.sleep(4000);
		exp.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[3]")).click();
exp.findElement(By.xpath("//div[text()='Green']")).click();
exp.findElement(By.xpath("//div[text()='Black']")).click();

//		
//	    exp.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("ind");
//	    Thread.sleep(2000);
//	    exp.findElement(By.xpath("//div[text()='India']")).click();
//		WebElement findElement1=exp.findElement(By.xpath("//select[@name='demo_groups']"));
//		Select b=new Select(findElement1);
//		b.selectByIndex(4);
//		WebElement findElement2=exp.findElement(By.xpath("//select[@name='demo_cover']"));
//		Select c=new Select(findElement2);
//		c.selectByVisibleText("Three");
//		WebElement findElement3=exp.findElement(By.xpath("//select[@name='demo_native']"));
//		Select d=new Select(findElement3);
//		boolean multiple=d.isMultiple();
//		System.out.println(multiple);
//
//		List<WebElement> options= d.getOptions();
//		for(WebElement x:options)
//		{
//			System.out.println(x.getText());
//		}
//		WebElement findElement4=exp.findElement(By.xpath("//select[@name='demo_links']"));
//		Select e=new Select(findElement4);
//		e.selectByVisibleText("Boing Boing");
//		
	}

}
