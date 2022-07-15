package step.definition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopsPageObjects;
import utilities.WebDriverUtility;

public class DesktopPageStepDef extends Base{
	DesktopsPageObjects desktopPage = new DesktopsPageObjects();
	//syntax @Tag("exact words of step from scenario")
	//public void nameOfTheMethod(){}
	
	@When("User click on Desktops tab")
	public void user_click_on_Desktops_tab() {
		WebDriverUtility.hardWait();
		desktopPage.clickonDesktopsTab();
		logger.info("user clicked on Show all desktops");
		WebDriverUtility.takeScreenShot();
	}
	@And("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		WebDriverUtility.hardWait();
		desktopPage.clickOnShowAllDesktops();
		logger.info("User click on Show all desktops");
		WebDriverUtility.takeScreenShot();
	}
	
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		List<WebElement> desktopsElements = desktopPage.desktopsItems();
		for(WebElement element:desktopsElements) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("title")+ "is present");
			WebDriverUtility.takeScreenShot();
			WebDriverUtility.hardWait();
		}
		/*
		 * step 1 we need to store the element in a list
		 * step 2 we need to iterate through the list
		 * step 3 we need to write an assertion to validate each element and index is present
		 */
	  
	
	
	
	
	
	}	
}

