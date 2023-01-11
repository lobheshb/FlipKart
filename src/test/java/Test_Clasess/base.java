package Test_Clasess;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base
{
  public static void main(String[] args) 
  {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		boolean verifyPage = driver.findElement(By.xpath("//img[@alt='Flipkart']")).isDisplayed();
		System.out.println(verifyPage);
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("realme");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		String expResult = "realme 9i (Prism Blue, 128 GB)";
		
		List<WebElement> allelements = driver.findElements(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']//div"));
		
		for(WebElement s1:allelements)
		{
			String actResult = s1.getText();
			
			if(expResult.equalsIgnoreCase(actResult))
			{
				s1.click();
				break;
			}
		}
		
		Set<String> allWindows = driver.getWindowHandles();
		
		   Iterator<String> itr = allWindows.iterator();
		   while(itr.hasNext())
		   {
			   driver.switchTo().window(itr.next());
		   }
		   
		  boolean cart = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).isEnabled();
		  System.out.println(cart);
		  
		  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		  
		   String actText = driver.findElement(By.xpath("//span[text()='Place Order']")).getText();
		   
		   System.out.println(actText);
		   
		   String expText = "Place Order";
		   
		   if(actText.equals(expText))
		   {
			   System.out.println("pass");
		   }
		   else
		   {
			   System.out.println("fail");
		   }
		 
		   driver.quit();
}
}
