package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import page.objects.LaptopNoteBooksPageObject;
import utilities.Utils;

public class LaptopNoteBooksStepDefinition extends Base{
	LaptopNoteBooksPageObject laptopAndNoteBookObj = new LaptopNoteBooksPageObject();

@When("User click on Laptop &NoteBook tab")
public void user_click_on_laptop_note_book_tab() {
	laptopAndNoteBookObj.clickOnLaptoNotebooksTap();
	logger.info("user clicked on laptop and notebook tab");
}

@When("User click on Show all Laptop &NoteBook option")
public void user_click_on_show_all_laptop_note_book_option() {
	laptopAndNoteBookObj.showAllLaptopsAndnotebooks();
	logger.info("user click on Show all Laptop &NoteBook option");
}

@When("User click on MacBook  item")
public void user_click_on_mac_book_item() {
	laptopAndNoteBookObj.mackBookItems();
	logger.info("user clicked on MacBook  item");
		
	}
@Then("User should see a messagee1 {string}")
public void user_should_see_a_messagee1(String string) throws InterruptedException {
	Assert.assertTrue(laptopAndNoteBookObj.theSuccessMassage());
	Thread.sleep(2000);

}
@Then("User should see {string} showed to the cart")
public void user_should_see_showed_to_the_cart(String string) throws InterruptedException {
	laptopAndNoteBookObj.SeeOneItemInItemsOption();
  Thread.sleep(2000);
}

//@Then("User click on cart option")
//public void user_click_on_cart_option() throws InterruptedException {
//	laptopAndNoteBookObj.ClicOnCartoption();
//	logger.info("user clicked on cart option");
//	Thread.sleep(2000);
//}
//
//@Then("user click on red X button to remove the item from cart")
//public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
//	laptopAndNoteBookObj.clickOnRemoveTheItems();
//	logger.info("user clicked on red X button to remove");
//}
//
//@Then("item should be removed and cart should show {int} item\\(s)")
//public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
//	laptopAndNoteBookObj.noItemsOnTheCart();
//	logger.info("user should see there is no items add to cart");
//}
@Then("User click on cart option")
public void user_click_on_cart_option() throws InterruptedException {
	laptopAndNoteBookObj.ClickOnCartOption();
	logger.info("user click on item Button");
	Thread.sleep(2000);
}

@Then("user click on red X button to remove the item from cart")
public void user_click_on_red_x_button_to_remove_the_item_from_cart() throws InterruptedException {
	laptopAndNoteBookObj.clickOnRemovetheitems();
	logger.info("user can click on remove button");
	Thread.sleep(2000);
}

@Then("item should be removed and cart should show {string}")
public void item_should_be_removed_and_cart_should_show(String string) throws InterruptedException {
	laptopAndNoteBookObj.noItemsAddtothecart();
	logger.info("user see their is no items add to the cart");
	Thread.sleep(2000);
}
//=====================================================================
@When("User click on product comparison icon on {string}")
public void user_click_on_product_comparison_icon_on(String string) throws InterruptedException {
	laptopAndNoteBookObj.mackBookCompareButton();
	logger.info("user clicked on product comparison icon");
	Thread.sleep(2000);
}

@When("User click on product comparison icon on ‘MacBook Air")
public void user_click_on_product_comparison_icon_on_mac_book_air() throws InterruptedException {
	laptopAndNoteBookObj.MackBookAirCompareButton();
	logger.info("User clicked on Product comparison link");
	Thread.sleep(2000);
}
@Then("User should see a message3 {string}")
public void user_should_see_a_message3(String string) throws InterruptedException {
	laptopAndNoteBookObj.succesAddMacBookAirtoProductCompare();
	logger.info("user can see add successfulle to product comparison");
	Thread.sleep(2000);
}
@When("User click on Product comparison link")
public void user_click_on_product_comparison_link() throws InterruptedException {
	laptopAndNoteBookObj.clickOnproductComparisonLink();
	logger.info("user can click on product comparison");
	Thread.sleep(2000);
}

@Then("User should see Product Comparison Chart")
public void user_should_see_product_comparison_chart() {
	laptopAndNoteBookObj.productCompareItemTable();

}

@When("User click on heart icon to add {string} laptop to wish list")
public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String string) {
	laptopAndNoteBookObj.hearticonButton();
}
@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list()
		throws InterruptedException {
	laptopAndNoteBookObj.youMustLogin();
	logger.info("user need to login to his account");
	Thread.sleep(5000);
}

@Then("User should get a message {string}")
public void user_should_get_a_message(String string) {
	laptopAndNoteBookObj.successMessageHeartToSonyVio();
}
@Then("User should see a message {string} ")
public void user_should_see_a_message(String string) {
	laptopAndNoteBookObj.succesAddMacBookAirtoProductCompare();
}

@When("User click on {string} item")
public void user_click_on_item(String string) {
	laptopAndNoteBookObj.MacBookProLink();
}

@Then("User should see {string} price tag is present on UI.")
public void user_should_see_price_tag_is_present_on_ui(String string) {
	laptopAndNoteBookObj.MacBookPriceText();
}
}