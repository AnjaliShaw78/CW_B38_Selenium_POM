package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Watches2 {
	WebDriver driver;
	@Given("Open chrome browser and select JewelleryAndWatches2 url")
	public void open_chrome_browser_and_select_jewellery_and_watches2_url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 		
		driver.get("https://www.naaptol.com/");
		driver .findElement(By.cssSelector("[class='arrowNav']")).click();
		driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches.html'])[1]")).click();
	
	}

	@Given("Select Watches2 url")
	public void select_watches2_url() {
		driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches/watches.html'])[2]")).click();

	    	}

	@When("Select Branded checkbox")
	public void select_branded_checkbox() {
		driver.findElement(By.cssSelector("[id='brandFilterBox8313']")).click();
	}

	@When("Compare Branded two products on the Watches page")
	public void compare_branded_two_products_on_the_watches_page() {
		driver.findElement(By.cssSelector("[id='cpid12613071']")).click();
		driver.findElement(By.cssSelector("[id='cpid12613026']")).click();
		driver.findElement(By.linkText("Compare Now")).click();
		
	 	}

	@Then("Branded Comparison results should be displayed")
	public void branded_comparison_results_should_be_displayed() {
		String actualText = driver.findElement(By.linkText("Golden Watch with Golden Chain + Bracelet + Ring (MGWCBR10)")).getText();
		String expectedText="Golden Watch with Golden Chain + Bracelet + Ring (MGWCBR10)";
	   
			Assert.assertEquals(actualText, expectedText);
	}
	@Then("Close2 the browser")
	public void close2_the_browser() {
		  driver.close();

	}

	
	
	 
	


}
