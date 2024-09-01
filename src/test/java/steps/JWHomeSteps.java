package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

	@When("Compare two products of Watches")
	public void compare_two_products_of_watches() {
		//watch 1
		driver.findElement(By.cssSelector("[id='cpid12613301']")).click();
		//watch 2
		driver.findElement(By.cssSelector("[id='cpid12613382']")).click();
		//select compare button
		driver.findElement(By.linkText("Compare Now")).click();
	 
	}

	@Then("Select Jewellery url")
	public void select_jewellery_url() {
	   
	}

	@Then("Compare two products Of Jewellery")
	public void compare_two_products_of_jewellery() {
	  
	}



}
