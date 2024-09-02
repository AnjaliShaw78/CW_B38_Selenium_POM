package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Watches7 {
	WebDriver driver;
	@Given("Open chrome browser7 and select JewelleryAndWatches7 url")
	public void open_chrome_browser7_and_select_jewellery_and_watches7_url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 		
		driver.get("https://www.naaptol.com/");
		driver .findElement(By.cssSelector("[class='arrowNav']")).click();
		driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches.html'])[1]")).click();

	}

	@Given("Select Watches7 url")
	public void select_watches7_url() {
		driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches/watches.html'])[2]")).click();

	}

	@When("Select  Round checkboxes")
	public void select_round_checkboxes() {
		driver.findElement(By.cssSelector("[name='Round']")).click();

	}

	@When("Compare Round two products on the Watches page")
	public void compare_round_two_products_on_the_watches_page() {
		//watch 1
	  driver.findElement(By.cssSelector("[id='cpid12609867']")).click();
		//watch2
	  driver.findElement(By.cssSelector("[id='cpid12612904']")).click();
		// compare
	  driver.findElement(By.linkText("Compare Now")).click();

	}

	@Then("Round comparison results should be displayed")
	public void round_comparison_results_should_be_displayed() {
		String actualText = driver.findElement(By.linkText("Golden Watch + 2 Chain + Bracelet + Ring (MGW2CBR4)")).getText();
		String expectedText="Golden Watch + 2 Chain + Bracelet + Ring (MGW2CBR4)";
	   
			Assert.assertEquals(actualText, expectedText);
	}

	@Then("Close the browser7")
	public void close_the_browser7() {
	    driver.close();
	}



}
