package stepsdefination;

import java.io.IOException;

import ConfigSetup.BaseConfigSetupFile;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import seleniumElementssetup.PasswordElements;
import seleniumElementssetup.SeleniumElements_SignClick;
import seleniumElementssetup.ValidateLoggedUser;

public class ValidLoginTestCase {

	@Given("^Go to Application URL$")
	public static void step1() throws IOException
	{
		BaseConfigSetupFile.browsetup();
	}
	@When("^User Clicks on Sign in Option$")
	public static void step2() throws IOException
	{
		SeleniumElements_SignClick.signInClick();
	}
	@And("^User Enters Valid Username/Email/PhoneNumber$")
	public static void step3() throws IOException
	{
		SeleniumElements_SignClick.enterUsername();
	}
	
	@And("^User Clicks on Continue Button$")
	public static void step4() throws IOException
	{
		SeleniumElements_SignClick.continueClick();
	}
	@And("^User Enters Valid Password/ OTP$")
	public static void step5() throws IOException, InterruptedException
	{
		PasswordElements.enterPassword();
	}
	@And("^User User Clicked on Login/Submit/SignIn Button")
	public static void step6() throws IOException, InterruptedException
	{
		PasswordElements.signin_main_Click();
	}
	@Then("^User Logged into the Application Successfully and Validate User$")
	public static void step7() throws IOException
	{
		ValidateLoggedUser.validateloginuser();
	}
}


