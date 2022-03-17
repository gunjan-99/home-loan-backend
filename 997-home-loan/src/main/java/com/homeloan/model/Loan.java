package com.homeloan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="loan")
public class Loan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="loan_application_id")
	private int id;

	@Column(name="max_loan_grantable")
	private int maxGrant;

	@Column(name="intrest_rate")
	private double intrestRate;
	
	private int tennure;

	@Column(name="loan_amount")
	private  int loan_amount;

	@OneToOne
	@JoinColumn(name="property_income_id")
	private PropertyIncome propertyincome;

	@OneToOne
	@JoinColumn(name="document_id")
	private Document document;

	@OneToOne
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	@OneToOne(mappedBy = "loan")
	private Tracker tracker;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMaxGrant() {
		return maxGrant;
	}

	public void setMaxGrant(int maxGrant) {
		this.maxGrant = maxGrant;
	}

	public double getIntrestRate() {
		return intrestRate;
	}

	public void setIntrestRate(double intrestRate) {
		this.intrestRate = intrestRate;
	}

	public int getTennure() {
		return tennure;
	}

	public void setTennure(int tennure) {
		this.tennure = tennure;
	}

	public int getLoan_amount() {
		return loan_amount;
	}

	public void setLoan_amount(int loan_amount) {
		this.loan_amount = loan_amount;
	}

	public PropertyIncome getPropertyincome() {
		return propertyincome;
	}

	public void setPropertyincome(PropertyIncome propertyincome) {
		this.propertyincome = propertyincome;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Tracker getTracker() {
		return tracker;
	}

	public void setTracker(Tracker tracker) {
		this.tracker = tracker;
	}

	
	
}
