package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Watches6 {
	WebDriver driver;
	@Given("Open chrome browser6 and select JewelleryAndWatches6 url")
	public void open_chrome_browser6_and_select_jewellery_and_watches6_url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 		
		driver.get("https://www.naaptol.com/");
		driver .findElement(By.cssSelector("[class='arrowNav']")).click();
		driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches.html'])[1]")).click();

	}

	@Given("Select Watches6 url")
	public void select_watches6_url() {
		driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches/watches.html'])[2]")).click();

	}

	@When("Select Women checkboxes")
	public void select_women_checkboxes() {
		driver.findElement(By.cssSelector("[name='Women']")).click();
	    
	}

	@When("Compare Women two products on the Watches page")
	public void compare_women_two_products_on_the_watches_page() {
		//watch 1
		driver.findElement(By.cssSelector("[id='cpid12613072']")).click();
		//watch2
		driver.findElement(By.cssSelector("[id='cpid12613633']")).click();
		// compare
		driver.findElement(By.linkText("Compare Now")).click();
	  
	}

	@Then("Women comparison results should be displayed")
	public void women_comparison_results_should_be_displayed() {
		String actualText = driver.findElement(By.linkText("Ladies Watch + 2 Chain + Pendant (LW2CP)")).getText();
		String expectedText="Ladies Watch + 2 Chain + Pendant (LW2CP)";
	   
			Assert.assertEquals(actualText, expectedText);

	}

	@Then("Close the browser6")
	public void close_the_browser6() {
	   driver.close();
	}



}
