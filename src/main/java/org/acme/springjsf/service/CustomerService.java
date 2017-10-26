package org.acme.springjsf.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import org.acme.springjsf.model.Customer;

@Named
public class CustomerService {

	private List<Customer> customers;

	public List<Customer> createCustomer() {
		customers = new ArrayList<Customer>();
		
		Customer c1 = new Customer("John", "Doe", 123456);
		customers.add(c1);
		Customer c2 = new Customer("Jane", "Doe", 234567);
		customers.add(c2);
		Customer c3 = new Customer("Adam", "Scotch", 345678);
		customers.add(c3);
		
		return customers;
	}
}
