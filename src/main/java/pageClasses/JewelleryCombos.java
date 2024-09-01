package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JewelleryCombos {
	WebDriver driver;
	public JewelleryCombos(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	@FindBy(css = "[class='arrowNav']")
	private WebElement Dropdown2;
	
	@FindBy(linkText ="Jewellery & Watches")
	private WebElement JewelleryAndWatchLink2;
	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches/gems-jewellery.html'])[2]")
	private WebElement JewelleryLink1;
	@FindBy(linkText = "Jewellery Combos")
	private WebElement combosLink1;
	
	@FindBy(css ="[id='pincodeDeliveryId_0']")
	private WebElement pincode1;
	@FindBy(linkText = "Check")
	private WebElement click1; 
	@FindBy(linkText = "Click here to Buy")
	private WebElement clickBuy;
	@FindBy(xpath = "(//a[@class='link_Continue'])[1]")
	private WebElement continuebutton;
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement checkbox1;
	@FindBy(css = "[name='pincode']")
	private WebElement pincode2;
	@FindBy(linkText = "Set")
	private WebElement clickSet;
	@FindBy(linkText = "Quick View")
	private WebElement quickView1;
	@FindBy(linkText = "Quick View")
	private WebElement quickView2;
	@FindBy(css = "[class='qv_right']")
	private WebElement rightclick;

	
	
	
	public WebElement getRightclick() {
		return rightclick;
	}
	public WebElement getQuickView2() {
		return quickView2;
	}
	public WebElement getClickSet() {
		return clickSet;
	}
	public WebElement getCheckbox1() {
		return checkbox1;
	}
	
	public WebElement getPincode2() {
		return pincode2;
	}
	public WebElement getContinuebutton() {
		return continuebutton;
	}
	public WebElement getClickBuy() {
		return clickBuy;
	}
	public WebElement getClick1() {
		return click1;
	}
	public WebElement getPincode1() {
		return pincode1;
	}
	public WebElement getQuickView1() {
		return quickView1;
	}
	public WebElement getDropdown2() {
		return Dropdown2;
	}
	public WebElement getJewelleryAndWatchLink2() {
		return JewelleryAndWatchLink2;
	}
	public WebElement getJewelleryLink1() {
		return JewelleryLink1;
	}
	
		public WebElement getCombosLink1() {
		return combosLink1;
	}
	
		public void JewelleryInput(String pincode) {
			pincode2.sendKeys(pincode);
			
		}
		public void JewelleryInput2(String pincodee) {
			pincode1.sendKeys(pincodee);
			
		}
	    public void hoverOverMenu() {
	        Actions actions = new Actions(driver);  // Creating an Actions object
	        actions.moveToElement(quickView1).perform();  // Perform hover action
	    }

				
}
