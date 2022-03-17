package com.homeloan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="property_income")
public class PropertyIncome {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="property_income_id")
	private int id;
	
	@Column(name="property_location")
	private String propertyLocation;
	
	@Column(name="property_name")
	private String propertyName;
	
	@Column(name="estimated_amount")
	private int estimatedAmount;
	
	@Column(name="type_of_employement")
	private String employementType;
	
	@Column(name="organization_type")
	private String orgType;
	
	@Column(name="employer_name")
	private String employerName;
	
	private int income;
	
	@Column(name="age_of_retirement")
	private int retirementAge;
	
	
	@OneToOne(mappedBy = "propertyincome")
	private Loan loan;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPropertyLocation() {
		return propertyLocation;
	}


	public void setPropertyLocation(String propertyLocation) {
		this.propertyLocation = propertyLocation;
	}


	public String getPropertyName() {
		return propertyName;
	}


	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}


	public int getEstimatedAmount() {
		return estimatedAmount;
	}


	public void setEstimatedAmount(int estimatedAmount) {
		this.estimatedAmount = estimatedAmount;
	}


	public String getEmployementType() {
		return employementType;
	}


	public void setEmployementType(String employementType) {
		this.employementType = employementType;
	}


	public String getOrgType() {
		return orgType;
	}


	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}


	public String getEmployerName() {
		return employerName;
	}


	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}


	public int getIncome() {
		return income;
	}


	public void setIncome(int income) {
		this.income = income;
	}


	public int getRetirementAge() {
		return retirementAge;
	}


	public void setRetirementAge(int retirementAge) {
		this.retirementAge = retirementAge;
	}


	public Loan getLoan() {
		return loan;
	}


	public void setLoan(Loan loan) {
		this.loan = loan;
	}
	
	
	
	
}
