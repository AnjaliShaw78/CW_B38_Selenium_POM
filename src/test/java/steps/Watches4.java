package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Watches4 {
	WebDriver driver;
	@Given("Open chrome browser4 and select JewelleryAndWatches4 url")
	public void open_chrome_browser4_and_select_jewellery_and_watches4_url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 		
		driver.get("https://www.naaptol.com/");
		driver .findElement(By.cssSelector("[class='arrowNav']")).click();
		driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches.html'])[1]")).click();
	

	}

	@Given("Select Watches4 url")
	public void select_watches4_url() {
		driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches/watches.html'])[2]")).click();

	}

	@When("Select Men checkbox")
	public void select_men_checkbox() {
	    driver.findElement(By.cssSelector("[name='Men']")).click();
	}

	@When("Compare Men two products on the Watches page")
	public void compare_men_two_products_on_the_watches_page() {
		//watch 1
		driver.findElement(By.cssSelector("[id='cpid12611292']")).click();
		// watch2
		driver.findElement(By.cssSelector("[id='cpid12613591']")).click();
		// compare
		driver.findElement(By.linkText("Compare Now")).click();
	  
	}

	@Then("Men comparison results should be displayed")
	public void men_comparison_results_should_be_displayed() {
		String actualText = driver.findElement(By.linkText("Golden Watch + 4 Golden Chains + Barcelet + Ring (MGW4CBR)")).getText();
		String expectedText="Golden Watch + 4 Golden Chains + Barcelet + Ring (MGW4CBR)";
	   
			Assert.assertEquals(actualText, expectedText);

	}

	@Then("Close the browser4")
	public void close_the_browser4() {
	    driver.close();
	}



}
