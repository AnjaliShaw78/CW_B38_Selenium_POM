package test;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.relevantcodes.extentreports.LogStatus;
import generics.BaseTest;
import pageClasses.Jewellery;
import pageClasses.JewelleryAndWatches;
import pageClasses.JewelleryCombos;
import pageClasses.MensJewellery;
import pageClasses.OtherJewellery;
import pageClasses.RingsAndEarrings;

public class FinalTest extends BaseTest{
	JewelleryAndWatches JW;
	JewelleryAndWatches JW2;
	Jewellery J;
	JewelleryCombos combos;
	MensJewellery Jmen;
	OtherJewellery OJ;
	RingsAndEarrings RE;
	
    
	@org.testng.annotations.Test(priority =0)
	public void JewelleryAndWatchTest1() throws InterruptedException, IOException {
		JW = new JewelleryAndWatches(driver);
		
		JW.getDropdown().click();
		test.log(LogStatus.PASS, "Select DropdownButton");
		 
		
		JW.getJewelleryAndWatchLink().click();
		test.log(LogStatus.PASS, "Select JewelleryAndWatch");
		captureScreenshot(1);
		
		JW.getWatchesLink().click();
		test.log(LogStatus.PASS, "Select WatchLink");
		SoftAssert s =new SoftAssert();
		s.assertEquals(driver.getTitle(), "Watches - Buy Latest Watches for Men's & Women's Online in India at Best Price on Naaptol.com");
		s.assertAll();
		captureScreenshot(2);
		JW.getJewelleryAndWatchLink2().click();
		
		
		JW.getJewelleryLink().click();
		test.log(LogStatus.PASS, "Select JewelleryLink");
		JW.getJewelleryAndWatchLink3().click();
		captureScreenshot(3);
		
		JW.getBrandedLink().click();
		test.log(LogStatus.PASS, "Select BrandedLink");
		JW.getCloseLink().click();
		
		JW.getSogoLink().click();
		test.log(LogStatus.PASS, "Select SogoLink");
		JW.getCloseLink2().click();
		
		JW.getSukkhiLink().click();
		test.log(LogStatus.PASS, "Select SukkhiLink");
		JW.getCloseLink3().click();
		
		JW.getEstelleLink().click();
		test.log(LogStatus.PASS, "Select EstelleLink");
		JW.getCloseLink4().click();
		
		JW.getSterlingLink().click();
		test.log(LogStatus.PASS, "Select BrandedLink");
		JW.getCloseLink5().click();
		
		JW.getRicoSordiLink().click();
		test.log(LogStatus.PASS, "Select RicoSordLink");
		JW.getCloseLink6().click();
		
		JW.getRedReelsLink().click();
		test.log(LogStatus.PASS, "Select RedReelsLink");

		JW.getVellaniLink().click();
		test.log(LogStatus.PASS, "Select VellaniLink");
		JW.getCloseLink8().click();
		
		JW.getAbrexoLink().click();
		test.log(LogStatus.PASS, "Select AbrexoLink");
		JW.getCloseLink9().click();
		
		JW.getWWMLink().click();
		
		
		JW.getRituLink().click();
		test.log(LogStatus.PASS, "Select RituLink");
		JW.getCloseLink11().click();
		
		JW.getBenlingLink().click();
		test.log(LogStatus.PASS, "Select BenlingLink");
		JW.getCloseLink12().click();
		
		JW.getPrizetaaLink().click();
		test.log(LogStatus.PASS, "Select PrizetaalLink");
		JW.getCloseLink13().click();
		
		JW.getKayaFashionLink().click();
		test.log(LogStatus.PASS, "Select KayaFashionLink");
		JW.getCloseLink14().click();
		//JW.getGoldenGraceLink().click();
		//JW.getCloseLink15().click();
		JW.getPissaraLink().click();
		test.log(LogStatus.PASS, "Select PissaraLink");
		JW.getCloseLink16().click();
		
		JW.getMenkaLink().click();
		test.log(LogStatus.PASS, "Select MenkaLink");
		JW.getCloseLink17().click();
		
		JW.getForsunLink().click();
		test.log(LogStatus.PASS, "Select ForsunLink");
		JW.getCloseLink18().click();
		
		JW.getOptimaLink().click();
		test.log(LogStatus.PASS, "Select OptimaLink");
		JW.getCloseLink19().click();
		
		JW.getManikaLink().click();
		test.log(LogStatus.PASS, "Select ManikaLink");
		JW.getCloseLink20().click();
		
		JW.getHouseOfVellaniLink().click();
		test.log(LogStatus.PASS, "Select HouseOfVellaniLink");
		JW.getCloseLink21().click();
		
		JW.getScottishCludLink().click();
		test.log(LogStatus.PASS, "Select ScottishCludLink");
		JW.getCloseLink22().click();
		
		JW.getHexabugLink().click();
		test.log(LogStatus.PASS, "Select HexabugLink");
		JW.getCloseLink23().click();
		//JW.getJewelleryAndWatchLink().click();
		JW.getJewelleryLink2().click();

		
	}
    
	@Test(priority =1)
	private void Jewellery() {
		J = new Jewellery(driver);
		J.getDropdown2().click();
		J.getJewelleryAndWatchLink2().click();
		J.getJewelleryLink2().click();
		J.getJewelleryImage().click();
		SoftAssert s =new SoftAssert();
		s.assertEquals(driver.getTitle(), "Jewellery Combo - Buy Designer Jewellery Set Combo at Best Price in India on Naaptol.com");
		s.assertAll();
	
	}
    
	@Test(priority =2)
	private void JewelleryCombosTest() throws IOException {
		combos = new JewelleryCombos(driver);
		combos.getDropdown2().click();
		combos.getJewelleryAndWatchLink2().click();
		combos.getJewelleryLink1().click();
		captureScreenshot(4);
		combos.getCombosLink1().click();
		test.log(LogStatus.PASS, "Select CombosLink");
		combos.getCheckbox1().click();
		combos.JewelleryInput(pincode2);
		test.log(LogStatus.PASS, "Select pincodeLink");
		combos.getClickSet().click();
		//combos.hoverOverMenu();
		//combos.getQuickView1().click();
		//combos.JewelleryInput2(pincode1);
		//combos.getClick1().click();
		//combos.getClickBuy().click();
		//combos.getContinuebutton().click();

		
		
	}
    
	@Test(priority =3)
	private void MensJewelleryTest() throws IOException {
		Jmen = new MensJewellery(driver);
		Jmen.getDropdown4().click();
		Jmen.getJewelleryAndWatchLink4().click();
		Jmen.getJewelleryLink4().click();
		captureScreenshot(5);
		Jmen.getMenJewelleryLink().click();
		test.log(LogStatus.PASS, "Select MenJewelleryLink");

		Jmen.getStock().click();
		test.log(LogStatus.PASS, "Select StockLink");
		Jmen.getFreeship().click();
		test.log(LogStatus.PASS, "Select FreeshipLink");
		Jmen.getSelectsetBox().click();
		Jmen.getScottishBox().click();
		Jmen.getStock().click();
		Jmen.getFreeship().click();
		Jmen.getSelectsetBox().click();
		SoftAssert s =new SoftAssert();
		s.assertEquals(driver.getTitle(), "Mens Jewellery Online Store in India - Buy Mens Jewellery at Best Price on Naaptol Online Shopping");
		s.assertAll();

		
	}
    
	@Test(priority =4)
	public void OtherJewelleryTest() throws IOException {
		OJ = new OtherJewellery(driver);
		OJ.getDropdown5().click();
		OJ.getJewelleryAndWatchLink5().click();
		OJ.getJewelleryLink5().click();
		OJ.getOtherJewelleryLink().click();
		test.log(LogStatus.PASS, "Select OtherJewelleryLink");
		captureScreenshot(6);
		OJ.getCashOn().click();
		OJ.getFreeshipBox().click();
		OJ.getSetCheckBox().click();
		OJ.getFreeshipBox().click();
		OJ.getSetCheckBox().click();
		SoftAssert s =new SoftAssert();
		s.assertEquals(driver.getTitle(), "Bangles, Bracelets & Cuffs - Buy Artificial Jewellery at Best Price in India on Naaptol.com");
		s.assertAll();
		
	}
    
    @Test(priority =5)
    private void RingsAndEarringsTest() throws IOException {
    	RE = new RingsAndEarrings(driver);
    	RE.getDropdown6().click();
    	RE.getJewelleryAndWatchLink6().click();
    	RE.getJewelleryLink6().click();
    	
    	RE.getRAndELink().click();
    	captureScreenshot(7);
		test.log(LogStatus.PASS, "Select RingsAndEarringsLink");
    	RE.getCashoncheck().click();
    	RE.getCashoncheck3().click();
    	RE.getSetCheckBox2().click();
    	RE.getCashoncheck().click();
    	RE.getCashoncheck2().click();
    	RE.getCashoncheck3().click();
    	RE.getSetCheckBox2().click();
    	SoftAssert s =new SoftAssert();
		s.assertEquals(driver.getTitle(), "Rings & Earrings - Buy Jewellery for Women's at Best Price in India on Naaptol.com");
		s.assertAll();
		

    }
	

	

}
