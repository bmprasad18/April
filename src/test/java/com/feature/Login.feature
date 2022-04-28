Feature: Hotel Booking Using Adactin Application


Scenario: User Enter Into The Login Page
Given User_Launches_The_Browser
When User_Enter_The_Username_Field
And User_Enter _The_Password_Field
Then User_Clicks_The_LoginBtn_and_User_Navigate_To_HomePage



Scenario: User Searches The Hotel
When User_Searching_The_Location_From_DropDown
And User_Selecting_The_Hotel_from_Dropdown
And User_Selects_The_RoomType_From_DropDown
And User_Selects_The_Number_Of_Rooms_From_DropDown
And User_Enter_The_Check_In_Date
And User_Enter_The_Check_Out_Date
And User_Enters_Adults_Per_Room
And User_Enters_The_Children_Per_Room
Then User_Clicks_Search_Btn_and_Navigates_To_Selects_Hotel_Page



Scenario: User Selects The Hotel
When User_Selects_The_Hotel_Using_Radio_Btn
And User_Clicks_The_Continue_Btn
Then User_Navigate_To_The_Payment_Page



Scenario: User Confirms The Hotel Through Payments
When User_Enters_The_First_Name_In_First_Name_Field
And User_Enters_The_Last_Name_In_Last_Name_Field
And User_Enters_The_Billing_Address_In_Billing_Address_Field
And User_Enters_The_Credit_Card_No_In_Credit_Card_No_Field
And User_Enters_Credit_Card_Type
And User_Enters_Expiry_Date_Field
And User_Enters_CVV_Number
Then User_Click_Book_Now_Btn_and_Navigate_To_Booking_Confirmation_Field










