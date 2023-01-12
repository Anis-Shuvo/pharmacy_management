package com.exam.spring.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.exam.spring.models.Medicine;
import com.exam.spring.repositories.MedicineRepository;
import com.exam.spring.services.MedicineService;
@Controller
public class MedicineController {
	@Autowired
    MedicineService ms;
	@Autowired
	MedicineRepository mr;
	
//	@PostMapping("/newMedicine")
	@RequestMapping("/newMedicine")
	public String newMedicine(Medicine me, Model m) {
		ms.saveMedicine(me);
		List<Medicine> list = ms.findAllMedicine(me);
		m.addAttribute("ml",list);
		return "medicineform";
		
	}
	
	@RequestMapping("/mediform")
	public String add() {
		return "medicineform";
	}
	
	@RequestMapping("/allMedicine")
	private String allMedicine(Model m) {
		List<Medicine> list =ms.findAllMedicine(null);
		m.addAttribute("ml",list);
		return "Medicineaction";
	}
	
	@GetMapping("/medicine")
	private String findMedicineById(@Param("mid") int  mid, Model m) {
		Medicine medicine = ms.findMedicineById(mid);
		ms.saveMedicine(medicine);
		m.addAttribute("ml", medicine);
		return "Updatemedicine";
	}
	@GetMapping("/deleteMedicine")
	private String deleteMedicineById(@Param("mid") Integer mid,Model m) {
		Medicine medicine = ms.findMedicineById(mid);
		ms.deleteMedicine( medicine);
		allMedicine(m);
		return "Medicineaction";
	}
	
//	@RequestMapping("/seearch")
//	public String Findbyname(@RequestParam String vNo,Model m) {
//		m.addAttribute("vl",vr.getVehicleByVno(vNo));
//		
//	return "all_vehicles";
//		
//	}
	
	@RequestMapping("/searchmedicine")
	public  String serach(@RequestParam String mname, Model m) {
		List<Medicine> lr = mr.search(mname);
		m.addAttribute("se",lr);
		return "";
	}
	
	
	
	
}
