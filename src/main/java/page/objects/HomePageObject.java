package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base{
	public HomePageObject() {
		PageFactory.initElements(driver, this);	
	}
	
	
	@FindBy(xpath = "//*[text()='Currency']")
	private WebElement clickOnCurrency;
	
	@FindBy(xpath = "//button[@type='button']")
	private WebElement chosseEuroFromDropdwon;
	
	@FindBy(xpath = "//span[text()='Shopping Cart']")
	private WebElement clickOnShoppingCart;
	
	@FindBy(xpath = "//*[@id=\"content\"]/p")
	private WebElement shoppingCartIsEmpty;
	
	@FindBy(xpath = "//button[@class='btn btn-link dropdown-toggle']")
	private WebElement euroCurrency;

	



	public void clickOnCurrencyDropdown() {
		clickOnCurrency.click();	
	}
	public void chosseEuroFromDropdown() {
		chosseEuroFromDropdwon.click();
	}
	public void UserClickOnShoppingCart() {
		clickOnShoppingCart.click();
	}
	public void shoppingCartIsEmptySuccessMessage() {
		shoppingCartIsEmpty.getText();	
	}
	public void euroCurrency() {
		euroCurrency.isDisplayed();
	}
		

}
