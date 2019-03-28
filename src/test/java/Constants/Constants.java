package Constants;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.w3c.dom.Document;

import io.restassured.http.Headers;

public class Constants {
	
	
	public static String rcTicket = null;
	public static String releaseNumber = null;

	public static String companyUsername = null;
	public static String PARABANK_RESULTS_LOG_FOLDER_PATH = null;
	public final static String REGISTER_URI = "/parabank/register.htm";
	public final static String GETCUSTOMER_URI = "/parabank/register.htm";
	public final static String TRANSFERFUNDS_URI = "/parabank/register.htm";
	public final static String DEPOSIT_URI = "/parabank/register.htm";
	public final static String WITHDRAW_URI = "/parabank/register.htm";

	public static String requestBody= null;
	public static String RELEASE_NUMBER = null;
	public static String APPTYPE = null;
	public static String REGION = null;
	public static String randomUsername = null;
	public static String randomPassword = null;
	public static String ACCOUNTSTATUS = null;
	
	public static int passed = 0;
	public static int failed = 0;
	
	public static String resultsFolder_testOutput = null;
	
	public static String path;
	public static String logpath;
	public static String excelResultsPath = null;
	public static String resultsFolder = null;

	
	public static Document document;
	public static HttpPost httpPost;
	public static HttpClient httpClient;
	public static StringEntity stringEntity;
	public static HttpResponse response = null;
	public static HttpEntity entity;
	public static String consumer = null;
	public static String StatusMessage = null;

	public static String requestBodySoap = null;

	public static String responseBody = null;

	public static int responseStatusCode = 0;
	public static String Status = null;
	public static String comment = null;
	public static String runResultsFileName = null;

	public static String username_Excel = null;
	public static String password_Excel = null;

	public static String ExpiredRefreshToken = null;
	public static String ExpiredAccessToken = null;
	public static String ExpiredResetKey = null;

	public static String entityBody = null;

	public static String Endpoint = null;
	public static String EndpointRunner = null;
	public static String Environment = null;

	public static String Username = null;
	public static String password = null;
	public static int expectedResponseStatusCode = 0;
	public static String expectedResponseMessage = null;

	public static Map<String, String> headersMap = new HashMap<String, String>();
	public static Headers responseHeaders;
	
}
