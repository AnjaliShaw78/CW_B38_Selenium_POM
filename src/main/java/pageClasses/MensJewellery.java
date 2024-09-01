package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MensJewellery {
	WebDriver driver;
	public MensJewellery(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	@FindBy(css = "[class='arrowNav']")
	private WebElement Dropdown4;
	
	@FindBy(linkText ="Jewellery & Watches")
	private WebElement JewelleryAndWatchLink4;
	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches/gems-jewellery.html'])[2]")
	private WebElement JewelleryLink4;

	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches/gems-jewellery/mens-jewellery.html'])[2]")
	private WebElement MenJewelleryLink;
	@FindBy(css = "[id='isexoutStock']")
	private WebElement stock;
	@FindBy(css = "[id='isfreeship']")
	private WebElement freeship;
	@FindBy(linkText = "Set")
	private WebElement SelectsetBox;
	@FindBy(css = "[name='Scottish Club']")
	private WebElement ScottishBox;
	@FindBy(linkText = "Quick View")
	private WebElement quickView2;
	public WebElement getQuickView2() {
		return quickView2;
	}

	public WebElement getStock() {
		return stock;
	}

	public WebElement getFreeship() {
		return freeship;
	}

	public WebElement getSelectsetBox() {
		return SelectsetBox;
	}

	public WebElement getScottishBox() {
		return ScottishBox;
	}

	public WebElement getDropdown4() {
		return Dropdown4;
	}

	public WebElement getJewelleryAndWatchLink4() {
		return JewelleryAndWatchLink4;
	}

	public WebElement getJewelleryLink4() {
		return JewelleryLink4;
	}

	public WebElement getMenJewelleryLink() {
		return MenJewelleryLink;
	}


}
