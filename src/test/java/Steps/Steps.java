package Steps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjects.LandingPage;
import PageObjects.RegistrationPage;
import PageObjects.WelcomePage;
import Util.Lib;
import WebDriverManager.WebDriverManager;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps extends WebDriverManager {

	public Steps() throws IOException {
		super();
	}

	static LandingPage lp = PageFactory.initElements(driver, LandingPage.class);
	static RegistrationPage registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
	static WelcomePage wp = PageFactory.initElements(driver, WelcomePage.class);
	
	//~~~~~~~~~~testing env~~~~~~~~~
	@Then("^launch locally$")
	public void launchLocally() throws InterruptedException, IOException {

		
		System.out.println("hello jhakjshdkha");
//		driver.get(Lib.getEndpointProperties("STAGING_PARABANK"));
//
//		String title = driver.getTitle();
//		System.out.println("title is " + title);
//		Thread.sleep(7000);
//
//		driver.close();
//		driver.quit();

	}

	@Then("^launch AWS cloud$")
	public void launch_AWS_cloud() {
		
		System.out.println("hello");

	}

	@Then("^launch browserStack$")
	public void launch_browserStack() {

	}

	@Then("^launch SauceLabs$")
	public void launch_SauceLabs() {

	}
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	//~~~~~~~parabank steps~~~~~~~~~~~
	
	//~~~~~~background~~~~~~~
	
	@Given("^launching app$")
	public void launchBrowser() throws IOException {
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	//~~~~~~~registration steps~~~~~~~~~
	
	@Given("^user fills out the registration form$")
	public void user_fills_out_the_registration_form() throws InterruptedException, IOException {
			System.out.println("STARTED FILLING REGISTRATION");
		
		//click 
		lp.clickRegisterbtn();	
		registrationPage.enterFirstname("sami");
		registrationPage.enterLastName("sabir");
		registrationPage.enterAddress("901 south scott street");
		registrationPage.enterCity("arlington");
		registrationPage.enterState("VA");
		registrationPage.enterZipCode("22204");
		registrationPage.enterPhoneNum("909 928 0021");
		registrationPage.enterSSN("223-81-9012");
		registrationPage.enterUsername("defjam003");
		registrationPage.enterPassword("byebye");
		registrationPage.enterConfirmPassword("byebye");
		
		
	}
	
	@And("^clicks register$")
	public void clicks_register() {
		System.out.println("CLICKING REGISTRATION BUTTON");
		registrationPage.clickRegisterBtn();

	}
	
	@Then("^user should be logged in after submitting the registration form \"([^\"]*)\"$")
	public void user_should_be_logged_in_after_submitting_the_registration_form(String testname) {
		System.out.println("VALIDATING SUCCESS MESSAGE");
		String text = wp.validateSuccessfulRegistrationMessage();
		System.out.println(text);
		System.out.println(testname);
	}
	
	
	
}
