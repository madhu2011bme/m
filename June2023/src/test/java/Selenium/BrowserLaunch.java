package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	public static void main(String[] args)
	{
     // System.setProperty("webdriver.chrome.driver","C:\\Users\\WELCOME\\Downloads\\chromedriver_win32\\chromedriver.exe"); 	
	WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		
	//webdriver.gecko.driver= firefox
    //WebDriverManager.firefoxdriver().setup();	
	//FirefoxDriver driver1= new FirefoxDriver();
		
	//webdriver.ie.driver=internetexplorer
    //WebDriverManager.iedriver().setup();
	//InternetExplorerDriver driver2= new InternetExplorer();
		
	//webdriver.edge.driver
	//WebDriverManager.edgedriver().setup();
	//EdgeDriver driver2= new Edgedriver();
			
 
	}

}
