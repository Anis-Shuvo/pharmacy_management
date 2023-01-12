package com.exam.spring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.exam.spring.models.Customer;

public interface CustomerRepository  extends JpaRepository<Customer, Integer> {
	@Query("select c from Customer c where c.cname=?1")
	 public List<Customer> search(String cname);
	@Query(value="SELECT COUNT(*) FROM  pharmacy.customer",nativeQuery=true)
	public int gettotalcustomer();
}
