package com.exam.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.spring.models.Rfinal;

import com.exam.spring.repositories.RfinalRepository;


@Service
public class RfinalService {
	@Autowired
	RfinalRepository rfr;
	public Rfinal addrffinal(Rfinal rf) {
		return	rfr.save(rf);
	}
	public void updaterffinal(Rfinal rf) {
		rfr.save(rf);
	}
	public void deleterffinal(Rfinal rf) {
		rfr.delete(rf);
	}
	public List<Rfinal> findAllRfinal() {
		return rfr.findAll();
	}
	public Rfinal findRfinalById(int rfid) {
		return rfr.findById(rfid).get();
	}
}
