package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WebDriverManager.WebDriverManager;

public class LandingPage extends BasePage {

	public LandingPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	//	public @FindBy(xpath = "//input[@name='first_name']") WebElement textfield_FirstName;

	public @FindBy(xpath = ".//div[@id='loginPanel']/p[2]/a") WebElement registerBtn;

	//WebElement registerBtn = driver.findElement(By.xpath(".//div[@id='loginPanel']/p[2]/a"));

	
	public LandingPage clickRegisterbtn() throws InterruptedException, IOException {
		
		clickOnElementUsingCustomTimeout(registerBtn, driver, 15);
		
//		Thread.sleep(8000);
//		if(registerBtn.isDisplayed()) {
//			System.out.println("register btn is displayed");
//		}else {
//			System.out.println("register btn not displayed");
//		}
//		
		//registerBtn.click();
		//driver.findElement(By.xpath(".//div[@id='loginPanel']/p[2]/a")).click();
		System.out.println("clicked on page");
		//Thread.sleep(8000);
		return new LandingPage();
	}
	
}
