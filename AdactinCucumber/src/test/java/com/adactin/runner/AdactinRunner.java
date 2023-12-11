package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.BaseClass;
import com.properties.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src//test//java//com//adactin//feature//Adactin.feature",
glue="com.adactin.stepdefinition") 
//monochrome= true,
//dryRun= false,
//strict= true,
//tags= ("@loginModule,@requirementModule,@selectModule"),
//plugin= {"html:Reportfile/Html_Report",
//		"pretty", 
//		"json:Reportfile/Json_Report.json",
//		"com.cucumber.listener.ExtentCucumberFormatter:Reportfile/Extent_Report.html"}
public class AdactinRunner extends BaseClass {
	public static WebDriver driver;
	@BeforeClass
	public static void setUp() throws IOException {
		String browser=FileReaderManager.getInstance().getInstanceCR().getBrowser();
		browserLaunch(browser);
	}
	@AfterClass
public static void tearDown() {
	//driver.close();		
	}
	
}
