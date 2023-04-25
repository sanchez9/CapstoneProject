package tek.sdet.framework.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@When("User clicks on All section")
	public void userClicksOnAllSection() {
		click(factory.homePage().AllElements);
		logger.info("User clicked on All Section link");

	}

	@And("User on {string}")
	public void userOnDepartment(String department) {

		List<WebElement> dept = factory.homePage().sideBar;

		for (WebElement element : dept) {

			if (element.getText().equals(department)) {

				element.click();
				break;

			}
		}

		// getText
		// getTitle
	}

	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {
		
		List<List<String>> departmentSection = dataTable.asLists(String.class);
		
		List<WebElement> dept = factory.homePage().sideBar;
		for(int i =0;i<departmentSection.get(0).size(); i++) {
			for(WebElement element: dept) {
				if(element.getText().equals(departmentSection.get(0).get(i))) {
					Assert.assertTrue(element.isDisplayed());
					logger.info(element.getText() + "The item is present");
				}
			}
				
			}
		
	}
}
