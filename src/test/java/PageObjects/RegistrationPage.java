package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import WebDriverManager.WebDriverManager;

public class RegistrationPage extends WebDriverManager {

	public RegistrationPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	// elements
	@FindBy(xpath = "//input[@id='customer.firstName']")
	static WebElement firstnameField;
	
	@FindBy(xpath = "//input[@id='customer.lastName']")
	static WebElement lastnameField;
	
	@FindBy(xpath = "//input[@id='customer.address.street']")
	static WebElement addressField;
	
	@FindBy(xpath = "//input[@id='customer.address.city']")
	static WebElement cityField;
	
	@FindBy(xpath = "//input[@id='customer.address.state']")
	static WebElement stateField;
	
	@FindBy(xpath = "//input[@name='customer.address.zipCode']")
	static WebElement zipcodeField;
	
	@FindBy(xpath = "//input[@id='customer.phoneNumber']")
	static WebElement phoneField;
	
	@FindBy(xpath = "//input[@id='customer.ssn']")
	static WebElement ssnField;

	@FindBy(xpath = "//input[@id='customer.username']")
	static WebElement usernameField;
	
	@FindBy(xpath = "//input[@name='customer.password']")
	static WebElement passwordField;

	@FindBy(xpath = "input[@id='repeatedPassword']")
	static WebElement confirmField;
	
	@FindBy(xpath = "//input[@value='Register']")
	static WebElement registerBtn;

	
	//~~~~~~~~~~~~action methods~~~~~~~~~
	public static void enterFirstname(String firstname) {

		firstnameField.sendKeys(firstname);

	}

	public static void enterLastName(String lastname) {

		lastnameField.sendKeys(lastname);

	}

	public static void enterAddress(String address) {

		firstnameField.sendKeys(address);

	}

	public static void enterCity(String city) {

		firstnameField.sendKeys(city);

	}

	public static void enterState(String state) {

		firstnameField.sendKeys(state);

	}

	public static void enterZipCode(String zipCode) {

		firstnameField.sendKeys(zipCode);

	}

	public static void enterPhoneNum(String phoneNum) {

		firstnameField.sendKeys(phoneNum);

	}

	public static void enterSSN(String ssn) {

		firstnameField.sendKeys(ssn);

	}

	public static void enterUsername(String username) {

		firstnameField.sendKeys(username);

	}

	public static void enterPassword(String password) {

		firstnameField.sendKeys(password);

	}
	
	public static void enterConfirmPassword(String password) {

		confirmField.sendKeys(password);

	}

	public static void clickRegisterBtn() {

		registerBtn.click();
	}

}
