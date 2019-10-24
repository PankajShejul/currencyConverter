package com.innovect.currencyconverter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innovect.currencyconverter.model.CurrencyExchangeRate;
import com.innovect.currencyconverter.model.CurrencyExchangeRateRepository;

@Service
public class CurrencyExchangeRateService {
	@Autowired
	private CurrencyExchangeRateRepository repo; 

	public void loadDatabase(CurrencyExchangeRate currencyExchangeRate) {
		repo.save(currencyExchangeRate);
	}
}
