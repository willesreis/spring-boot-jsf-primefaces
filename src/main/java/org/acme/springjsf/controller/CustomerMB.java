package org.acme.springjsf.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.acme.springjsf.model.Customer;
import org.acme.springjsf.service.CustomerService;

@Named
@ViewScoped
public class CustomerMB {
	
	private List<Customer> customers;
	
	@Inject
	private CustomerService service;

	@PostConstruct
	private void init() {
		customers = service.createCustomer();
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

}
