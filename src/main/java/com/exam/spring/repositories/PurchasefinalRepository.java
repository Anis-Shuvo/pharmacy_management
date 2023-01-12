package com.exam.spring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.exam.spring.models.Purchasefinal;
import com.exam.spring.models.Rfinal;

public interface PurchasefinalRepository extends JpaRepository<Purchasefinal, Integer> {
	@Query(value="SELECT *  FROM purchasefinal WHERE dop between DATE_ADD(CURDATE(), INTERVAL -30 DAY) and DATE_ADD(CURDATE(), INTERVAL 0 DAY);",nativeQuery=true)
	public List<Purchasefinal> last30days();
	@Query(value="SELECT COUNT(*) FROM  pharmacy.purchasefinal",nativeQuery=true)
	public int gettotalsupplier();

}
