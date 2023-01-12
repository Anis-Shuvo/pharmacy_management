package com.exam.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.spring.models.Medicine;

import com.exam.spring.repositories.MedicineRepository;


@Service
public class MedicineService {
	@Autowired
 MedicineRepository mr;
	
	public void saveMedicine(Medicine me) {
		mr.save(me);
	}
	public void updateMedicine(Medicine me) {
		mr.save(me);
	}
	public void deleteMedicine(Medicine me) {
		mr.delete(me);
	}
	public List<Medicine> findAllMedicine(Medicine me) {
		return mr.findAll();
	}
	public Medicine findMedicineById(int mid) {
		return mr.findById(mid).get();
	}
	
}
