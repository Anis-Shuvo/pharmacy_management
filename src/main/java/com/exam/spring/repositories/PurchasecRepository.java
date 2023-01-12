package com.exam.spring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.exam.spring.models.PurchaseContainer;
import com.exam.spring.models.Rfinal;

public interface PurchasecRepository extends JpaRepository<PurchaseContainer, Integer> {
	@Query(value="SELECT COUNT(*) FROM  pharmacy.PurchaseContainer",nativeQuery=true)
	public int gettotalsupplier( );
//	@Query(value= "SELECT *  FROM rfinal WHERE dos = DATE_ADD(CURDATE(), INTERVAL 0 DAY)",nativeQuery=true)
//	public List<Rfinal> todaysell();
	@Query(value="SELECT sum(subtotal)  FROM pharmacy.purchase_container;",nativeQuery=true)
	public int supsubtotal();
	@Query(value="SELECT sum(paid)  FROM pharmacy.purchase_container;",nativeQuery=true)
	public int suppaid();
}
