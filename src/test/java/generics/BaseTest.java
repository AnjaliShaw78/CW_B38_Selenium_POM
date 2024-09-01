package generics;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest {
	protected WebDriver driver;
	String Origin;
	ExtentReports reports;
	protected ExtentTest test;
	protected String pincode1;
	protected String pincode2;
	@BeforeClass
	public void reportconfigs() throws IOException {
		 reports = new ExtentReports("C:\\Users\\beati\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\POM_Naaptol\\report.html");
		 test = reports.startTest("Naaptol_Jewellery&Watches Testing");	
    }
    
	@BeforeMethod
	public void setup() throws IOException {
		driver =new ChromeDriver();
		Properties pro = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\beati\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\POM_Naaptol\\src\\test\\resources\\config.properties");
		pro.load(file);
		Origin = pro.getProperty("url");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(Origin);
		if(driver.getCurrentUrl().equals(Origin)) {
			test.log(LogStatus.PASS, "URL entered");
		}
		else {
		test.log(LogStatus.FAIL, "URL not entered");
		}
		 pincode1 = pro.getProperty("pincode");
		 pincode2 = pro.getProperty("pincode");
	}
		 public void captureScreenshot(int n) throws IOException {
		        TakesScreenshot ts = (TakesScreenshot) driver;
		        File image = ts.getScreenshotAs(OutputType.FILE);
		        File img = new File("C:\\Users\\beati\\OneDrive\\Pictures\\SeleniumNaaptol_POM\\Screenshot"+n+".png");
		        FileUtils.copyFile(image, img);
		        System.out.println("Screenshot captured: screenshot" + n + ".png");
		    }

		 
	
		
	@AfterMethod
	public void teardown() {
		driver.close();
		test.log(LogStatus.PASS, "Browser closed");
	}
	
	
	@AfterClass
	public void flush() {
		reports.flush();
		reports.endTest(test);
	}
	

}
