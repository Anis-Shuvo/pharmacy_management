package com.exam.spring.controllers;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
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

import com.exam.spring.models.Invoice;
import com.exam.spring.models.Rfinal;
import com.exam.spring.models.Medicine;
import com.exam.spring.models.Returnmedicine;
import com.exam.spring.models.Sell;
import com.exam.spring.repositories.InvoiceeRepository;
import com.exam.spring.repositories.MedicineRepository;
import com.exam.spring.repositories.ReturnmRepository;
import com.exam.spring.repositories.RfinalRepository;
import com.exam.spring.repositories.SellRepository;
import com.exam.spring.services.InvoiceService;
import com.exam.spring.services.MedicineService;
import com.exam.spring.services.ReturnService;
import com.exam.spring.services.RfinalService;
import com.exam.spring.services.SellService;

@Controller
public class ReturnMedicineController {
	@Autowired
	SellService ss;
	@Autowired
	InvoiceService is;
	@Autowired
	SellRepository sr;
	@Autowired
	MedicineRepository mr;
	@Autowired
	InvoiceeRepository ir2;
	@Autowired
	ReturnmRepository rr;
	@Autowired
	MedicineService ms;
	@Autowired
	ReturnService rs;
	@Autowired
	RfinalService rfs;
	@Autowired
	RfinalRepository rfr;
	
	@RequestMapping("/addritem")
	public String newReturn(@RequestParam int munit, int mprice, String  mname,int mid, @ModelAttribute Sell see, Model m) {
		see.setTotal(munit * mprice);
		ss.addSell(see);
		
		Medicine lr=ms.findMedicineById(mid);
	

			int mstok=lr.getMstock()+munit;
			lr.setMstock(mstok);
			ms.saveMedicine(lr);
			

			
		List<Invoice>invoice=is.findAllInvoice();
		List<Sell> list = ss.findAllSell();
		m.addAttribute("tot", sr.gettotal());
		m.addAttribute("ml", list);
	m.addAttribute("pd",invoice);
		//m.addAttribute("rom", ir2.getinvoice1()+1);
		
		return "Returnform";

	}


	@RequestMapping("/return")
	public String sellfinal(Model m,@RequestParam int subtotal,@RequestParam int discount, @RequestParam int paid) {

		List<Sell> list = ss.findAllSell();
	
	
		
		Returnmedicine rm=null;
		for (Sell sell : list) {
			
			rm=new Returnmedicine();
			
			rm.setDos(sell.getDos());
			rm.setSinvoice(sell.getInvoice());
			rm.setCname(sell.getCname());
			rm.setMobile(sell.getMobile());
			rm.setMid(sell.getMid());
			rm.setMname(sell.getMname());
			rm.setQuantity(sell.getMunit());
			rm.setPrice(sell.getMprice());
			rm.setTotal(sell.getTotal());
			rm.setMid(sell.getMid());
			rm.setSubtotal(subtotal);
			rm.setDiscount(discount);
			rm.setPaid(paid);
			rs.saveReturn(rm);
		}
		for (Sell sell : list) {
			ss.deleteSell(sell);
		}
		return "Returnform";

	}

	@RequestMapping("/rform")
	public String add() {
		
		
		
		return "Returnform";
	}

	@RequestMapping("/allreturn")
	private String allreturn(Model m) {
		List<Sell> list = ss.findAllSell();
		 
		m.addAttribute("ml", list);
		return "Returnform";
	}
	

	@GetMapping("/deleteReturn")
	private String deleteReturnById(@Param("sid") Integer sid, Model m) {
		
			Sell sell = ss.findSellById(sid);
			ss.deleteSell(sell);
			
		allreturn(m);
		return "Returnform";
	}

//	@RequestMapping("/seearch")
//	public String Findbyname(@RequestParam String vNo,Model m) {
//		m.addAttribute("vl",vr.getVehicleByVno(vNo));
//		
//	return "all_vehicles";
//		
//	}
//
//	@RequestMapping("/searchsell")
//	public String search(@RequestParam Date dos, Model m) {
//		List<Sell> lr = sr.search(dos);
//		m.addAttribute("se", lr);
//		return "Sellinfo";
//	}

	@RequestMapping("/searchbynamereturn")
	public String returnform(@RequestParam String mname, Model m) {

		LocalDate curentd = LocalDate.now();
		
        System.out.println(mname);
		Medicine lr = mr.search1(mname);
		System.out.println(lr);
		List<Sell> list = ss.findAllSell();
		m.addAttribute("ml", list);
		m.addAttribute("se", lr);
		m.addAttribute("cdate", curentd);
		
	      

		return "Returnform";
	}
	@RequestMapping("/searchbyinvoicereturn")
	public String returnform1(@RequestParam int invoice, Model m) {

		
		//m.addAttribute("rom3", rfr.getinvoice2());
       // System.out.println(invoice);
		
		Rfinal invsearch=rfr.search4(invoice);
		
		m.addAttribute("ins", invsearch);
		System.out.println(invsearch);
	

		return "Returnform";
	}

	@RequestMapping("/showRamount")
	public String calculate(@RequestParam int subtotal, int discount, int mvat, Model m) {
		int caldis = subtotal / 100 * discount;
		int lessdiscount = subtotal - caldis;
		
		m.addAttribute("dis", caldis);
		m.addAttribute("gtot", lessdiscount);
		List<Sell> list = ss.findAllSell();
		m.addAttribute("tot", sr.gettotal());
		m.addAttribute("ml", list);
		return "Returnform";

	}

	

}
