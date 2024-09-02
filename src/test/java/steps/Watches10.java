package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Watches10 {
WebDriver driver;
@Given("Open chrome browser10 and select JewelleryAndWatches10 url")
public void open_chrome_browser10_and_select_jewellery_and_watches10_url() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 		
	driver.get("https://www.naaptol.com/");
	driver .findElement(By.cssSelector("[class='arrowNav']")).click();
	driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches.html'])[1]")).click();


}

@Given("Select Watches10 url")
public void select_watches10_url() {
driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches/watches.html'])[2]")).click();

}

@When("Select  Analog checkboxes")
public void select_analog_checkboxes() {
 driver.findElement(By.cssSelector("[name='Analog']")).click();
}

@When("Compare Analog two products on the Watches page")
public void compare_analog_two_products_on_the_watches_page() {
	//driver.findElement(By.cssSelector("[id='cpid12613229']")).click();
	 JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement click2 = driver.findElement(By.cssSelector("[id='cpid12610395']"));     
		js.executeScript("arguments[0].click()",click2);
       driver.findElement(By.cssSelector("[id='cpid12610518']"));     
		
	  
		// compare
	  driver.findElement(By.linkText("Compare Now")).click();
    
}

@Then("Analog comparison results should be displayed")
public void analog_comparison_results_should_be_displayed() {
	String actualText = driver.findElement(By.linkText("Golden Watch + 2 Golden Chain + Bracelet + Diamond Ring (MGW2CBR)")).getText();
	String expectedText="Golden Watch + 2 Golden Chain + Bracelet + Diamond Ring (MGW2CBR)";
   
		Assert.assertEquals(actualText, expectedText);
}

@Then("Close the browser10")
public void close_the_browser10() {
  driver.close();
}




}
