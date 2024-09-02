package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Watches3 {
	WebDriver driver;
	@Given("Open chrome browser3 and select JewelleryAndWatches3 url")
	public void open_chrome_browser3_and_select_jewellery_and_watches3_url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 		
		driver.get("https://www.naaptol.com/");
		driver .findElement(By.cssSelector("[class='arrowNav']")).click();
		driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches.html'])[1]")).click();
	

	}

	@Given("Select Watches3 url")
	public void select_watches3_url() {
		driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches/watches.html'])[2]")).click();

	}

	@When("Select Sukkhi checkbox")
	public void select_sukkhi_checkbox() {
		driver.findElement(By.cssSelector("[name='Sukkhi']")).click();
	}

	@When("Compare Sukkhi two products on the Watches page")
	public void compare_sukkhi_two_products_on_the_watches_page() {
		driver.findElement(By.cssSelector("[id='cpid12610518']")).click();
		driver.findElement(By.cssSelector("[id='cpid12611352']")).click();
		driver.findElement(By.linkText("Compare Now")).click();
	}

	@Then("Sukkhi comparison results should be displayed")
	public void sukkhi_comparison_results_should_be_displayed() {
		String actualText = driver.findElement(By.linkText("Golden Watch + Golden Chain (MGWC7)")).getText();
		String expectedText="Golden Watch + Golden Chain (MGWC7)";
	   
			Assert.assertEquals(actualText, expectedText);

	}

	@Then("Close the browser3")
	public void close_the_browser3() {
		driver.close();
	}



}
