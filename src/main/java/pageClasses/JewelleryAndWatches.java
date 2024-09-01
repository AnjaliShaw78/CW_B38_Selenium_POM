package pageClasses;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class JewelleryAndWatches {
	WebDriver driver;
	public JewelleryAndWatches(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(css = "[class='arrowNav']")
	private WebElement Dropdown;
	
	@FindBy(linkText ="Jewellery & Watches")
	private WebElement JewelleryAndWatchLink;
	
	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches/watches.html'])[2]")
	private WebElement WatchesLink;
	
	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches.html'])[2]")
	private WebElement JewelleryAndWatchLink2;
	
	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches/gems-jewellery.html'])[2]")
	private WebElement JewelleryLink;
	
	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches.html'])[2]")
	private WebElement JewelleryAndWatchLink3;
	
	@FindBy(css ="[href='/brands/branded/jewellery-watches.html']")
	private WebElement BrandedLink;
	
	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches.html'])[2]")
	private WebElement closeLink;
	
	@FindBy(css = "[href='/brands/sogo/jewellery-watches.html']")
	private WebElement SogoLink;
	
	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches.html'])[2]")
	private WebElement closeLink2;
	
	@FindBy(xpath = "(//a[@href='/brands/sukkhi/jewellery-watches.html'])[1]")
	private WebElement SukkhiLink;
	
	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches.html'])[2]")
	private WebElement closeLink3;
	
	@FindBy(css ="[href='/brands/estelle/jewellery-watches.html']")
	private WebElement EstelleLink;
	
	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches.html'])[2]")
	private WebElement closeLink4;
	
	@FindBy(css = "[href='/brands/sterling/jewellery-watches.html']")
	private WebElement SterlingLink;
	
	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches.html'])[2]")
	private WebElement closeLink5;
	
	@FindBy(css = "[href='/brands/rico-sordi/jewellery-watches.html']")
	private WebElement RicoSordiLink;
	
	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches.html'])[2]")
	private WebElement closeLink6;
	
	@FindBy(css = "[href='/brands/red-reels/jewellery-watches.html']")
	private WebElement RedReelsLink;
	
	@FindBy(css = "[href='/brands/vellani/jewellery-watches.html']")
	private WebElement VellaniLink;
	
	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches.html'])[2]")
	private WebElement closeLink8;
	
	@FindBy(css = "[href='/brands/abrexo/jewellery-watches.html']")
	private WebElement AbrexoLink;
	
	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches.html'])[2]")
	private WebElement closeLink9;
	
	@FindBy(css = "[href='/brands/wwm/jewellery-watches.html']")
	private WebElement WWMLink;
	
	@FindBy(css = "[href='/brands/ritu/jewellery-watches.html']")
	private WebElement RituLink;
	
	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches.html'])[2]")
	private WebElement closeLink11;
	
	@FindBy(css = "[href='/brands/benling/jewellery-watches.html']")
	private WebElement BenlingLink;
	
	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches.html'])[2]")
	private WebElement closeLink12;
	
	@FindBy(css = "[href='/brands/prizetaa/jewellery-watches.html']")
	private WebElement PrizetaaLink;
	
	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches.html'])[2]")
	private WebElement closeLink13;
	
	@FindBy(css = "[href='/brands/kaya-fashion/jewellery-watches.html']")
	private WebElement KayaFashionLink;
	
	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches.html'])[2]")
	private WebElement closeLink14;
	
	@FindBy(css = "[href='/brands/golden-grace/jewellery-watches.html']")
	private WebElement GoldenGraceLink;
	
	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches.html'])[2]")
	private WebElement closeLink15;
	
	@FindBy(css = "[href='/brands/pissara/jewellery-watches.html']")
	private WebElement PissaraLink;
	
	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches.html'])[2]")
	private WebElement closeLink16;
	
	@FindBy(css = "[href='/brands/menka/jewellery-watches.html']")
	private WebElement MenkaLink;
	
	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches.html'])[2]")
	private WebElement closeLink17;
	
	@FindBy(css = "[href='/brands/forsun/jewellery-watches.html']")
	private WebElement ForsunLink;
	
	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches.html'])[2]")
	private WebElement closeLink18;
	
	@FindBy(css = "[href='/brands/optima/jewellery-watches.html']")
	private WebElement OptimaLink;
	
	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches.html'])[2]")
	private WebElement closeLink19;
	
	@FindBy(css = "[href='/brands/manikya/jewellery-watches.html']")
	private WebElement ManikaLink;
	
	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches.html'])[2]")
	private WebElement closeLink20;
	
	@FindBy(css = "[href='/brands/house-of-vellani/jewellery-watches.html']")
	private WebElement HouseOfVellaniLink;
	
	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches.html'])[2]")
	private WebElement closeLink21;
	
	@FindBy(css = "[href='/brands/scottish-club/jewellery-watches.html']")
	private WebElement ScottishCludLink;
	
	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches.html'])[2]")
	private WebElement closeLink22;
	
	@FindBy(css = "[href='/brands/hexabug/jewellery-watches.html']")
	private WebElement HexabugLink;
	
	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches.html'])[2]")
	private WebElement closeLink23;
	@FindBy(xpath = "(//a[@href='/shop-online/jewellery-watches/gems-jewellery.html'])[2]")
	private WebElement JewelleryLink2;
	
	public WebElement getJewelleryLink2() {
		return JewelleryLink2;
	}
	public WebElement getDropdown() {
		return Dropdown;
	}
	public WebElement getJewelleryAndWatchLink() {
		return JewelleryAndWatchLink;
	}
	public WebElement getWatchesLink() {
		return WatchesLink;
	}
	public WebElement getJewelleryAndWatchLink2() {
		return JewelleryAndWatchLink2;
	}
	public WebElement getJewelleryLink() {
		return JewelleryLink;
	}
	public WebElement getJewelleryAndWatchLink3() {
		return JewelleryAndWatchLink3;
	}
	public WebElement getBrandedLink() {
		return BrandedLink;
	}
	public WebElement getCloseLink() {
		return closeLink;
	}
	public WebElement getSogoLink() {
		return SogoLink;
	}
	public WebElement getCloseLink2() {
		return closeLink2;
	}
	public WebElement getSukkhiLink() {
		return SukkhiLink;
	}
	public WebElement getCloseLink3() {
		return closeLink3;
	}
	public WebElement getEstelleLink() {
		return EstelleLink;
	}
	public WebElement getCloseLink4() {
		return closeLink4;
	}
	public WebElement getSterlingLink() {
		return SterlingLink;
	}
	public WebElement getCloseLink5() {
		return closeLink5;
	}
	public WebElement getRicoSordiLink() {
		return RicoSordiLink;
	}
	public WebElement getCloseLink6() {
		return closeLink6;
	}
	public WebElement getRedReelsLink() {
		return RedReelsLink;
	}
	public WebElement getVellaniLink() {
		return VellaniLink;
	}
	public WebElement getCloseLink8() {
		return closeLink8;
	}
	public WebElement getAbrexoLink() {
		return AbrexoLink;
	}
	public WebElement getCloseLink9() {
		return closeLink9;
	}
	public WebElement getWWMLink() {
		return WWMLink;
	}

	public WebElement getRituLink() {
		return RituLink;
	}
	public WebElement getCloseLink11() {
		return closeLink11;
	}
	public WebElement getBenlingLink() {
		return BenlingLink;
	}
	public WebElement getCloseLink12() {
		return closeLink12;
	}
	public WebElement getPrizetaaLink() {
		return PrizetaaLink;
	}
	public WebElement getCloseLink13() {
		return closeLink13;
	}
	public WebElement getKayaFashionLink() {
		return KayaFashionLink;
	}
	public WebElement getCloseLink14() {
		return closeLink14;
	}
	public WebElement getGoldenGraceLink() {
		return GoldenGraceLink;
	}
	public WebElement getCloseLink15() {
		return closeLink15;
	}
	public WebElement getPissaraLink() {
		return PissaraLink;
	}
	public WebElement getCloseLink16() {
		return closeLink16;
	}
	public WebElement getMenkaLink() {
		return MenkaLink;
	}
	public WebElement getCloseLink17() {
		return closeLink17;
	}
	public WebElement getForsunLink() {
		return ForsunLink;
	}
	public WebElement getCloseLink18() {
		return closeLink18;
	}
	public WebElement getOptimaLink() {
		return OptimaLink;
	}
	public WebElement getCloseLink19() {
		return closeLink19;
	}
	public WebElement getManikaLink() {
		return ManikaLink;
	}
	public WebElement getCloseLink20() {
		return closeLink20;
	}
	public WebElement getHouseOfVellaniLink() {
		return HouseOfVellaniLink;
	}
	public WebElement getCloseLink21() {
		return closeLink21;
	}
	public WebElement getScottishCludLink() {
		return ScottishCludLink;
	}
	public WebElement getCloseLink22() {
		return closeLink22;
	}
	public WebElement getHexabugLink() {
		return HexabugLink;
	}
	public WebElement getCloseLink23() {
		return closeLink23;
	}
	
}
