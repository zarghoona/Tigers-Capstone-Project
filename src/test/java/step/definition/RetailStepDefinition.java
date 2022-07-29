package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import page.objects.RetailPageObject;
import utilities.Utils;

public class RetailStepDefinition extends Base{
	 RetailPageObject  retailpageobj = new  RetailPageObject();

@Given("User is on Retail website")
public void user_is_on_retail_website() {
	String ExpectedtextFromUI = "TEST ENVIRONMENT";
	String ActualText = retailpageobj.getTestEnvironmentTextFromUI();
	Assert.assertEquals(ExpectedtextFromUI, ActualText);
	logger.info("Test Environment webpage text validated successfully");
   
}

@Given("User click  on MyAccount")
public void user_click_on_my_account() {
	retailpageobj.ClickOnMyaccountlink();
	logger.info("Click on my account was validated successfully");
}

@When("User click on Login")
public void user_click_on_login() {
	retailpageobj.ClickOnLoginlink();
	logger.info("Click on Logging link was validated successfully");
   
}

@When("User enter username {string} and password {string}")
public void user_enter_username_and_password(String string, String string2) {
	retailpageobj.EnterUserNameOREmail("yousufKhan12413223@gmail.com");
	retailpageobj.Enterpassword("12345678");
	logger.info("Email and password validated successfully");
}

@When("User click on Login button")
public void user_click_on_login_button() {
	retailpageobj.ClickOnLoginButton();
	logger.info("The login button validated successfully");
   
}

@Then("User should be logged in to MyAccount dashboard")
public void user_should_be_logged_in_to_my_account_dashboard() {
	String ExpectedtextfromMyaccount = "My Account";
	String Actualtextfrommyaccount = retailpageobj.getMyAccountText();
	Assert.assertEquals(ExpectedtextfromMyaccount, Actualtextfrommyaccount);
	logger.info("My account text was validated successfully");
   
}

@When("User click on {string} link")
public void user_click_on_link(String string) {///
  
}
@When("User click on Register for an Affiliate Account link")
public void user_click_on_register_for_an_affiliate_account_link() throws InterruptedException {
	retailpageobj.clickOnRegisterForAffiliatAccount();
	logger.info("on Rejister affiliate account link was validated successfully");
}

@When("User fill affiliate form with below information") // add
public void user_fill_affiliate_form_with_below_information(io.cucumber.datatable.DataTable dataTable) {
	List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	retailpageobj.EnterCompanyName(data.get(0).get("company"));
	retailpageobj.EnterWebsiteName(data.get(0).get("website"));
	retailpageobj.EnterTaxID(data.get(0).get("taxID"));
	retailpageobj.SelectPaymentMthod(data.get(0).get("paymentMethod"));
	retailpageobj.EnterChequePayeeName(data.get(0).get("ChequePayeeName"));
//	Utils.takeScreenshotForStep();
	logger.info("The form filed successfully");
}

@When("User check on About us check box")
public void user_check_on_about_us_check_box() {
	retailpageobj.agreeOnYESCheckBoxButton();
	logger.info("the check box yes button validated successfully");
   
}

@When("User click on Continue button")
public void user_click_on_continue_button() {
	retailpageobj.ClickOnContinueButton();
	logger.info("Continue button was validated successfully");
    
}

@Then("User should see a success message")
public void user_should_see_a_success_message() {
	retailpageobj.successTextIsDisplay();
	logger.info("The continue success message validated successfully");
    
}
@When("User click on Edit your affiliate informationlink")
public void user_click_on_edit_your_affiliate_informationlink() throws InterruptedException {
	retailpageobj.clickOnEditYourAffiliateInformation();
	logger.info("Edit on affiliate information was clicked successfully");
}

@When("user click on Bank Transfer radio button")
public void user_click_on_bank_transfer_radio_button() {
	retailpageobj.ClickOnBankTransferbutton();
	logger.info("click on Bank transfer radio button validated successfully");
   
}

@When("User fill Bank information with below information")
public void user_fill_bank_information_with_below_information(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	retailpageobj.EnterBankName(data.get(0).get("bankName"));
	retailpageobj.EnterBankABAnumber(data.get(0).get("abaNumber"));
	retailpageobj.EnterBankSwiftCode(data.get(0).get("swiftCode"));
	retailpageobj.EnterBankAccountName(data.get(0).get("accountName"));
	retailpageobj.EnterBankAccountNumber(data.get(0).get("accountNumber"));
	logger.info("this from of bank account inforamation filled successfully");
	Thread.sleep(4000);
}
@When("User click on Edit your account information link")
public void user_click_on_edit_your_account_information_link() {
	retailpageobj.ClickOnEditAccountInformation();
}
@When("User modify below information")
public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) {
	List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	retailpageobj.EnterFirstName(data.get(0).get("firstname"));
	retailpageobj.EnterLastName(data.get(0).get("lastName"));
	retailpageobj.EnterEmailAdress(data.get(0).get("email"));
	retailpageobj.EnterTelephonenumber(data.get(0).get("telephone"));
}

@When("user Click On continue button")
public void user_click_on_continue_button1() {
	retailpageobj.ClickOnContinueButtonForEditAccountInformation();
	logger.info("The continue button was clicked successfully");
}

//@Then("User should see a message {string}")
//public void user_should_see_a_message(String string) {
//	String ExpectedSuccesstext = "Success: Your account has been successfully updated";
//	String ActualSuccessText = retailpageobj.getsuccessMessageForAccountInformationCreated();
//    Assert.assertEquals(ExpectedSuccesstext, ActualSuccessText);
//    logger.info("Success meassage displayed successfully");
//}
@Then("User should see a message {string}")
public void user_should_see_a_message(String string) {
	Assert.assertTrue(retailpageobj.isEditAccountInfoSuccessMessagePresent());
	 
}
 
}


	


