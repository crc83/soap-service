package org.sbelei.soapclient;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.sbelei.wsdl.GetCountryResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(CountryConfiguration.class, args);

		CountryClient countryClient = ctx.getBean(CountryClient.class);
		GetCountryResponse responce = countryClient.getCountryInfo("Ukraine");
		
		System.out.println( ToStringBuilder.reflectionToString(responce.getCountry()) );
	}

}