package org.acme.springjsf.model;

import javax.inject.Named;

@Named
public class Customer {

	private String firstName;
	private String lastName;
	private Integer customerId;
	
	public Customer() {
		super();
	}

	public Customer(String firstName, String lastName, Integer customerId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

}
