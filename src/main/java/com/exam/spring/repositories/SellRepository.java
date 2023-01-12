package com.exam.spring.repositories;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.exam.spring.models.Sell;
public interface SellRepository extends JpaRepository<Sell, Integer> {
	@Query("select s from Sell s where s.dos=?1")
	 public List<Sell> search(Date dos);
	@Query("select a from Sell a ")
	 public Sell alllisteditem();
	@Query("select sum(r.total) from Sell r")
	public int gettotal();
	
	public List<Sell> findByMid(Integer mid);

}
