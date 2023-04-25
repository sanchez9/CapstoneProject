package tek.sdet.framework.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory (); // creating object of POM Factory here
	
	@Given ("User is on retail website")
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekschoolLogo));
		logger.info("user is on retail website");
	}
	
	@When ("User search for {string} item")
	public void userSearchForItem (String value) {
		sendText(factory.homePage().searchBarInput,value);
		click(factory.homePage().searchButton);
		logger.info("User searched for " + value + "item");
	
	}
	
	@Then("Product should be displayed")
	public void productShouldBeDisplayed() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().pokemonImage));
		logger.info("Product is displayed");
		
	}
	
}
	
