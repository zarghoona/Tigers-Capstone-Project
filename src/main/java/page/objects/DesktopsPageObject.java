package page.objects;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class DesktopsPageObject extends Base{
	public DesktopsPageObject() {
	PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktops;
	
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;
	
	@FindBy(tagName = "img")
	private List <WebElement> items;  // driver.FindElement
	
	@FindBy(xpath = "//a[normalize-space()='HP LP3065']")//second scenario
	private WebElement hpLp3065;
	
	@FindBy(id = "input-quantity") 
	private WebElement quantityInput;
	
	@FindBy(id = "button-cart")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement HPLPsuccessmessage;
	
	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']") //third scenario
	private WebElement CanonEOS5DCameralink;
	
	@FindBy(xpath = "//option[@value='15']") 
	private  WebElement selectRedColor;
	
	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']") //fourth scenario
	private WebElement canonEOS5DCamera;
	
	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement writeReviewLink;
	
	@FindBy(id = "input-name")
	private WebElement yourNameField;
	
	@FindBy(id = "input-review")
	private WebElement yourReviewField;
	
	@FindBy(xpath = "//input[@type='radio']")
	private List <WebElement> rating;
	
	@FindBy(id = "button-review")
	private WebElement ReviewContinueButton;
	
	@FindBy(xpath = "//*[@id=\"form-review\"]/div[2]/text()")
	private String reviewSubmissionMessage;
	
	
//	public void clickonDesktopsTab() {  
//    Utils.moveToElement(desktops);	
//    
//	}
	public void clickOnDesktopTab() {
		Actions action = new Actions(driver);
		action.moveToElement(desktops).build().perform();
	}
	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
	}
	public List<WebElement> desktopsItems() {
		List<WebElement> itemsDesk = items;
		return itemsDesk;
		
	}
	public void clickOnHPLP3065Item() { //second scenario
		hpLp3065.click();
	}
	public void selectQuantity(String quantityValue) {
		quantityInput.clear();
		quantityInput.sendKeys(quantityValue);
		
	}
	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}
	public boolean validateSucessMessage() {
		if (HPLPsuccessmessage.isDisplayed())
			return true;
		else
			return false;
	}
	public void ClickOnCanonCameraLink() { //third scenario
		CanonEOS5DCameralink.click();
	}
	public void selectColorRed() {
		selectRedColor.click();
	}
		public void clickOnCanonEOS5Camera() {  //fourth scenario
			canonEOS5DCamera.click();
		}
		public void clickOnReviewLink() {
			writeReviewLink.click();
		}
		public void enterYourName(String nameValue) { //
			yourNameField.sendKeys(nameValue);
		}
		public void enterYourReview(String reviewValue) { //
			yourReviewField.sendKeys(reviewValue);
		}
		public void selectRating(String ratingValue) {
			List<WebElement> ratingElements = rating;
			for(WebElement element: ratingElements) {
				if(element.getAttribute("value").equalsIgnoreCase(ratingValue.trim())) {
					element.click();
					break;
				}
				
			}
		}
		public void clickOnContinueButton() {
			ReviewContinueButton.click();
		}
		public String reviewText() {
			return reviewSubmissionMessage;
		}
	}
	
	


