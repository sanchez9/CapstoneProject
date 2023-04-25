package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	
	public RetailHomePage() {
		//We are implementing PageFactory Class to initialize the UI elements
		//using @FindBy annotation of Page Factory
		
		PageFactory.initElements(getDriver(), this);
		
	}
	
	//syntax for storing UI elements using @FindBy annotations
	//@FindBy(locatorType = "locator Value")
	//public WebElement nameOfElement
	
	@FindBy(linkText = "TEKSCHOOL") // this is the same as driver.findElement()
	public WebElement tekschoolLogo;
	
	@FindBy(id="searchInput")
	public WebElement searchBarInput;
	
	@FindBy(id="searchBtn")
	public WebElement searchButton;
	
	@ FindBy(xpath = "//img[contains(@alt,'Pokemon')]")
	public WebElement pokemonImage;
	
	@FindBy(id = "signinLink")
	public WebElement signInOption;
	
	@FindBy(id= "accountLink")
	public WebElement AccountLogo;
	
	@FindBy(xpath="//span[text()='All']")
	public WebElement AllElements;
	
	@FindBy(xpath="//div[class='sidebar_content-item']//span")
	public List<WebElement> sideBar;

}
