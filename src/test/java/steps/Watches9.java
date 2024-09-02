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

public class Watches9 {
	WebDriver driver;
	@Given("Open chrome browser9 and select JewelleryAndWatches9 url")
	public void open_chrome_browser9_and_select_jewellery_and_watches9_url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 		
		driver.get("https://www.naaptol.com/");
		driver .findElement(By.cssSelector("[class='arrowNav']")).click();
		driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches.html'])[1]")).click();


	}

	@Given("Select Watches9 url")
	public void select_watches9_url() {
		driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches/watches.html'])[2]")).click();

	}

	@When("Select  Square checkboxes")
	public void select_square_checkboxes() {
	   driver.findElement(By.cssSelector("[name='Square']")).click();
	}

	@When("Compare Square two products on the Watches page")
	public void compare_square_two_products_on_the_watches_page() {
		//watch 1
		  driver.findElement(By.cssSelector("[id='cpid12612037']")).click();
		  JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement click1 = driver.findElement(By.cssSelector("[id='cpid12611527']"));     
			js.executeScript("arguments[0].click()",click1);
		  
			// compare
		  driver.findElement(By.linkText("Compare Now")).click();
	}

	@Then("Square comparison results should be displayed")
	public void square_comparison_results_should_be_displayed() {
		String actualText = driver.findElement(By.linkText("Golden Watch with Diamond Cut Golden Chain (MGWC22)")).getText();
		String expectedText="Golden Watch with Diamond Cut Golden Chain (MGWC22)";
	   
			Assert.assertEquals(actualText, expectedText);

	}

	@Then("Close the browser9")
	public void close_the_browser9() {
		driver.close();
	   
	}



}
