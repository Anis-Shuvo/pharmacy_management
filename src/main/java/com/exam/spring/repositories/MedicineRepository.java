package com.exam.spring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.exam.spring.models.Medicine;

public interface MedicineRepository extends JpaRepository<Medicine, Integer> {
	
@Query("select m from Medicine m where m.mname=?1")
 public List<Medicine> search(String mname);
@Query("select m from Medicine m where m.mname=?1")
public Medicine search1(String mname);
@Query(value="SELECT COUNT(*) FROM  pharmacy.medicine where mstock=0",nativeQuery=true)
public int stockout( );
@Query(value="SELECT COUNT(*) FROM  pharmacy.medicine",nativeQuery=true)
public int gettotalmedicine();
@Query(value="SELECT COUNT(*)  FROM pharmacy.medicine WHERE doe < DATE_ADD(CURDATE(), INTERVAL 1 DAY)",nativeQuery=true)
public int expdate( );
	
}
