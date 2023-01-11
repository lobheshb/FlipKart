package BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass 
{
     public static WebDriver getChromeDriver()
     {
    	 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
    	 WebDriver driver =new ChromeDriver();
    	// System.out.println("hello java world");
    	 driver.get("https://www.flipkart.com/");
    	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	 driver.manage().window().maximize();
    	 return driver;
    	 
    	 
     }
     static ExtentHtmlReporter htmlReporter;
     static ExtentReports report;
     static ExtentTest test;

     public static ExtentTest getTestForReproter(String useCase) {
     	return test=report.createTest(useCase);
     	
     }
     public static ExtentHtmlReporter gethtmlReporter() {
     	if(htmlReporter==null) {
     		htmlReporter = new ExtentHtmlReporter("ExtentReporter.html");
     	}
     	return htmlReporter;	
     }

     public static ExtentReports getExtentReports() {
     	
     	if(report==null) {
     		report = new ExtentReports();
     		report.attachReporter();
     		
     		
}
		return report;
}}