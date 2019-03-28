package WebDriverManager;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.cucumber.listener.Reporter;

import Constants.Constants;
import PageObjects.LandingPage;
import PageObjects.RegistrationPage;
import PageObjects.WelcomePage;
import Util.Lib;

public class WebDriverManager extends Constants {
	
	public static WebDriver driver;
	protected WebDriverWait wait;
	protected JavascriptExecutor jsExecutor;
	
	public static LandingPage landingPage;
	public static RegistrationPage registrationPage;
	public static WelcomePage welcomePage;

	public WebDriverManager() throws IOException {
		this.wait = new WebDriverWait(driver, 15);
		jsExecutor = ((JavascriptExecutor) driver);
	}
	

	public static WebDriver getLocalDriver(String osType, String browserType) throws IOException {

		try {
			if (browserType.equalsIgnoreCase("chrome")) {

				if (osType.equalsIgnoreCase("mac")) {
					System.setProperty("webdriver.chrome.driver", Lib.getBrowserDriverPathProperties("macChrome_72"));
				} else if (osType.equalsIgnoreCase("Win")) {
					System.setProperty("webdriver.chrome.driver", "../Generic/driver/chromedriver.exe");
				}

				driver = new ChromeDriver();

			} else if (browserType.equalsIgnoreCase("firefox")) {

				if (osType.equalsIgnoreCase("mac")) {
					System.setProperty("webdriver.gecko.driver",
							"/Users/sami/Desktop/RocketLauncher/Mac/Drivers/geckodriver_V_19_1");
				} else if (osType.equalsIgnoreCase("win")) {
					System.setProperty("webdriver.gecko.driver", "../Generic/driver/geckodriver.exe");
				}
				driver = new FirefoxDriver();

			}
		}catch (Exception e) {
			System.out.println("Unable to load browser: " + e.getMessage());
		} finally {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			landingPage = PageFactory.initElements(driver, LandingPage.class);
			welcomePage = PageFactory.initElements(driver, WelcomePage.class);
			registrationPage = PageFactory.initElements(driver, RegistrationPage.class);

		}
		
		
		return driver;

	}

	public static WebDriver launchSeleniumGrid(String osType, String browserType) throws MalformedURLException {
		// passing node url to remote driver
		String seleniumHubNodeURL = "http://172.17.0.2:4444/wd/hub";

		WebDriver driver = null;

		DesiredCapabilities caps = new DesiredCapabilities();

		// Platforms
		if (osType.equalsIgnoreCase("win")) {
			caps.setPlatform(Platform.WINDOWS);
		}
		if (osType.equalsIgnoreCase("mac")) {
			caps.setPlatform(Platform.MAC);
		}
		if (osType.equalsIgnoreCase("Linux")) {
			caps.setPlatform(Platform.LINUX);
		}

		// Browsers - set which browser to run
		if (browserType.equalsIgnoreCase("chrome")) {
			caps = DesiredCapabilities.chrome();
		}
		if (browserType.equalsIgnoreCase("firefox")) {
			caps = DesiredCapabilities.firefox();
		}
		// Version set the version
		// caps.setVersion(browserVersion);

		// initialze Webdriver with grid
		driver = new RemoteWebDriver(new URL(seleniumHubNodeURL), caps);

		return driver;
	}

	public static WebDriver launchSauceLabs(WebDriver driver) {

		return driver;
	}

	public static WebDriver launchBrowserStack(WebDriver driver) {

		return driver;
	}

	public static WebDriver launchAWS(WebDriver driver) {

		return driver;

	}
	
}