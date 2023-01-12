package com.exam.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.spring.models.Purchase;
import com.exam.spring.models.PurchaseContainer;
import com.exam.spring.repositories.PurchaseRepository;
import com.exam.spring.repositories.PurchasecRepository;

@Service
public class PurchasecService {
	@Autowired
    PurchasecRepository pcr;
	public void addPurchase(PurchaseContainer pcm) {
		pcr.save(pcm);	
	}
	public void updatePurchase(PurchaseContainer pcm) {
		pcr.save(pcm);	
	}
	public void deletePurchase(PurchaseContainer pcm) {
		pcr.delete(pcm);
	}
	public List<PurchaseContainer> findAllPurchase() {
		return pcr.findAll();
	}
	public PurchaseContainer  findPurchaseById(int pcid) {
		return pcr.findById(pcid).get();
	}
}
