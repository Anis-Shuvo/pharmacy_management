package com.exam.spring.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.exam.spring.models.Customer;
import com.exam.spring.repositories.CustomerRepository;
import com.exam.spring.services.CustomerService;

@Controller
public class CustomerController {
	@Autowired
    CustomerService cs;
	@Autowired
	CustomerRepository cr;
	
//	@PostMapping("/newCustomer")
	@RequestMapping("/addcustomer")
	public void newCustomer(HttpServletResponse response, Customer cus, Model m) throws IOException {
		cs.saveCustomer(cus);
		List<Customer> list = cs.findAllCustomer(null);
		m.addAttribute("ml",list);
		response.sendRedirect("custform");
		
	}
	
	@RequestMapping("/custform")
	public String add() {
		return "Customerform";
	}
	
	@RequestMapping("/newCustomer")
	public String open() {
		return "Customerform";
	}
	
	
	@RequestMapping("/allcustomer")
	private String allCustomer(Model m) {
		List<Customer> list = cs.findAllCustomer(null);
		m.addAttribute("ml",list);
		return "Customeraction";
	}
	
	@GetMapping("/updatecustomer")
	private String findCustomerById(@Param("cid") int  cid, Model m) {
		Customer customer = cs.findCustomerById(cid);
		m.addAttribute("ml", customer);
		return "Updatecustomer";
	}
	@GetMapping("/deleteCustomer")
	private String deleteCustomerById(@Param("cid") Integer cid,Model m) {
		Customer customer = cs.findCustomerById(cid);
		cs.deleteCustomer(customer);
		allCustomer(m);
		return "Customeraction";
	}
	
//	@RequestMapping("/seearch")
//	public String Findbyname(@RequestParam String vNo,Model m) {
//		m.addAttribute("vl",vr.getVehicleByVno(vNo));
//		
//	return "all_vehicles";
//		
//	}
	
	@RequestMapping("/search")
	public  String search(@RequestParam String cname, Model m) {
		List<Customer> lr = cr.search(cname);
		m.addAttribute("se",lr);
		return "Updatecustomer";
	}
	

}
