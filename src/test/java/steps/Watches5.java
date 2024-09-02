package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Watches5 {
	WebDriver driver;
	@Given("Open chrome browser5 and select JewelleryAndWatches5 url")
	public void open_chrome_browser5_and_select_jewellery_and_watches5_url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 		
		driver.get("https://www.naaptol.com/");
		driver .findElement(By.cssSelector("[class='arrowNav']")).click();
		driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches.html'])[1]")).click();
	

	}

	@Given("Select Watches5 url")
	public void select_watches5_url() {
	driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches/watches.html'])[2]")).click();

	}

	@When("Select  House of Vellani checkbox")
	public void select_house_of_vellani_checkbox() {
		driver.findElement(By.cssSelector("[name='House of Vellani']")).click();
	 
	}

	@When("Compare House of Vellani two products on the Watches page")
	public void compare_house_of_vellani_two_products_on_the_watches_page() {
		driver.findElement(By.cssSelector("[id='cpid12612527']")).click();
		driver.findElement(By.cssSelector("[id='cpid12611387']")).click();
		driver.findElement(By.linkText("Compare Now")).click();

	}

	@Then("House of Vellani comparison results should be displayed")
	public void house_of_vellani_comparison_results_should_be_displayed() {
		String actualText = driver.findElement(By.linkText("Ladies Watch + 2 Free Bracelet (LWFB1)")).getText();
		String expectedText="Ladies Watch + 2 Free Bracelet (LWFB1)";
	   
			Assert.assertEquals(actualText, expectedText);

	}

	@Then("Close the browser5")
	public void close_the_browser5() {
	 driver.close();
	}

}
