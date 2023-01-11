package PomClasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClasses.UtilClass;

public class Home_Page extends UtilClass {
	WebDriver driver;
	@FindBy(xpath = "//img[@alt='Flipkart']")
	private WebElement verifyPage;

	@FindBy(xpath = "//span[text()='Cart']")             // input[@class='_3704LK']
	private WebElement cart;

	@FindBy(xpath = "//span[text()='Login']") // button[@type='submit']
	private WebElement login;

	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver = this.driver;
	}

	public void verifypage() {
//		try {
//			Explicitwait(driver, verifyPage);

			//verifyPage.isDisplayed();
//		} catch (Exception e) {
//			Explicitwait(driver, verifyPage);

			System.out.println(verifyPage.isDisplayed());
		}
//	}

	public void searchfeild() throws EncryptedDocumentException, IOException {
//		try {
//			Explicitwait(driver, cart);
			cart.click();
//		} catch (Exception e) {
//		//	Explicitwait(driver, cart);
//		//	cart.click();
//		}
	}

	public void searchbutton() {
//		try {
//			Explicitwait(driver, login);
			login.click();
//		} catch (Exception e) {
//		//	Explicitwait(driver, login);
//		//	login.click();
//		}
	}
}
