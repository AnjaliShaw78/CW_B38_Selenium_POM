package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jewellery {
	WebDriver driver;
	public Jewellery(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(css = "[class='arrowNav']")
	private WebElement Dropdown2;
	
	@FindBy(linkText ="Jewellery & Watches")
	private WebElement JewelleryAndWatchLink2;
	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches/gems-jewellery.html'])[2]")
	private WebElement JewelleryLink2;
	
	@FindBy(css = "[src='//layout.naptol.com/usr/local/csp/staticContent/naaptolAds/Category-Banner-Jewellery-18-09-23.jpg']")
	private WebElement JewelleryImage;
	@FindBy(linkText = "Jewellery : Jewellery Combos")
	private  WebElement Jewellerycombos1;
	public  WebElement getJewellerycombos() {
		return Jewellerycombos1;
	}
	public WebElement getJewelleryLink2() {
		return JewelleryLink2;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getDropdown2() {
		return Dropdown2;
	}
	public WebElement getJewelleryAndWatchLink2() {
		return JewelleryAndWatchLink2;
	}
	public WebElement getJewelleryImage() {
		return JewelleryImage;
	}
	
	
	
	


}
