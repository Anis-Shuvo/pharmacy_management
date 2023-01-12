package com.exam.spring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.exam.spring.models.Invoice;
import com.exam.spring.models.Medicine;

public interface InvoiceeRepository extends JpaRepository<Invoice, Integer> {
	@Query(value="SELECT invoice FROM pharmacy.invoice order by invoice desc limit 1",nativeQuery=true)
	public int getinvoice1();
	
//	@Query("select i from Invoice i where i.invoice=?1")
//	 public List<Invoice> search3(int invoice);
//	@Query("select i from Invoice i where i.invoice=?1")
//	public Invoice search3(int invoice);

}
