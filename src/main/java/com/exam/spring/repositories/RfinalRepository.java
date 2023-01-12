package com.exam.spring.repositories;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.exam.spring.models.Rfinal;



public interface RfinalRepository extends JpaRepository<Rfinal, Integer> {
	@Query("select r from Rfinal r where r.invoice=?1")
	public Rfinal search4(int invoice);
	@Query(value="SELECT invoice FROM pharmacy.Rfinal order by invoice desc limit 1",nativeQuery=true)
	public int getinvoice2();
	@Query(value= "SELECT *  FROM rfinal WHERE dos = DATE_ADD(CURDATE(), INTERVAL 0 DAY)",nativeQuery=true)
	public List<Rfinal> todaysell();
	@Query(value="SELECT * FROM pharmacy.rfinal where dos between ('2022-11-21') and ('2022-12-01')",nativeQuery = true)
    public List<Rfinal> todaysell1();
	@Query(value="SELECT *  FROM rfinal WHERE dos = DATE_ADD(CURDATE(), INTERVAL -1 DAY);",nativeQuery=true)
	public List<Rfinal> yesterdaysell();
	@Query(value="SELECT *  FROM rfinal WHERE dos between DATE_ADD(CURDATE(), INTERVAL -7 DAY) and DATE_ADD(CURDATE(), INTERVAL 0 DAY);",nativeQuery=true)
	public List<Rfinal> last7days();
	@Query(value="SELECT sum(grandtotall)  FROM pharmacy.rfinal WHERE dos = DATE_ADD(CURDATE(), INTERVAL -1 DAY);",nativeQuery=true)
	public int lastdaystotal();
	@Query(value="SELECT sum(grandtotall)  FROM pharmacy.rfinal WHERE dos = CURDATE();",nativeQuery=true)
	public int todaystotal();
}
