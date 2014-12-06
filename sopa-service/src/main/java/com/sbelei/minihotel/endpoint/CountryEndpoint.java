package com.sbelei.minihotel.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.sbelei.minihotel.owner.Country;
import com.sbelei.minihotel.owner.GetCountryRequest;
import com.sbelei.minihotel.owner.GetCountryResponse;
import com.sbelei.minihotel.repository.CountryRepository;

@Endpoint
public class CountryEndpoint {
	private static final String NAMESPACE_URI = "http://sbelei.com/minihotel/owner";

	private CountryRepository countryRepository;

	@Autowired
	public CountryEndpoint(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
	@ResponsePayload
	public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) throws CountryNotFoundException {
		GetCountryResponse response = new GetCountryResponse();
		Country country = countryRepository.findCountry(request.getName());
		if (country == null) {
			throw new CountryNotFoundException(request.getName());
		}
		response.setCountry(country);

		return response;
	}
}
