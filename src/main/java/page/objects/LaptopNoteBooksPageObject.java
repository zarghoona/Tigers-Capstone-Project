package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopNoteBooksPageObject extends Base{
	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement clickOnLaptopsAndNotebooks;
	
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndnotebooks;
	
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement mackBookItems;
	
	@FindBy(xpath = "//*[text()='Success: You have added ']")
	private WebElement theSuccessMassage;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartbutton;
	
	@FindBy(xpath = "//*[text()='Success: You have added ']")
	private WebElement successMessage;

	@FindBy(xpath = "//*[text()=' 1 item(s) - $602.00']")
	private WebElement SeeOneItemInItemsOption;

	@FindBy(xpath = "//span[text()=' 1 item(s) - $602.00']")
	private WebElement ClickOnCartOption;

	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement clickOnRemovetheitems;

	@FindBy(xpath = "//span[text()=' 0 item(s) - $0.00']")
	private WebElement noItemsAddtothecart;
	
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[3]")
	private WebElement mackBookComparisonButton;
	
	@FindBy(xpath = "//div[3]//div[1]//div[2]//div[2]//button[3]")
	private WebElement MackBookAirCompareButton;
	
	@FindBy(xpath = "//*[@class='alert alert-success alert-dismissible']")
	private WebElement succesAddMacBookAirtoProductCompare;
	
	@FindBy(xpath = "//a[text()='product comparison']")
	private WebElement clickOnproductComparisonLink;
	
	@FindBy(xpath = "/html/body/div[2]")
	private WebElement productCompareItemTable;
	
	@FindBy(xpath = "//div[4]/div[5]/div/div[2]/div[2]/button[2]")
	private WebElement hearticonButton;
	
	@FindBy(xpath = "//*[text()=' You must ']")
	private WebElement youMustLogin;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageHeartToSonyVio;
	
	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement MacBookProLink;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/ul[1]/li[3]")
	private WebElement MacBookPriceText;
	
	public boolean theSuccessMassage() {
		if (theSuccessMassage.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickOnLaptoNotebooksTap() {
		clickOnLaptopsAndNotebooks.click();
	}
	public void showAllLaptopsAndnotebooks() {
		showAllLaptopsAndnotebooks.click();
	}
	public void mackBookItems() {
		mackBookItems.click();
	}
	public void addToCartbutton() {
		addToCartbutton.click();
	}
	public boolean succesmassage() {
		if (theSuccessMassage.isDisplayed())
			return true;
		else
			return false;
	}

	public void SeeOneItemInItemsOption() {
		SeeOneItemInItemsOption.isDisplayed();
	}

	public void ClickOnCartOption() {
		ClickOnCartOption.click();
	}

	public void clickOnRemovetheitems() {
		clickOnRemovetheitems.click();
	}

	public void noItemsAddtothecart() {
		noItemsAddtothecart.isDisplayed();
	}
//	public void clickOnRemoveTheItems() {
//		clickOnRemoveThItems.click();
//	}
//	public void noItemsOnTheCart() {
//		noItemsOnTheCart.isDisplayed();
//	}
//	public void clickOnRemovetheitems() {
//		clickOnRemovetheitems.click();
//	}
//
//	public void noItemsAddtothecart() {
//		noItemsAddtothecart.isDisplayed();
//	}
	public void mackBookCompareButton() {
		mackBookComparisonButton.click();
	}
	public void MackBookAirCompareButton() {
		 MackBookAirCompareButton.click();
	}
	public void succesAddMacBookAirtoProductCompare() {
		succesAddMacBookAirtoProductCompare.isDisplayed();
	}

	public void clickOnproductComparisonLink() {
		clickOnproductComparisonLink.click();
	}
	public void productCompareItemTable() {
		productCompareItemTable.click();
	}
	public void hearticonButton() {
		hearticonButton.click();
	}
	public void youMustLogin() {
		youMustLogin.isDisplayed();
	}

	public void successMessageHeartToSonyVio() {
		successMessageHeartToSonyVio.isDisplayed();
	}
	public void MacBookProLink() {
		MacBookProLink.click();
	}
	public void MacBookPriceText() {
		MacBookPriceText.isDisplayed();
	}
	
	
	
	

}
