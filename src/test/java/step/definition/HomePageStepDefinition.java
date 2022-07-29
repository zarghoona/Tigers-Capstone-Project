package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;

import page.objects.HomePageObject;
import utilities.Utils;

public class HomePageStepDefinition extends Base{
	
	HomePageObject homePageObject = new HomePageObject();
	
	@When("User click on Currency")
	public void user_click_on_currency() {
		homePageObject.clickOnCurrencyDropdown();
	}
	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homePageObject.chosseEuroFromDropdown();
	}
	@Then("currency value should change to Euro")
	public void curreny_value_should_change_to_euro() {
		homePageObject.euroCurrency();
	}
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homePageObject.UserClickOnShoppingCart();
	}
	@Then("{string} message should display")
	public void message_should_display(String string) {
		homePageObject.shoppingCartIsEmptySuccessMessage();
		//Utils.takeScreenshotForStep();
		logger.info("show shopping cart message");
	}
	
	
	
	
	

}
