package steps;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Watches {
	WebDriver driver;
	 ExtentReports reports;
	 ExtentTest test;

@Given("Open chrome browser and select JewelleryAndWatches url")
public void open_chrome_browser_and_select_jewellery_and_watches_url() throws IOException {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	reports = new ExtentReports("C:\\Users\\beati\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\POM_Naaptol\\report.html");
	test = reports.startTest("Naaptol_Jewellery&Watches Testing");		
	driver.get("https://www.naaptol.com/");
	if(driver.getCurrentUrl().equals("https://www.naaptol.com/")) {
		test.log(LogStatus.PASS, "URL entered");
	}
	else {
	test.log(LogStatus.FAIL, "URL not entered");
	}
	captureScreenshot(1);
	driver .findElement(By.cssSelector("[class='arrowNav']")).click();
	test.log(LogStatus.FAIL, "dropdown click");
	driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches.html'])[1]")).click();
	test.log(LogStatus.FAIL, "Jewellery And Watch select");
	captureScreenshot(2);


}
public void captureScreenshot(int n) throws IOException {
    TakesScreenshot ts = (TakesScreenshot) driver;
    File image = ts.getScreenshotAs(OutputType.FILE);
    File img = new File("C:\\Users\\beati\\OneDrive\\Pictures\\SeleniumNaaptol_P2"+n+".png");
    FileUtils.copyFile(image, img);
    System.out.println("Screenshot captured: screenshot" + n + ".png");
}


@Given("Select Watches url")
public void select_watches_url() throws IOException {
	driver.findElement(By.xpath("(//a[@href='/shop-online/jewellery-watches/watches.html'])[2]")).click();
	test.log(LogStatus.FAIL, "Watches url select");
	captureScreenshot(3);




}

@When("Click Cash on Delivery checkbox")
public void click_cash_on_delivery_checkbox() {
	driver.findElement(By.cssSelector("[id='iscod']")).click();
	test.log(LogStatus.FAIL, "CashOn checkbox is clicked");


}

@When("Enter pincode")
public void enter_pincode() throws IOException {
	driver.findElement(By.cssSelector("[name='pincode']")).sendKeys("274604");
	test.log(LogStatus.FAIL, "Pincode entered");
	captureScreenshot(4);


}

@Then("Click set button")
public void click_set_button() {
	driver.findElement(By.linkText("Set")).click();
	test.log(LogStatus.FAIL, "Set button is clicked");


}


@When("Select all checkboxes")
public void select_all_checkboxes() {
	driver.findElement(By.cssSelector("[name='isfreeship']")).click();
	test.log(LogStatus.FAIL, "first checkbox is select");

	driver.findElement(By.cssSelector("[name='Scottish Club']")).click();
	test.log(LogStatus.FAIL, "Second checkbox is select");

}

@When("User enters pincode")
public void user_enters_pincode() {
	driver.findElement(By.cssSelector("[name='pincode']")).sendKeys("274604");
	test.log(LogStatus.FAIL, "pincode is entered");

  
}

@Then("Select clear all link")
public void select_clear_all_link() throws IOException {
	driver.findElement(By.xpath("(//a[@href='javascript:void(0)'])[5]")).click();
	test.log(LogStatus.FAIL, "clear all link is clicked");
	captureScreenshot(5);


}

@When("Compare two products on the Watches page")
public void compare_two_products_on_the_watches_page() {
	//watch 1
	driver.findElement(By.cssSelector("[id='cpid12613301']")).click();
	//watch 2
	driver.findElement(By.cssSelector("[id='cpid12613382']")).click();
	//select compare button
	driver.findElement(By.linkText("Compare Now")).click();
 
}

@Then("Comparison results should be displayed")
public void comparison_results_should_be_displayed() {
	String actualText = driver.findElement(By.xpath("(//td[@valign='top'])[1]")).getText();
	String expectedText="Comparing 2 similar products";
   
		Assert.assertEquals(actualText, expectedText);
		


  
}
@When("Select Abrexo checkbox")
public void select_abrexo_checkbox() {
	driver.findElement(By.cssSelector("[name='Abrexo']")).click();

}

@When("Compare Abrexo two products on the Watches page")
public void compare_abrexo_two_products_on_the_watches_page() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id='cpid12612354']")));
	element.click();
	WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id='cpid12611998']")));
	element2.click();
	WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Compare Now")));
	element3.click();



	//driver.findElement(By.cssSelector("[id='cpid12612354']")).click();
	//driver.findElement(By.cssSelector("[id='cpid12611998']")).click();
	//driver.findElement(By.linkText("Compare Now")).click();
    
}

@Then("Comparison Abrexo results should be displayed")
public void comparison_abrexo_results_should_be_displayed() {
	String actualText = driver.findElement(By.xpath("(//td[@valign='top'])[1]")).getText();
	String expectedText="Comparing 2 similar products";
   
		Assert.assertEquals(actualText, expectedText);
}



@Then("Close the browser")
public void close_the_browser() {
  driver.close();
  test.log(LogStatus.PASS, "Browser closed");
 
	reports.endTest(test);
	 reports.flush();

}




}
      








			



	
	


