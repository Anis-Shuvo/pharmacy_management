package com.exam.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.exam.spring.models.Customer;
import com.exam.spring.repositories.CustomerRepository;
@Service
public class CustomerService {
  @Autowired
  CustomerRepository cr;
 
	public void saveCustomer(Customer customer) {
		cr.save(customer);
	}
	public void updateCustomer(Customer customer) {
		cr.save(customer);
	}
	public void deleteCustomer(Customer customer) {
		cr.delete(customer);
	}
	public List<Customer> findAllCustomer(Customer customer) {
		return cr.findAll();
	}
	public Customer findCustomerById(int cid) {
		return cr.findById(cid).get();
	}
}
