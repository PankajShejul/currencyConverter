package com.innovect.currencyconverter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
public class Rate {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rate_id")
	private Integer id;
	@Column
	private String currencyName;
	@Column
	private Float currencyValue;
	
	@ManyToOne
	@JoinColumn(name="currency_id")
	public CurrencyExchangeRate currencyExchangeRate;

	public Rate() {
		super();
	}

	public Rate(Integer id, String currencyName, Float currencyValue, CurrencyExchangeRate currencyExchangeRate) {
		super();
		this.id = id;
		this.currencyName = currencyName;
		this.currencyValue = currencyValue;
		this.currencyExchangeRate = currencyExchangeRate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public Float getCurrencyValue() {
		return currencyValue;
	}

	public void setCurrencyValue(Float currencyValue) {
		this.currencyValue = currencyValue;
	}

	public CurrencyExchangeRate getCurrencyExchangeRate() {
		return currencyExchangeRate;
	}

	public void setCurrencyExchangeRate(CurrencyExchangeRate currencyExchangeRate) {
		this.currencyExchangeRate = currencyExchangeRate;
	}

	@Override
	public String toString() {
		return "Rate [id=" + id + ", currencyName=" + currencyName + ", currencyValue=" + currencyValue
				+ ", currencyExchangeRate=" + currencyExchangeRate + "]";
	}

}
