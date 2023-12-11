Feature: Hotel Booking In Adactin Application
@loginModule
Scenario: User Login In Web Application
Given user Launch The Url In Adactin Application
When user Enters The Username In Username Field
And user Enters The Password In Password Field
Then user Click The Login Button And It Navigates to Search Hotel Page

@requirementModule
Scenario: User Selects Requirements In Hotel Search Page 
When user Selects The Location From Hotel Location Dropdown Option
And user Selects The Hotel From Hotel Name Dropdown Option
And user Selects Roomtype From Room Type Dropdown Option
And user Selects Number OF Rooms From Number OF Rooms Dropdown Option
And user Enters Check-In Date In Check In Date Field
And user Enters Check-Out Date In Check Out Date Field
And user Selects Number From Adults Per Room Option
And user Selects Number From Children Per Room Option
Then user Click Search Button And It Navigates to Hotel Selection Page

@selectModule
Scenario: User Selects Requirements In Hotel Search Page 
When user Selects The Hotel With Appropriate Requirements In List Available In Current Page
Then user Click Continue Button And It Navigates to Hotel Book Page

@paymentDetail
Scenario: User Enter Personal And Card Details for Booking in Hotel Book Page 
When user Enter The First name In First Name Field
And user Enter The Last name In Last Name Field
And user Enter The Address In Billing Address Field
And user Enter 16 Digit Credit Card Number In Credit Card Number Field
And user Selects The Credit Card Type From Credit Card Type Option
And user Selects Expiry Month And Year From Month And Year Option
And user Enter CVV Number In CVV Number Field
Then user Click Book Now Button And It Navigates to Booked Itinerary Page

@confirmModule
Scenario: User Selects Order Id If Need to Cancel in Booked Itinerary Page 
When user Selects The Order Id Which Need To Be Cancelled In Booked Hotel List Available
Then user Click Cancel Selected Button And A Pop-Up Dialog Box Appears
Then user Click OK Button And The Pop-Up Dialog Box Disappears
Then user Click Logout Button And The User Is Logged-Out From The Booking Page








