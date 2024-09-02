package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JWHomeSteps {
	WebDriver driver;
	@Given("Open browser seclect JewelleryAndWatches url")
	public void open_browser_seclect_jewellery_and_watches_url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naaptol.com/");
		driver .findElement(By.cssSelector("[class='arrowNav']")).click();
		driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches.html'])[1]")).click();
		
	 
	}

	@Given("Select Watch url")
	public void select_watch_url() {
		driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches/watches.html'])[2]")).click();

	}

	@Given("Select Out of Stock button")
	public void select_out_of_stock_button() {
		driver.findElement(By.cssSelector("[id='iscod']")).click();

	}

	@Given("Select Free Shipping")
	public void select_free_shipping() {
		driver.findElement(By.cssSelector("[id='iscod']")).click();

	}

	@When("user enter pincode")
	public void user_enter_pincode() {
		driver.findElement(By.cssSelector("[name='pincode']")).sendKeys("274604");

	}

	@When("Select set button")
	public void select_set_button() {
		driver.findElement(By.linkText("Set")).click();

	}


@When("Click JewelleryAndWatch url again")
public void click_jewellery_and_watch_url_again() {
	driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches.html'])[2]")).click();

}


@Then("Select Jewellery url")
public void select_jewellery_url() {
  driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches/gems-jewellery.html'])[2]")).click();
  
}

@Then("Check title of the page")
public void check_title_of_the_page() {
	SoftAssert s =new SoftAssert();
	s.assertEquals(driver.getTitle(), "Jewellery Set - Buy Designer Jewellery Set Online in India at Best Price on Naaptol.com");
	s.assertAll();


}

@Then("Close the browser12")
public void close_the_browser12() {
  driver.close();
}



}
