package PageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import WebDriverManager.WebDriverManager;

public class WelcomePage extends WebDriverManager {
	
	//p[contains(text(),'Your account was created successfully. You are now')]

	public WelcomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


	@FindBy(xpath="//p[contains(text(),'Your account was created successfully. You are now')]")
	static WebElement successfulRegistrationMessage;
	
	
	public static String validateSuccessfulRegistrationMessage() {
		
		String text = successfulRegistrationMessage.getText();
		
		
		return text;
		
	}
	
}
