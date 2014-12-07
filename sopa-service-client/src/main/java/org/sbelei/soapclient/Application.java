package org.sbelei.soapclient;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(CountryConfiguration.class, args);

		CountryClient countryClient = ctx.getBean(CountryClient.class);

		
//		GetCityForecastByZIPResponse response = weatherClient.getCityForecastByZip(zipCode);
//		weatherClient.printResponse(response);
	}

}