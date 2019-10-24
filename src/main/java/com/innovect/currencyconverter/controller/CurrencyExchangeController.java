package com.innovect.currencyconverter.controller;

import java.net.URL;
import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.innovect.currencyconverter.model.CurrencyExchangeRate;
import com.innovect.currencyconverter.service.CurrencyExchangeRateService;

@RestController
public class CurrencyExchangeController {
	@Autowired
	private CurrencyExchangeRateService currencyExchangeRateService;

	@PostConstruct
	public void init()
	{
		String url="https://api.exchangerate-api.com/v4/latest/{uri}";
		String uri="USD";
		RestTemplate rest= new RestTemplate();
//		HttpHeaders headers = new HttpHeaders();
//	    headers.setAccept(Arrays.asList(MediaType.TEXT_PLAIN));
//	    HttpEntity<CurrencyExchangeRate> entity = new HttpEntity<CurrencyExchangeRate>(headers);
//	    CurrencyExchangeRate model=rest.exchange("https://api.exchangerate-api.com/v4/latest/USD", HttpMethod.GET, entity, CurrencyExchangeRate.class).getBody();
		//CurrencyExchangeRate model=rest.getForObject("https://api.exchangerate-api.com/v4/latest","/USD" ,CurrencyExchangeRate.class);
		CurrencyExchangeRate model=rest.getForObject(url, CurrencyExchangeRate.class,uri);
		currencyExchangeRateService.loadDatabase(model);
	}
}
