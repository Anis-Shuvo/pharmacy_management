package com.exam.spring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.exam.spring.models.Purchase;
import com.exam.spring.models.Rfinal;
import com.exam.spring.models.Sell;
import com.exam.spring.models.User;

public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {
	@Query("select p from Purchase p where p.dop=?1")
	 public List<Purchase> search(String dop);
	@Query("select sum(r.total) from Purchase r")
	public int gettotal1();
	public List<Purchase> findByMid(Integer mid);
	
}
