package Runners;

import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import Constants.Constants;
import Util.Lib;
import WebDriverManager.WebDriverManager;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/Feature", glue = "Steps", tags = { "@Local" }, format = {
		"json:target/Destination/cucumber.json", "html:target/site/cucumber-pretty" })
public class ParaBank_Runner extends AbstractTestNGCucumberTests {

	@BeforeSuite
	public void first() throws Exception {

		//define and assign environmen variables found in POM.xml
		Constants.Environment = System.getProperty("Environment");
		Constants.RELEASE_NUMBER =System.getProperty("releaseNumber");
		Constants.companyUsername = System.getProperty("Username");
		Constants.rcTicket = System.getProperty("rcticket");
		Constants.releaseNumber = System.getProperty("rcticket");

		//hardcoding enviornment and username for now :
		Constants.Environment = "STAGING";
		Constants.companyUsername = "sidrissi";
		
		System.out.println("ENV under test : "+ Constants.Environment);
		
		
		// create results folder
		Constants.path = Lib.CreateResultFolder(Constants.companyUsername); 
		System.out.println("results folder was create in this path : "+Constants.path);
		
		
		//define log path
		Constants.logpath = Constants.path + "/Logs";
		
		//create log folder
		Lib.createLogFolder(Constants.logpath);

		
		
		// define all log folder name by service name or scenario name
		String Registration = Constants.path + "/Logs/Registration";
		String CreateNewAccount = Constants.path + "/Logs/CreateNewAccount";
		String Withdraw = Constants.path + "/Logs/Withdraw";
		String Deposit = Constants.path + "/Logs/Deposit";
		String TransferFunds = Constants.path + "/Logs/TransferFunds";

		// create service/scenario log folder
		Lib.createLogFolder_for_Service(Registration, "Registration");
		Lib.createLogFolder_for_Service(CreateNewAccount, "CreateNewAccount");
		Lib.createLogFolder_for_Service(Withdraw, "Withdraw");
		Lib.createLogFolder_for_Service(Deposit, "Deposit");
		Lib.createLogFolder_for_Service(Registration, "Registration");
		Lib.createLogFolder_for_Service(TransferFunds, "TransferFunds");

		// define variable results log folder path
		Constants.PARABANK_RESULTS_LOG_FOLDER_PATH = "/Users/sami/Desktop/Automation/Parabank/Runs" + Lib.getcurrentdatefolder()
				+ Constants.Environment + "/Logs";

		// create and write column names for excel result
		Constants.runResultsFileName = Constants.path + "/RunResults_PARABANK.xlsx";
		Lib.create_SetupExcelResultsSheet(Constants.runResultsFileName);

		// create if else blocks for enviornment endpoints
		if (Constants.Environment.equalsIgnoreCase("K2SIT")) {
			Constants.EndpointRunner = Lib.readproperties("K2SIT_ITPAG_Endpoint");

		} else if (Constants.Environment.equalsIgnoreCase("360LSIT")) {
			Constants.EndpointRunner = Lib.readproperties("360LSIT_ITPAG_Endpoint");

		} else if (Constants.Environment.equalsIgnoreCase("PDEV")) {
			Constants.EndpointRunner = Lib.readproperties("360LPDEV_ITPAG_Endpoint");

		} else if (Constants.Environment.equalsIgnoreCase("STAGING")) {
			Constants.EndpointRunner = Lib.readproperties("360LSTAGING_ITPAG_Endpoint");

		} else if (Constants.Environment.equalsIgnoreCase("FT")) {
			Constants.EndpointRunner = Lib.readproperties("360LFT_ITPAG_Endpoint");
		}
	}

	// @Parameters({""})
	@BeforeClass
	public void ini() throws IOException {

		// generate a random user before each test class executes
		// WebServiceStepDefinition.Username = Lib.generateRandom_SXM_TestUser();

	}

	@Parameters({ "osType", "browserType", "runLocal", "useGrid", "useAWS", "useSauceLabs" })
	@BeforeMethod()
	public void beforeTest(@Optional String osType, @Optional String browserType, @Optional String runLocal,
			@Optional String useGrid, @Optional String useAWS, @Optional String useSauceLabs) throws IOException {

		if (runLocal.equalsIgnoreCase("true")) {

			WebDriverManager.getLocalDriver(osType, browserType);

		} else if (useGrid.equalsIgnoreCase("true")) {

			WebDriverManager.launchSeleniumGrid(osType, browserType);

		} else if (useSauceLabs.equalsIgnoreCase("true")) {

		}

	}

	@AfterSuite
	public void afterSuite()
			throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException {

		// do something after all the tests have finished running like count the total
		
		//Generate total test cases that passed and failed
//		String excelFilePath = Constants.path + "/RunResults_PARABANK.xlsx";
//
//		System.out.println("Excel results file path : "+excelFilePath);
//		HashMap<String,Integer> resultsMap = Lib.getStatusDataReport(excelFilePath);
//		Integer passed = resultsMap.get("Passed");
//		Integer failed = resultsMap.get("Failed");
//		Integer totalTestCases = resultsMap.get("Passed") + resultsMap.get("Failed");
//		
//		System.out.println("Total Passed : "+passed);
//		System.out.println("Total Failed : "+failed);
//		System.out.println("TotalTestCases : "+totalTestCases);
//		
//		Lib.excelwrite(Constants.runResultsFileName,
//				new Object[] { Lib.getcurrentdate(), null, null, null, null,
//						"Total Test Cases", "Passed TC's", "Failed TC's", null, null, null, null,
//						null, null, null, null, null, null });
//		Lib.excelwrite(Constants.runResultsFileName,
//				new Object[] { Lib.getcurrentdate(), null, null, null, null,
//						totalTestCases, passed, failed, null, null, null, null,
//						null, null, null, null, null, null });
//		

	}

}
