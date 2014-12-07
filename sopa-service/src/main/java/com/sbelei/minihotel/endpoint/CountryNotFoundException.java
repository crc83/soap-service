package com.sbelei.minihotel.endpoint;

import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;


@SuppressWarnings("serial")
@SoapFault(faultCode = FaultCode.CLIENT)
public class CountryNotFoundException extends Exception {
	
	public CountryNotFoundException(String value) {
		super("Country not found: " + value);
	}

}
