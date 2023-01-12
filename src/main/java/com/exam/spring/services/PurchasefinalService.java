package com.exam.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.spring.models.Purchasefinal;
import com.exam.spring.models.Rfinal;
import com.exam.spring.repositories.PurchasefinalRepository;
import com.exam.spring.repositories.RfinalRepository;

@Service
public class PurchasefinalService {
	@Autowired
	PurchasefinalRepository pfr;
	public  Purchasefinal addpurchasefinall( Purchasefinal pf) {
		return	pfr.save(pf);
	}
	public void updatepurchasefinall( Purchasefinal pf) {
		pfr.save(pf);
	}
	public void deletepurchasefinall( Purchasefinal pf) {
		pfr.delete(pf);
	}
	public List<Purchasefinal> findAllPurchasefinal() {
		return pfr.findAll();
	}
	public  Purchasefinal  findPurchasefinalById(int pfid) {
		return pfr.findById(pfid).get();
	}

}
