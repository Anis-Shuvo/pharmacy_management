package com.exam.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.exam.spring.models.Purchase;
import com.exam.spring.models.Sell;
import com.exam.spring.repositories.PurchaseRepository;

@Service
public class PurchaseService {
	@Autowired
    PurchaseRepository pr;
	public void addPurchase(Purchase pm) {
		pr.save(pm);	
	}
	public void updatePurchase(Purchase pm) {
		pr.save(pm);	
	}
	public void deletePurchase(Purchase pm) {
		pr.delete(pm);
	}
	public List<Purchase> findAllPurchase() {
		return pr.findAll();
	}
	public Purchase findPurchaseById(int pid) {
		return pr.findById(pid).get();
	}
	public List<Purchase> findPurchaseByMidWithOptional(int pid) {
		return pr.findByMid(pid);
	}
}
