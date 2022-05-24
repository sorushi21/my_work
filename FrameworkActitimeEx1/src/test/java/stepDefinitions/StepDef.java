package stepDefinitions;

import java.io.IOException;


import org.qa.driverFactory.DriverFactory;
import org.qa.pages.LoginPage;
import org.qa.utility.ElementUtility;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	public ElementUtility e =new ElementUtility();
	String url;
	String uname;
	private LoginPage lp=new LoginPage(DriverFactory.getDriver());
		@Given("user is on login page")
		public void user_is_on_login_page() throws IOException {
			DriverFactory.getDriver().get(e.getData(url));
			//lp.url("https://www.google.com/");
		}
		@When("user enters username")
		public void user_enters_username() throws IOException {
			lp.enterUserName(e.getData(uname));
			//lp.enterUserName(username);
		}
		@And("user enters password")
		public void user_enters_password() {
			Assert.assertTrue(true);
		}
		@And("user click login button")
		public void user_click_login_button() {
	   lp.clickButton();
	   
		}
		@Then("homepage is diplayed")
		public void homepage_is_diplayed() {
			String actual =lp.getTitle();
			Assert.assertEquals(actual, "java - Google Search");
		
		}
}
