package org.acme.springjsf.repository;

import java.math.BigInteger;

import org.acme.springjsf.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, BigInteger> {

}
