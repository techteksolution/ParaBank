package Services;

import Constants.Constants;

public class Deposit extends Constants {

	
	
	public static void makeDeposit(String accountID, String amount) {
		
		
		requestBody = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ser=\"http://service.parabank.parasoft.com/\">\n" + 
				"   <soapenv:Header/>\n" + 
				"   <soapenv:Body>\n" + 
				"      <ser:deposit>\n" + 
				"         <ser:accountId>?</ser:accountId>\n" + 
				"         <ser:amount>?</ser:amount>\n" + 
				"      </ser:deposit>\n" + 
				"   </soapenv:Body>\n" + 
				"</soapenv:Envelope>";
		
	}
}
