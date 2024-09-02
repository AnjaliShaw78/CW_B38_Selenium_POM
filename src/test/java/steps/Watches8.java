package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Watches8 {
	WebDriver driver;
	@Given("Open chrome browser8 and select JewelleryAndWatches8 url")
	public void open_chrome_browser8_and_select_jewellery_and_watches8_url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 		
		driver.get("https://www.naaptol.com/");
		driver .findElement(By.cssSelector("[class='arrowNav']")).click();
		driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches.html'])[1]")).click();

	}

	@Given("Select Watches8 url")
	public void select_watches8_url() {
		driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches/watches.html'])[2]")).click();

	}

	@When("Select  Rectangle checkboxes")
	public void select_rectangle_checkboxes() {
	   driver.findElement(By.cssSelector("[name='Rectangle']")).click();
	}

	@When("Compare Rectangle two products on the Watches page")
	public void compare_rectangle_two_products_on_the_watches_page() {
		//watch 1
		  driver.findElement(By.cssSelector("[id='cpid12612830']")).click();
			//watch2
		  driver.findElement(By.cssSelector("[id='cpid12612171']")).click();
			// compare
		  driver.findElement(By.linkText("Compare Now")).click();
	}

	@Then("Rectangle comparison results should be displayed")
	public void rectangle_comparison_results_should_be_displayed() {
		String actualText = driver.findElement(By.linkText("Golden Watch (MGW14) - Pick Any One")).getText();
		String expectedText="Golden Watch (MGW14) - Pick Any One";
	   
			Assert.assertEquals(actualText, expectedText);
	}

	@Then("Close the browser8")
	public void close_the_browser8() {
	    driver.close();
	}



}
