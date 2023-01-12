package com.exam.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.exam.spring.models.Sell;
import com.exam.spring.repositories.SellRepository;

@Service
public class SellService {
	@Autowired
	SellRepository sr;
	public void addSell(Sell se) {
		sr.save(se);
	}
	public void updateSell(Sell se) {
		sr.save(se);
	}
	public void deleteSell(Sell se) {
		sr.delete(se);
	}
	public List<Sell> findAllSell() {
		return sr.findAll();
	}
	public Sell findSellById(int sid) {
		return sr.findById(sid).get();
	}
	
	public List<Sell> findSellByMidWithOptional(int sid) {
		return sr.findByMid(sid);
	}

}
