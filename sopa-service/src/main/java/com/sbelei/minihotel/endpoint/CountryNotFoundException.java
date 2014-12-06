package com.sbelei.minihotel.endpoint;

import javax.xml.ws.WebFault;


@SuppressWarnings("serial")
@WebFault
public class CountryNotFoundException extends Exception {
	
	public CountryNotFoundException(String value) {
		super("Country not found: " + value);
	}

}
