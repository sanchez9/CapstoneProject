package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory ();
	
	@When ("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signInOption);
		logger.info("user clicked on sign in Option");
		
	}
	
	@And ("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String emailValue, String passValue) {
		sendText(factory.signInPage().emailField, emailValue);
		sendText(factory.signInPage().passwordField, passValue);
		logger.info("user entered email and password");
		
}
	@And ("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().loginButton);
		logger.info("user clicked on login button");
		
}
	@Then ("User should be logged in into Account")
	public void userShouldBeLoggedIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().AccountLogo));
		logger.info("successfully logged in");
		
	}
	// @And ("User clicks on LogoutButton")
	// public void userShouldLogout() {
	//	click(factory.signInPage().logoutBtn);
	//	logger.info("logged out");
	//}
	
	@When("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
	    click(factory.signInPage().createNewAccountButton);
	    logger.info("user clicked on Create New Account Button");
	    //logger logs each of steps and can utilize as a tool to identify steps that may have crashed
	    // proof of execution
	    // check last step of failure
	    
	}
	@When("User fill the singUp information with below data")
	public void userFillTheSingUpInformationWithBelowData(io.cucumber.datatable.DataTable dataTable) {
	List<Map<String, String>> data = dataTable.asMaps(String.class,String.class);
	sendText(factory.signInPage().createNewAccountNameField,data.get(0).get("name"));
	sendText(factory.signInPage().createNewAccountEmailField,data.get(0).get("email"));
	sendText(factory.signInPage().createNewAccountPasswordField,data.get(0).get("password"));
	sendText(factory.signInPage().createNewAccountConfPassField,data.get(0).get("confirmPassword"));
	logger.info("user filled the signUp information form");
	   
	}
	@When("User click on signUp button")
	public void userClickOnSignUpButton() {
	   click(factory.signInPage().signUpButton);
	   logger.info("user clicked on SignUp Button");
	    
	}
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
	    Assert.assertTrue(isElementDisplayed(factory.accountPage().accountprofilePicture));
	    logger.info("user is logged into account page");
	   
	}

}

