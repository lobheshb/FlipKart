package Test_Clasess;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import BaseClass.BaseClass;
import PomClasses.Home_Page;
import PomClasses.Login_Page;
import UtilClasses.UtilClass;

public class Test_Clasess extends UtilClass {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports report;
	ExtentTest test;
	Login_Page lp;
	Home_Page hp;

	@BeforeClass
	public void openBrowser() {
		driver = BaseClass.getChromeDriver();

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("ExtentReporter.html");
		ExtentReports report = new ExtentReports();
		report.attachReporter(htmlReporter);
		ExtentTest test = report.createTest("Test_Clasess");

	}

	@BeforeMethod
	public void beforemethod() {
		lp = new Login_Page(driver);
		hp = new Home_Page(driver);
	}

	@Test
	public void LoginToApp() throws EncryptedDocumentException, IOException {
		
		lp.putemail();
		hp.verifypage();
		hp.searchfeild();
		hp.searchbutton();
	}

	@Test
	public void SearchMobile() {
		//driver.quit();

	}
	
	@AfterMethod
	  public void afterMethod(ITestResult result) throws IOException {

		  if(result.getStatus() == ITestResult.SUCCESS){
				test.log(Status.PASS, "Test is passed " + result.getName());
			}
			else
			{
				String path = hp.getScreenshot(driver, result.getName());
				test.log(Status.FAIL, "Test is failed " + result.getName(), 
				MediaEntityBuilder.createScreenCaptureFromPath(path).build());
			}  			  
	  } 
@AfterClass
public void afterClass() {
	  report.flush();
	 // driver
	
}
	
	
	
	
	
	

}
