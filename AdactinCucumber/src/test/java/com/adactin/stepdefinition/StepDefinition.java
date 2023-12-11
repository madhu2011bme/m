package com.adactin.stepdefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.AdactinRunner;
import com.baseclass.BaseClass;
import com.pom.Login;
import com.properties.FileReaderManager;
import com.sdp.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {

//	public static WebDriver driver = BaseClass.browserLaunch("chrome");
	public static FileReaderManager file=new FileReaderManager();

	public static PageObjectManager pom = new PageObjectManager(driver);

	@Given("^user Launch The Url In Adactin Application$")
	public void user_Launch_The_Url_In_Adactin_Application() throws Throwable {
		String url =FileReaderManager.getInstance().getInstanceCR().getUrl();
		get(url);
	}

	@When("^user Enters The Username In Username Field$")
	public void user_Enters_The_Username_In_Username_Field() throws Throwable {
		inputElement(pom.getInstanceLp().getUsername(), "MadhubalaRavi");
	}

	@When("^user Enters The Password In Password Field$")
	public void user_Enters_The_Password_In_Password_Field() throws Throwable {
		inputElement(pom.getInstanceLp().getPassword(), "Madhu11bala");
	}

	@Then("^user Click The Login Button And It Navigates to Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_to_Search_Hotel_Page() throws Throwable {
		clickElement(pom.getInstanceLp().getLogin());
	}

	@When("^user Selects The Location From Hotel Location Dropdown Option$")
	public void user_Selects_The_Location_From_Hotel_Location_Dropdown_Option() throws Throwable {
		selectElement(pom.getInstanceBh().getLocation(), "byindex", 3);
	}

	@When("^user Selects The Hotel From Hotel Name Dropdown Option$")
	public void user_Selects_The_Hotel_From_Hotel_Name_Dropdown_Option() throws Throwable {
		selectElement(pom.getInstanceBh().getHotel(), "byvalue", "Hotel Hervey");
	}

	@When("^user Selects Roomtype From Room Type Dropdown Option$")
	public void user_Selects_Roomtype_From_Room_Type_Dropdown_Option() throws Throwable {
		selectElement(pom.getInstanceBh().getRoomtype(), "byVisiblevalue", "Deluxe");
	}

	@When("^user Selects Number OF Rooms From Number OF Rooms Dropdown Option$")
	public void user_Selects_Number_OF_Rooms_From_Number_OF_Rooms_Dropdown_Option() throws Throwable {
		selectElement(pom.getInstanceBh().getRoomnumber(), "byindex", 2);
	}

	@When("^user Enters Check-In Date In Check In Date Field$")
	public void user_Enters_Check_In_Date_In_Check_In_Date_Field() throws Throwable {
		clearData(pom.getInstanceBh().getCheckindate());
		inputElement(pom.getInstanceBh().getCheckindate(), "12/12/2023");
	}

	@When("^user Enters Check-Out Date In Check Out Date Field$")
	public void user_Enters_Check_Out_Date_In_Check_Out_Date_Field() throws Throwable {
		clearData(pom.getInstanceBh().getCheckoutdate());
		inputElement(pom.getInstanceBh().getCheckoutdate(), "14/12/2023");
	}

	@When("^user Selects Number From Adults Per Room Option$")
	public void user_Selects_Number_From_Adults_Per_Room_Option() throws Throwable {
		selectElement(pom.getInstanceBh().getAdultperroom(), "byvalue", "2");
	}

	@When("^user Selects Number From Children Per Room Option$")
	public void user_Selects_Number_From_Children_Per_Room_Option() throws Throwable {
		selectElement(pom.getInstanceBh().getChildperroom(), "byvalue", "1");
	}

	@Then("^user Click Search Button And It Navigates to Hotel Selection Page$")
	public void user_Click_Search_Button_And_It_Navigates_to_Hotel_Selection_Page() throws Throwable {
		clickElement(pom.getInstanceBh().getSearch());
	}

	@When("^user Selects The Hotel With Appropriate Requirements In List Available In Current Page$")
	public void user_Selects_The_Hotel_With_Appropriate_Requirements_In_List_Available_In_Current_Page()
			throws Throwable {
		clickElement(pom.getInstanceSh().getChoose());
	}

	@Then("^user Click Continue Button And It Navigates to Hotel Book Page$")
	public void user_Click_Continue_Button_And_It_Navigates_to_Hotel_Book_Page() throws Throwable {
		clickElement(pom.getInstanceSh().getCont());
	}

	@When("^user Enter The First name In First Name Field$")
	public void user_Enter_The_First_name_In_First_Name_Field() throws Throwable {
		String firstdata = readData(".\\Excel\\NewData.xlsx", 1, 1, 0);
		inputElement(pom.getInstanceCd().getFirstname(), firstdata);
	}

	@When("^user Enter The Last name In Last Name Field$")
	public void user_Enter_The_Last_name_In_Last_Name_Field() throws Throwable {
		String lastdata = readData(".\\Excel\\NewData.xlsx", 1, 1, 1);
		inputElement(pom.getInstanceCd().getLastname(), lastdata);
	}

	@When("^user Enter The Address In Billing Address Field$")
	public void user_Enter_The_Address_In_Billing_Address_Field() throws Throwable {
		String addressdata = readData(".\\Excel\\NewData.xlsx", 1, 1, 2);
		inputElement(pom.getInstanceCd().getAddress(), addressdata);
	}

	@When("^user Enter (\\d+) Digit Credit Card Number In Credit Card Number Field$")
	public void user_Enter_Digit_Credit_Card_Number_In_Credit_Card_Number_Field(int arg1) throws Throwable {
		inputElement(pom.getInstanceCd().getCcnum(), "2132345767543112");
	}

	@When("^user Selects The Credit Card Type From Credit Card Type Option$")
	public void user_Selects_The_Credit_Card_Type_From_Credit_Card_Type_Option() throws Throwable {
		selectElement(pom.getInstanceCd().getCctype(), "byvalue", "MAST");
	}

	@When("^user Selects Expiry Month And Year From Month And Year Option$")
	public void user_Selects_Expiry_Month_And_Year_From_Month_And_Year_Option() throws Throwable {
		selectElement(pom.getInstanceCd().getCcmonth(), "byvalue", "3");
		selectElement(pom.getInstanceCd().getCcyear(), "byvalue", "2026");
	}

	@When("^user Enter CVV Number In CVV Number Field$")
	public void user_Enter_CVV_Number_In_CVV_Number_Field() throws Throwable {
		String cccvvdata = readData(".\\Excel\\NewData.xlsx", 1, 3, 1);
		inputElement(pom.getInstanceCd().getCccvv(), cccvvdata);
	}

	@Then("^user Click Book Now Button And It Navigates to Booked Itinerary Page$")
	public void user_Click_Book_Now_Button_And_It_Navigates_to_Booked_Itinerary_Page() throws Throwable {
		clickElement(pom.getInstanceCd().getBook());
	}

	@When("^user Selects The Order Id Which Need To Be Cancelled In Booked Hotel List Available$")
	public void user_Selects_The_Order_Id_Which_Need_To_Be_Cancelled_In_Booked_Hotel_List_Available() throws Throwable {
		clickElement(pom.getInstanceLop().getItinerary());
	}

	@Then("^user Click Logout Button And The User Is Logged-Out From The Booking Page$")
	public void user_Click_Logout_Button_And_The_User_Is_Logged_Out_From_The_Booking_Page() throws Throwable {
		clickElement(pom.getInstanceLop().getLogout());
	}

	// public static WebDriver driver = AdactinRunner.driver;
//	@Given("^user Launch The Url In Adactin Application$")
//	public void user_Launch_The_Url_In_Adactin_Application() throws Throwable {
//		driver.get("https://adactinhotelapp.com/");
//	}
//
//	@When("^user Enters The Username In Username Field$")
//	public void user_Enters_The_Username_In_Username_Field() throws Throwable {
//		Login lp = new Login(driver);
//		inputElement(lp.getUsername(), "MadhubalaRavi");
//	}
//
//	@When("^user Enters The Password In Password Field$")
//	public void user_Enters_The_Password_In_Password_Field() throws Throwable {
//		Login lp = new Login(driver);
//		inputElement(lp.getPassword(), "MadhubalaRavi");
//	}
//
//	@Then("^user Click The Login Button And It Navigates to Search Hotel Page$")
//	public void user_Click_The_Login_Button_And_It_Navigates_to_Search_Hotel_Page() throws Throwable {
//		driver.findElement(By.xpath("//input[@type='Submit']")).click();
//	}
//
//	@When("^user Selects The Location From Hotel Location Dropdown Option$")
//	public void user_Selects_The_Location_From_Hotel_Location_Dropdown_Option() throws Throwable {
//		WebElement findElement1 = driver.findElement(By.xpath("//select[@name='location']"));
//		Select a = new Select(findElement1);
//		a.selectByValue("London");
//	}
//
//	@When("^user Selects The Hotel From Hotel Name Dropdown Option$")
//	public void user_Selects_The_Hotel_From_Hotel_Name_Dropdown_Option() throws Throwable {
//		WebElement findElement2 = driver.findElement(By.xpath("//select[@name='hotels']"));
//		Select b = new Select(findElement2);
//		b.selectByValue("Hotel Hervey");
//	}
//
//	@When("^user Selects Roomtype From Room Type Dropdown Option$")
//	public void user_Selects_Roomtype_From_Room_Type_Dropdown_Option() throws Throwable {
//		WebElement findElement3 = driver.findElement(By.xpath("//select[@id='room_type']"));
//		Select c = new Select(findElement3);
//		c.selectByVisibleText("Deluxe");
//	}
//
//	@When("^user Selects Number OF Rooms From Number OF Rooms Dropdown Option$")
//	public void user_Selects_Number_OF_Rooms_From_Number_OF_Rooms_Dropdown_Option() throws Throwable {
//		WebElement findElement4 = driver.findElement(By.xpath("//select[@id='room_nos']"));
//		Select d = new Select(findElement4);
//		d.selectByValue("2");
//	}
//
//	@When("^user Enters Check-In Date In Check In Date Field$")
//	public void user_Enters_Check_In_Date_In_Check_In_Date_Field() throws Throwable {
//		driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
//		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("10/10/2023");
//	}
//
//	@When("^user Enters Check-Out Date In Check Out Date Field$")
//	public void user_Enters_Check_Out_Date_In_Check_Out_Date_Field() throws Throwable {
//		driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("12/10/2023");
//	}
//
//	@When("^user Selects Number From Adults Per Room Option$")
//	public void user_Selects_Number_From_Adults_Per_Room_Option() throws Throwable {
//		WebElement findElement5 = driver.findElement(By.xpath("//select[@id='adult_room']"));
//		Select e = new Select(findElement5);
//		e.selectByValue("2");
//	}
//
//	@When("^user Selects Number From Children Per Room Option$")
//	public void user_Selects_Number_From_Children_Per_Room_Option() throws Throwable {
//		WebElement findElement6 = driver.findElement(By.xpath("//select[@id='child_room']"));
//		Select f = new Select(findElement6);
//		f.selectByValue("1");
//	}
//
//	@Then("^user Click Search Button And It Navigates to Hotel Selection Page$")
//	public void user_Click_Search_Button_And_It_Navigates_to_Hotel_Selection_Page() throws Throwable {
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//	}
//
//	@When("^user Selects The Hotel With Appropriate Requirements In List Available In Current Page$")
//	public void user_Selects_The_Hotel_With_Appropriate_Requirements_In_List_Available_In_Current_Page()
//			throws Throwable {
//		driver.findElement(By.xpath("//input[@type='radio']")).click();
//	}
//
//	@Then("^user Click Continue Button And It Navigates to Hotel Book Page$")
//	public void user_Click_Continue_Button_And_It_Navigates_to_Hotel_Book_Page() throws Throwable {
//		driver.findElement(By.xpath("//input[@value='Continue']")).click();
//	}
//
//	@When("^user Enter The First name In First Name Field$")
//	public void user_Enter_The_First_name_In_First_Name_Field() throws Throwable {
//		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Madhubala");
//	}
//
//	@When("^user Enter The Last name In Last Name Field$")
//	public void user_Enter_The_Last_name_In_Last_Name_Field() throws Throwable {
//		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Ravi");
//	}
//
//	@When("^user Enter The Address In Billing Address Field$")
//	public void user_Enter_The_Address_In_Billing_Address_Field() throws Throwable {
//		driver.findElement(By.xpath("//textarea[@name='address']"))
//				.sendKeys("No.122, Narayanaswamy Enclave" + "\n" + "Coimbatore");
//	}
//
//	@When("^user Enter (\\d+) Digit Credit Card Number In Credit Card Number Field$")
//	public void user_Enter_Digit_Credit_Card_Number_In_Credit_Card_Number_Field(int arg1) throws Throwable {
//		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("7898543223421211");
//	}
//
//	@When("^user Selects The Credit Card Type From Credit Card Type Option$")
//	public void user_Selects_The_Credit_Card_Type_From_Credit_Card_Type_Option() throws Throwable {
//		WebElement findElement7 = driver.findElement(By.xpath("//select[@id='cc_type']"));
//		Select g = new Select(findElement7);
//		g.selectByValue("MAST");
//	}
//
//	@When("^user Selects Expiry Month And Year From Month And Year Option$")
//	public void user_Selects_Expiry_Month_And_Year_From_Month_And_Year_Option() throws Throwable {
//		WebElement findElement8 = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
//		Select h = new Select(findElement8);
//		h.selectByValue("3");
//		WebElement findElement9 = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
//		Select i = new Select(findElement9);
//		i.selectByValue("2026");
//	}
//
//	@When("^user Enter CVV Number In CVV Number Field$")
//	public void user_Enter_CVV_Number_In_CVV_Number_Field() throws Throwable {
//		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("381");
//	}
//
//	@Then("^user Click Book Now Button And It Navigates to Booked Itinerary Page$")
//	public void user_Click_Book_Now_Button_And_It_Navigates_to_Booked_Itinerary_Page() throws Throwable {
//		driver.findElement(By.xpath("//input[@value='Book Now']")).click();
//	}
//
//	@When("^user Selects The Order Id Which Need To Be Cancelled In Booked Hotel List Available$")
//	public void user_Selects_The_Order_Id_Which_Need_To_Be_Cancelled_In_Booked_Hotel_List_Available() throws Throwable {
//		driver.findElement(By.xpath("//input[@id='my_itinerary']")).click();
//		driver.findElement(By.xpath("(//input[@name='ids[]'])[1]")).click();
//	}
//
//	@Then("^user Click Cancel Selected Button And A Pop-Up Dialog Box Appears$")
//	public void user_Click_Cancel_Selected_Button_And_A_Pop_Up_Dialog_Box_Appears() throws Throwable {
//		driver.findElement(By.xpath("//input[@value='Cancel Selected']")).click();
//	}
//
//	@Then("^user Click OK Button And The Pop-Up Dialog Box Disappears$")
//	public void user_Click_OK_Button_And_The_Pop_Up_Dialog_Box_Disappears() throws Throwable {
//		driver.switchTo().alert().accept();
//	}
//
//	@Then("^user Click Logout Button And The User Is Logged-Out From The Booking Page$")
//	public void user_Click_Logout_Button_And_The_User_Is_Logged_Out_From_The_Booking_Page() throws Throwable {
//
//	}

}