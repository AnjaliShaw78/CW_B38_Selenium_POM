package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OtherJewellery {
	WebDriver driver;
	public OtherJewellery(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	@FindBy(css = "[class='arrowNav']")
	private WebElement Dropdown5;
	
	@FindBy(linkText ="Jewellery & Watches")
	private WebElement JewelleryAndWatchLink5;
	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches/gems-jewellery.html'])[2]")
	private WebElement JewelleryLink5;
	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches/gems-jewellery/artificial-bracelets.html'])[2]")
	private WebElement otherJewelleryLink;
	@FindBy(css = "[id='iscod']")
	private WebElement cashOn;
	@FindBy(css = "[id='isfreeship']")
	private WebElement freeshipBox;
	@FindBy(linkText = "Set")
	private WebElement setCheckBox;
	
	public WebElement getSetCheckBox() {
		return setCheckBox;
	}
	public WebElement getCashOn() {
		return cashOn;
	}
	public WebElement getFreeshipBox() {
		return freeshipBox;
	}
	public WebElement getDropdown5() {
		return Dropdown5;
	}
	public WebElement getJewelleryAndWatchLink5() {
		return JewelleryAndWatchLink5;
	}
	public WebElement getJewelleryLink5() {
		return JewelleryLink5;
	}
	public WebElement getOtherJewelleryLink() {
		return otherJewelleryLink;
	}



}
