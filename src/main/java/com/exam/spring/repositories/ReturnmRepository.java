package com.exam.spring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.exam.spring.models.Returnmedicine;
public interface ReturnmRepository extends JpaRepository<Returnmedicine, Integer> {
//	@Query("select r from Returnmedicine r where r.invoice=?1")
//	 public List<Returnmedicine> search(int invoice);
	
//	@Query(value="SELECT rinvoice FROM pharmacy.returnmedicine order by rinvoice desc limit 1",nativeQuery=true)
//	public int getinvoice2();

}
