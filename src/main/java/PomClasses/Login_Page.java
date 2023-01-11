package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClasses.UtilClass;

public class Login_Page extends UtilClass
{
	WebDriver driver;
//   @FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
//   private WebElement closeButton;
   
   @FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")                   //(//input[@type='text'])[2]
	private WebElement email ;
   
   public Login_Page(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
	   this.driver=driver;
   }
   
  // public void clickclosedButton()
//   {
//	   Explicitwait(driver,closeButton);
//	   closeButton.click();
//   }
	public void putemail() {
		
		email.click();
	}
}
