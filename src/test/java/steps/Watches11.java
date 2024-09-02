package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Watches11 {
	WebDriver driver;
	@Given("Open chrome browser11 and select JewelleryAndWatches11 url")
	public void open_chrome_browser11_and_select_jewellery_and_watches11_url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 		
		driver.get("https://www.naaptol.com/");
		driver .findElement(By.cssSelector("[class='arrowNav']")).click();
		driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches.html'])[1]")).click();


	}

	@Given("Select Watches11 url")
	public void select_watches11_url() {
		driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches/watches.html'])[2]")).click();

	}

	@When("Select  Digital checkboxes")
	public void select_digital_checkboxes() {
	    driver.findElement(By.cssSelector("[name='Digital']")).click();
	}

	@When("Compare Digital two products on the Watches page")
	public void compare_digital_two_products_on_the_watches_page() {
		  driver.findElement(By.cssSelector("[id='cpid12611527']")).click();
		  JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement click1 = driver.findElement(By.cssSelector("[id='cpid12612058']"));     
			js.executeScript("arguments[0].click()",click1);
		  
			// compare
		  driver.findElement(By.linkText("Compare Now")).click();
	}

	@Then("Digital comparison results should be displayed")
	public void digital_comparison_results_should_be_displayed() {
		String actualText = driver.findElement(By.linkText("Golden Touch Screen Watch with Free Chain (GTSWC2)")).getText();
		String expectedText="Golden Touch Screen Watch with Free Chain (GTSWC2)";
	   
			Assert.assertEquals(actualText, expectedText);

	}

	@Then("Close the browser11")
	public void close_the_browser11() {
	   driver.close();
	}
}
