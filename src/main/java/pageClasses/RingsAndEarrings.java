package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RingsAndEarrings {
	WebDriver driver;
	public RingsAndEarrings(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	@FindBy(css = "[class='arrowNav']")
	private WebElement Dropdown6;
	
	@FindBy(linkText ="Jewellery & Watches")
	private WebElement JewelleryAndWatchLink6;
	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches/gems-jewellery.html'])[2]")
	private WebElement JewelleryLink6;
	@FindBy(css = "[title='Rings and Earrings']")
	private WebElement RAndELink;
	@FindBy(xpath = "(//input[@checked='checked'])[1]")
	private WebElement cashoncheck;
	@FindBy(css = "[id='isexoutStock']")
	private WebElement cashoncheck2;
	@FindBy(css = "[id='isfreeship']")
	private WebElement cashoncheck3;
	@FindBy(linkText = "Set")
	private WebElement setCheckBox2;
	
	public WebElement getSetCheckBox2() {
		return setCheckBox2;
	}
	public WebElement getCashoncheck() {
		return cashoncheck;
	}
	public WebElement getCashoncheck2() {
		return cashoncheck2;
	}
	public WebElement getCashoncheck3() {
		return cashoncheck3;
	}
	public WebElement getDropdown6() {
		return Dropdown6;
	}
	public WebElement getJewelleryAndWatchLink6() {
		return JewelleryAndWatchLink6;
	}
	public WebElement getJewelleryLink6() {
		return JewelleryLink6;
	}
	public WebElement getRAndELink() {
		return RAndELink;
	}

}
