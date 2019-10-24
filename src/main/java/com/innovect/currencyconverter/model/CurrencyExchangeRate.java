package com.innovect.currencyconverter.model;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
public class CurrencyExchangeRate {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="currency_id")
	private Integer id;
	
	private String base;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	
	//@Temporal(TemporalType.TIMESTAMP)
	private Timestamp time_last_updated;
	
//	@OneToMany(mappedBy="currencyExchangeRate",cascade=CascadeType.ALL)
//	public List<Rate> rate;

	public CurrencyExchangeRate() {
		super();
	}

//	public CurrencyExchangeRate(String base, Date date, Date time_last_updated, List<Rate> rates) {
//		super();
//		this.base = base;
//		this.date = date;
//		this.time_last_updated = time_last_updated;
////		this.rate = rates;
//	}

	public Integer getId() {
		return id;
	}

	public String getBase() {
		return base;
	}

	public Date getDate() {
		return date;
	}

	public Date getTimestamp() {
		return time_last_updated;
	}

//	public List<Rate> getRates() {
//		return rate;
//	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setTimestamp(Timestamp time_last_updated) {
		this.time_last_updated = time_last_updated;
	}

//	public void setRates(List<Rate> rates) {
//		this.rate = rates;
//	}

//	@Override
//	public String toString() {
//		return "CurrencyExchangeRate [id=" + id + ", base=" + base + ", date=" + date + ", timestamp=" + timestamp
//				+ ", rates=" + rate +"]";
//	}
//	
	
	
}
