package Header_Home_Page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Reusable_functions.Generic_functions;

public class Header_home_page_Script extends Generic_functions {
	public static boolean value;
	/* Application Launch*/
	@Given("App is open")
	public static void app_launch() {
		try {
			App_Launch();
			page_wait(20);
		} catch (IOException e) {
			e.getMessage();
		}
		}
	
	
	@Then("check the mpowered health logo or hamburger  should be present in the header")
	/*TC 001 - Validate that the  mpowered health logo or hamburger should be present in the header*/
	public static void header_positive_tc_001() throws IOException {
		try {
			click("Welcome_login");
			driver.findElement(By.xpath(OR_reader("Object_Locator", "Phone_number"))).sendKeys(td_reader("Phone_number"));
			driver.findElement(By.xpath(OR_reader("Object_Locator", "Password"))).sendKeys(td_reader("Password",0));
			page_wait(20);
			click("Login");
			page_wait(20);
			//click("Welcome_login");
			page_wait(20);
			value = driver.findElementByClassName(OR_reader("Object_Locator", "Three_line")).isDisplayed();
			Assert.assertEquals(true,value);

		} catch (IOException e) {
			e.getMessage();
			takeScreenShot("header_positive_tc_001");
		}   
	}

	@When("User click on Drop down or  hamburger tab  to see the drown down options")
	/*TC 005 -Validate that user is able to click on the 'Drop down' or hamburger tab*/
	public static void  header_positive_tc_005() throws IOException {
		try {
			click("Three_line");
			page_wait(20);
			value = driver.findElement(By.xpath(OR_reader("Object_Locator","Profile"))).isDisplayed();
			Assert.assertEquals(true,value);
			
		} catch (IOException e) {
			e.getMessage();
			takeScreenShot("header_positive_tc_005");
		}
	}
	@When("User click on Drop down tab and click on  Your profile then  navigated to the profile page.")
	/*TC 006 -Validate that the user is navigated to the  profile page on clicking 'Your profile' tab*/
	public static  void header_positive_tc_006() throws IOException {
		page_wait(20);
		try {
			click("Profile");
			page_wait(20);
			value = driver.findElement(By.xpath(OR_reader("Object_Locator","Frist_name"))).isDisplayed();
			Assert.assertEquals(true,value);
			page_back();
		} catch (IOException e) {
			e.getMessage();
			takeScreenShot("header_positive_tc_006");
		}
	}
	@When("User click on Drop down tab and click on  Your ratings  then  navigated to the ratings dashboard page.")
	/*TC 007 -Validate that the user is navigated to the ratings dashboard page on clicking 'Your ratings' tab*/
	public static  void header_positive_tc_007() throws IOException {
		try {
			click("Three_line");
			page_wait(20);
			click("Rating");
			page_wait(20);
			value = driver.findElement(By.xpath(OR_reader("Object_Locator","Explore"))).isDisplayed();
			Assert.assertEquals(true,value);
			page_back();
			
		} catch (IOException e) {
			e.getMessage();
			takeScreenShot("header_positive_tc_007");
		}
		
	}
	@When("User click on Your alerts icon navigated to the alerts page")
	/*TC 004 -Validate that the user is navigated to the alerts page on clicking 'Your alerts' icon*/
	public static void  header_positive_tc_004() throws IOException {
		try {
			click("Three_line");
			page_wait(20);
			click("Alerts");
			page_wait(20);
			value = driver.findElement(By.xpath(OR_reader("Object_Locator","Your_alerts"))).isDisplayed();
			Assert.assertEquals(true,value);
			page_back();
		} catch (IOException e) {
			e.getMessage();
			takeScreenShot("header_positive_tc_004");
		}
		}
	@When("User click on Drop down tab and click on  Feedback  then  navigated to the Feedback Port.")
	/*TC 008 -Validate that the user is navigated to the 'Feedback Port'   page  on clicking 'Feedback'*/ 
	public static void header_positive_tc_008() throws IOException {
		try {
			click("Three_line");
			page_wait(20);
			click("Feedback");
			page_wait(20);
			value = driver.findElement(By.xpath(OR_reader("Object_Locator","Feedback_portal"))).isDisplayed();
			Assert.assertEquals(true,value);
			page_back();
	     } catch (IOException e) {
	    	 e.getMessage();
		     takeScreenShot("header_positive_tc_008");
		}
	}

	@When("User click on Help icon navigated to the help or FAQ page")
	/*TC 002 -Validate that the user is navigated to the help/FAQ page on clicking 'Help'/ 'FAQ' icon*/
	public static void header_positive_tc_002() throws IOException {
		try {
			page_wait(20);
			click("FAQ");
			page_wait(20);
			value = driver.findElement(By.xpath(OR_reader("Object_Locator","Frequently"))).isDisplayed();
			Assert.assertEquals(true,value);
			page_back();
		} catch (IOException e) {
			e.getMessage();
		     takeScreenShot("header_positive_tc_002");
		}   
	}
	@When("User click on Drop down tab and click on  Contact Us  then  navigated to the Contact Us.")
	/*TC 009 -Validate that the user is navigated to the Contact Us   page  on clicking Contact us */
	public static void header_positive_tc_009() {
		try {
			click("Three_line");
			page_wait(20);
			click("Contact");
			page_wait(20);
			value = driver.findElement(By.xpath(OR_reader("Object_Locator","Contact_us"))).isDisplayed();
			Assert.assertEquals(true,value);
			page_back();
		} catch (IOException e) {
			
		}
	}
	
	@When("User click on Drop down tab and click on  Privacy Policy then dialogue box will appear")
	/*TC 010 -Validate that the user is able to see Privacy Policy dialogue box on clicking on the 'Privacy Policy' */
	public static void header_positive_tc_010() throws IOException {
		try {
			click("Privacy");
			page_wait(20);
			value = driver.findElement(By.xpath(OR_reader("Object_Locator","P_ok"))).isDisplayed();
			Assert.assertEquals(true,value);
			page_wait(20);
			click("P_ok");
			
		} catch (IOException e) {
			e.getMessage();
			takeScreenShot("header_positive_tc_010");
		}
		
	}

	@When("User click on Drop down tab and click on  Terms & Conditions then dialogue box will appear")
	/*TC 011 - Validate that the user is able to see Terms & Conditions dialogue box on clicking on the 'Terms & Conditions' */
	public static void header_positive_tc_011() throws IOException {
		try {
			click("Terms");
			page_wait(20);
			value = driver.findElement(By.xpath(OR_reader("Object_Locator","T_ok"))).isDisplayed();
			Assert.assertEquals(true,value);
			page_wait(20);
			click("T_ok");
		} catch (IOException e) {
			e.getMessage();
			takeScreenShot("header_positive_tc_011");
		}
	}

	@When("User click on Log out icon navigated to the Landing  page")
	/*TC 003 -Validate that the user is navigated to the Landing page on clicking 'Log out' icon*/
	public static void header_positive_tc_003() throws IOException {
		try {
			click("Logout");
			page_wait(20);
			value = driver.findElement(By.xpath(OR_reader("Object_Locator","Welcome_login"))).isDisplayed();
			Assert.assertEquals(true,value);
			page_wait(20);
			close();
		} catch (IOException e) {
			e.getMessage();
			takeScreenShot("header_positive_tc_011");
		}
		
	}
}
