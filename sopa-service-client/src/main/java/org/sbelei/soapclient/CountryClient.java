package org.sbelei.soapclient;

import org.sbelei.wsdl.GetCountryRequest;
import org.sbelei.wsdl.GetCountryResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class CountryClient extends WebServiceGatewaySupport {
	
	public GetCountryResponse getCountryInfo(String countryName){
		GetCountryRequest request = new GetCountryRequest();
		request.setName(countryName);
		
		return (GetCountryResponse) getWebServiceTemplate().marshalSendAndReceive(request);
	}

}
