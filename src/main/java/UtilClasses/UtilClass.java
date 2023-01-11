package UtilClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilClass 
{
   public String getScreenshot(WebDriver driver,String string) throws IOException
   {
	   Date date=new Date();
	   SimpleDateFormat f=new SimpleDateFormat("yyyy-mm-dd-hh-mm-ss");
	   String currentDate = f.format(date);
       
	   File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   System.out.println(src);
	   
	   File dest=new File("C:\\Users\\admin\\eclipse-workspace\\FlipKart\\Screenshot");
	   FileHandler.copy(src, dest);
	    return currentDate;

   }
   
   public static WebElement Explicitwait(WebDriver driver,WebElement element)
   {
	   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(120));
	   
	   wait.until(ExpectedConditions.visibilityOf(element));
	   return element;
   }
   
   public static String getTData(int RowIndex,int CellIndex) throws EncryptedDocumentException, IOException
   {
  	 FileInputStream file =new FileInputStream("D:\\Selenium\\katraj.xlsx");
  	 Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
        String value = sh.getRow(RowIndex).getCell(CellIndex).getStringCellValue();
       return value;
  	 
   }
}
