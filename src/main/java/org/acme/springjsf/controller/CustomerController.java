package org.acme.springjsf.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.acme.springjsf.model.Customer;

@ManagedBean
@ViewScoped
public class CustomerController {
	
	private List<Customer> customers;

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	@PostConstruct
	public void setup() {
		customers = new ArrayList<Customer>();
		
		Customer c1 = new Customer("John", "Doe", 123456);
		customers.add(c1);
		Customer c2 = new Customer("Jane", "Doe", 234567);
		customers.add(c2);
		Customer c3 = new Customer("Adam", "Scotch", 345678);
		customers.add(c3);
		
	}
}
