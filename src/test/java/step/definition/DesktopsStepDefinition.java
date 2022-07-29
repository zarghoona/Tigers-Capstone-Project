package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import page.objects.DesktopsPageObject;
import utilities.Utils;

public class DesktopsStepDefinition extends Base {
	DesktopsPageObject desktopPage = new DesktopsPageObject();
	@When("User click on Desktops tab")
	public void user_click_on_Desktop_tab() {
		desktopPage.clickOnDesktopTab();
		logger.info("user click on Desktops Tab");
		//Utils.takeScreenshotForStep();
	
	}
	@And("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktopPage.clickOnShowAllDesktops();
		logger.info("user clicked on show all desktop");
	}
	@Then("User should see all items are present in Desktop page")
	public void user_should_see__all_items_are_present_in_desktop_page() {
		List<WebElement> desktopsElements = desktopPage.desktopsItems();
		for(WebElement element:desktopsElements) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("title") + " is present");
		}
		//Utils.takeScreenshotForStep();
		
	}

	@When("User click  ADD TO CART option on HP LP3065item") //steps for second scenario
	public void user_click_add_to_cart_option_on_hp_lp3065item() {
		desktopPage.clickOnHPLP3065Item();
		logger.info("user clicked Add to cart Option");
	}

	@When("User select quantity {string}")
	public void user_select_quantity(String string) {
		desktopPage.selectQuantity(string);
		logger.info("user select quantity " + string);
	}
	

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktopPage.clickOnAddToCartButton();
		logger.info("userclick add to cart button");
	}
	@Then("User should see a messagee {string}")
	public void user_should_see_a_messagee(String expectedSuccessmessage) {
		Assert.assertTrue(desktopPage.validateSucessMessage());
		//Utils.takeScreenshotForStep();	
	}
	@When("User click  ADD TO CART option on Canon EOS 5Ditem")
	public void user_click_add_to_cart_option_on_canon_eos_5ditem() {
		desktopPage.ClickOnCanonCameraLink();
		logger.info("click on canon camera was validate successfully");
		//Utils.takeScreenshotForStep();
	}
	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		desktopPage.selectColorRed();
		logger.info("color was selected successfully");
		//Utils.takeScreenshotForStep();
	}
	@When("User click on Canon EOS 5D item") //forth scenario
	public void user_click_on_canon_5d_ietm() {
		desktopPage.clickOnCanonEOS5Camera();
		logger.info("click on color was successfully");
	}
	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktopPage.clickOnReviewLink();
		logger.info("review link clicked successfully");
	}
	@When("user fill the review information with below information")
	public void user_fill_review_information_with_below_information(DataTable dataTable) {
		List<Map<String,String>> reiewInformation = dataTable.asMaps(String.class,String.class);
		desktopPage.enterYourName(reiewInformation.get(0).get("yourname"));
		desktopPage.enterYourReview(reiewInformation.get(0).get("yourReview"));
		desktopPage.selectRating(reiewInformation.get(0).get("Rating"));
	}
	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktopPage.clickOnContinueButton();
		logger.info("user clicked on continue button successfully");
	}
	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) {
		System.out.println(desktopPage.reviewText() + "from print");
		
	}

}
