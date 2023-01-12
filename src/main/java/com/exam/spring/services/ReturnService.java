package com.exam.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.spring.models.Returnmedicine;
import com.exam.spring.repositories.ReturnmRepository;
@Service
public class ReturnService {
	@Autowired
	ReturnmRepository rr;
	public void saveReturn(Returnmedicine rm) {
		rr.save(rm);
	}
	public void updateReturn(Returnmedicine rm) {
		rr.save(rm);
	}
	public void deleteReturn(Returnmedicine rm) {
		rr.delete(rm);
	}
	public List<Returnmedicine> findAllReturn(Returnmedicine rm) {
		return rr.findAll();
	}
	public Returnmedicine findReturnmedicineById(int rid) {
		return rr.findById(rid).get();
	}


}
