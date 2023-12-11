package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

public class BaseClass {
	public static WebDriver driver;
    public static String value;
    public static Properties prop;
    
	// 1. BrowserLaunch
	public static WebDriver browserLaunch(String type) throws IOException {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\WELCOME\\eclipse-workspace\\mavenproject\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Eclipse\\chromedriver-win64//chromedriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

//		2. Close
	public WebDriver close() {
		driver.close();
		return driver;
	}

//		3. Quit
	public static WebDriver quit() {
		driver.quit();
		return driver;
	}

//		 4. Navigate to
	public static WebDriver navigateTo(String type) {
		driver.navigate().to(type);
		return driver;
	}

//		 5. Navigate Back
	public static WebDriver navigateBack() {
		driver.navigate().back();
		return driver;
	}

//		 6. Navigate Forward
	public static WebDriver navigateForward() {
		driver.navigate().forward();
		return driver;
	}

//		 7. Navigate Refresh
	public static WebDriver navigateRefresh() {
		driver.navigate().refresh();
		return driver;
	}

//		 8. Get
	public static WebDriver get(String type) {
		driver.get(type);
		return driver;
	}

//		9. Alert
	public static void alert(String type, String value) {
		if (type.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		} else if (type.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		} else if (type.equalsIgnoreCase("sendkeys")) {
			driver.switchTo().alert().sendKeys(value);
		}
	}

	// 10. Actions
	public static void actions(String type, WebElement element) {
		Actions a = new Actions(driver);
		if (type.equalsIgnoreCase("click")) {
			a.click(element).build().perform();
		} else if (type.equalsIgnoreCase("doubleclick")) {
			a.doubleClick(element).build().perform();
		} else if (type.equalsIgnoreCase("contextclick")) {
			a.contextClick(element).build().perform();
		} else if (type.equalsIgnoreCase("movetoelement")) {
			a.moveToElement(element).build().perform();
		} else if (type.equalsIgnoreCase("draganddrop")) {
			a.dragAndDrop(element, element).build().perform();
		}
	}

	// 11. Frames
	public static void frames(String type, Object value) {
		if (type.equalsIgnoreCase("index")) {
			driver.switchTo().frame((int) value);
		} else if (type.equalsIgnoreCase("id")) {
			driver.switchTo().frame((String) value);
		} else if (type.equalsIgnoreCase("name")) {
			driver.switchTo().frame((String) value);
		} else if (type.equalsIgnoreCase("WebElement")) {
			driver.switchTo().frame((String) value);
		} else if (type.equalsIgnoreCase("defaultcontent")) {
			driver.switchTo().defaultContent();
		} else if (type.equalsIgnoreCase("parentframe")) {
			driver.switchTo().parentFrame();
		}
	}

	// 12. Robot
	public static void robot(String type, int function) throws AWTException {
		Robot r = new Robot();
		if (type.equalsIgnoreCase("keypress")) {
			r.keyPress(function);
		} else if (type.equalsIgnoreCase("keyrelease")) {
			r.keyRelease(function);
		}
	}

	// 13. WindowHandles
	public static void windowHandle(String value) {
		driver.switchTo().window(value);
	}

	public static void windowHandles(String value) {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String window : windowHandles) {
			driver.switchTo().window(window);
		}
	}

	// 14. Drop down
	public static void selectElement(WebElement element, String type, Object value) {
		Select a = new Select(element);
		if (type.equalsIgnoreCase("byvalue")) {
			a.selectByValue((String) value);
		} else if (type.equalsIgnoreCase("byvisiblevalue")) {
			a.selectByVisibleText((String) value);
		} else if (type.equalsIgnoreCase("byindex")) {
			a.selectByIndex((int) value);
		}
	}

	// 15. CheckBox
	public static void checkBox(WebElement element) {
		element.click();
	}

	// 16. Is enable
	public static void isEnable(WebElement element) {
		element.isEnabled();
	}

	// 17. Is disabled
	public static void isDisplayed(WebElement element) {
		element.isDisplayed();
	}

	// 18. Is selected
	public static void isSelected(WebElement element) {
		element.isSelected();
	}

	// 19. Get options
	public static void getOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement list : options) {
			System.out.println(list.getText());
		}
	}

	// 20. Get title
	public static WebDriver getTitle(String type) {
		driver.getTitle();
		return driver;
	}

	// 21. Get current Url
	public static WebDriver getCurrentUrl(String url) {
		driver.getCurrentUrl();
		return driver;
	}

	// 22. Get Text
	public static void getText(WebElement element) {
		element.getText();
	}

	// 23. Get attribute
	public static void getAttribute(WebElement element, String value) {
		element.getAttribute(value);
	}

	// 24. Wait
	public static void implicitWait(int a, TimeUnit unit) {
		driver.manage().timeouts().implicitlyWait(a, unit);
	}

	public static void explicitWait(WebElement element, int a) {
		WebDriverWait wait = new WebDriverWait(driver, a);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	// 25. Take screenshot
	public static void takeScreenShot(String path) throws IOException {
		TakesScreenshot scrshot = (TakesScreenshot) driver;
		File srcfile = scrshot.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(srcfile, destination);
	}

	// 26. Scroll Up and down
	// 27. SendKeys
	public static void inputElement(WebElement element, String value) {
		element.sendKeys(value);
	}

	// 28. Get first selected options
	public static void getFirstSelectedOption(WebElement element) {
		Select a = new Select(element);
		a.getFirstSelectedOption();
	}

	// 29. Get all selected options
	public static void getAllSelectedOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement list : allSelectedOptions) {
			list.getText();
		}
	}

	// 30. Is multiple
	public static void isMultiple(WebElement element) {
		Select a = new Select(element);
		a.isMultiple();
	}

	// 31. Click
	public static void clickElement(WebElement element) {
		element.click();
	}

	// 32. RadioButton
	public static void radioButton(WebElement element) {
		element.click();
	}

//	 33. Clear
	public static void clear(WebElement element) {
		element.clear();
	}
//	34. ReadData
    public static String readData(String path, int sheet_Index,int row_Index, int cell_Index) throws IOException{
    	File f=new File(path);
    	FileInputStream fis= new FileInputStream(f);
    	Workbook wb=new XSSFWorkbook(fis);
    	Sheet sheetAt= wb.getSheetAt(sheet_Index);
    	Row row= sheetAt.getRow(row_Index);
    	Cell cell=row.getCell(cell_Index);
    	CellType cellType=cell.getCellType();
    	if(cellType.equals(CellType.STRING)) {
    		value=cell.getStringCellValue();}
    		else if(cellType.equals(CellType.NUMERIC)){
    			  double numericCellValue = cell.getNumericCellValue();
    			        int data=(int) numericCellValue;
    			        value=String.valueOf(data);
    			        	}
    	wb.close();
    	return value;
    	}
	public static void deselectElement(WebElement element, String type, Object value) {
		Select a = new Select(element);
		if (type.equalsIgnoreCase("byvalue")) {
			a.deselectByValue((String) value);
		} else if (type.equalsIgnoreCase("byvisiblevalue")) {
			a.deselectByVisibleText((String) value);
		} else if (type.equalsIgnoreCase("byindex")) {
			a.deselectByIndex((int) value);
		}
	}
}
