$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User Login In Web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-web-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@loginModule"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Url In Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enters The Username In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enters The Password In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click The Login Button And It Navigates to Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Url_In_Adactin_Application()"
});
formatter.result({
  "duration": 6263233400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enters_The_Username_In_Username_Field()"
});
formatter.result({
  "duration": 372527300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enters_The_Password_In_Password_Field()"
});
formatter.result({
  "duration": 126702000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Login_Button_And_It_Navigates_to_Search_Hotel_Page()"
});
formatter.result({
  "duration": 861551100,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User Selects Requirements In Hotel Search Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-selects-requirements-in-hotel-search-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@requirementModule"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user Selects The Location From Hotel Location Dropdown Option",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user Selects The Hotel From Hotel Name Dropdown Option",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user Selects Roomtype From Room Type Dropdown Option",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user Selects Number OF Rooms From Number OF Rooms Dropdown Option",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user Enters Check-In Date In Check In Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user Enters Check-Out Date In Check Out Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user Selects Number From Adults Per Room Option",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Selects Number From Children Per Room Option",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Click Search Button And It Navigates to Hotel Selection Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Selects_The_Location_From_Hotel_Location_Dropdown_Option()"
});
formatter.result({
  "duration": 393727200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Selects_The_Hotel_From_Hotel_Name_Dropdown_Option()"
});
formatter.result({
  "duration": 237629400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Selects_Roomtype_From_Room_Type_Dropdown_Option()"
});
formatter.result({
  "duration": 200416700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Selects_Number_OF_Rooms_From_Number_OF_Rooms_Dropdown_Option()"
});
formatter.result({
  "duration": 246004000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enters_Check_In_Date_In_Check_In_Date_Field()"
});
formatter.result({
  "duration": 226227200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enters_Check_Out_Date_In_Check_Out_Date_Field()"
});
formatter.result({
  "duration": 220142500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Selects_Number_From_Adults_Per_Room_Option()"
});
formatter.result({
  "duration": 227899400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Selects_Number_From_Children_Per_Room_Option()"
});
formatter.result({
  "duration": 217728600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_Search_Button_And_It_Navigates_to_Hotel_Selection_Page()"
});
formatter.result({
  "duration": 489177700,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "User Selects Requirements In Hotel Search Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-selects-requirements-in-hotel-search-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@selectModule"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "user Selects The Hotel With Appropriate Requirements In List Available In Current Page",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user Click Continue Button And It Navigates to Hotel Book Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Selects_The_Hotel_With_Appropriate_Requirements_In_List_Available_In_Current_Page()"
});
formatter.result({
  "duration": 106010500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_Continue_Button_And_It_Navigates_to_Hotel_Book_Page()"
});
formatter.result({
  "duration": 493495700,
  "status": "passed"
});
});