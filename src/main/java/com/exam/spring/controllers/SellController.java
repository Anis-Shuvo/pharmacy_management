package com.exam.spring.controllers;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.exam.spring.models.Invoice;
import com.exam.spring.models.Medicine;
import com.exam.spring.models.Rfinal;
import com.exam.spring.models.Sell;
import com.exam.spring.repositories.InvoiceeRepository;
import com.exam.spring.repositories.MedicineRepository;
import com.exam.spring.repositories.RfinalRepository;
import com.exam.spring.repositories.SellRepository;
import com.exam.spring.services.InvoiceService;
import com.exam.spring.services.MedicineService;
import com.exam.spring.services.RfinalService;
import com.exam.spring.services.SellService;

@Controller
public class SellController {
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
	MedicineService ms;
	@Autowired
	RfinalService rfs;
	@Autowired
	RfinalRepository rfr;

//	@PostMapping("/newSell")
	@RequestMapping("/additem")
	public String newSell(@RequestParam int munit, int mprice, String  mname,int mid, @ModelAttribute Sell see, Model m) {
		see.setTotal(munit * mprice);
		ss.addSell(see);
		
		Medicine lr=ms.findMedicineById(mid);
	

			int mstok=lr.getMstock()-munit;
			lr.setMstock(mstok);
			ms.saveMedicine(lr);
	

		
		List<Sell> list = ss.findAllSell();
		m.addAttribute("tot", sr.gettotal());
		m.addAttribute("ml", list);
		//m.addAttribute("rom", ir2.getinvoice1()+1);
		
		return "Sellform";

	}


	@RequestMapping("/sell")
	public String sellfinal(Model m,@RequestParam int subtotal,@RequestParam int discount, @RequestParam int paid,@ModelAttribute Rfinal rf) {
		Rfinal rfinal = rfs.addrffinal(rf);
		List<Sell> list = ss.findAllSell();
		
	   List<Sell> sells = ss.findSellByMidWithOptional(list.get(0).getMid());
		System.out.println("fdsflsjfsdlfsf"+sells);
		rfinal.setCname(sells.get(0).getCname());
		rfinal.setMobile(sells.get(0).getMobile());
		rfinal.setInvoice(sells.get(0).getInvoice());
		rfinal.setDos(sells.get(0).getDos());
		rfs.addrffinal(rfinal);
//		
		List<Sell> inv=ss.findAllSell();
		m.addAttribute("print",inv);
		m.addAttribute("pr", subtotal);
		System.out.println(inv);
	
		Invoice invoice=null; 
		for (Sell sell : list) {
			invoice = new Invoice();
			invoice.setDos(sell.getDos());
			invoice.setInvoice(sell.getInvoice());
			invoice.setCname(sell.getCname());
			invoice.setMobile(sell.getMobile());
			invoice.setMid(sell.getMid());
			invoice.setMname(sell.getMname());
			invoice.setQuantity(sell.getMunit());
			invoice.setPrice(sell.getMprice());
			invoice.setTotal(sell.getTotal());
			invoice.setSubtotal(subtotal);
			invoice.setDiscount(discount);
			invoice.setPaid(paid);
			is.addInvoice(invoice);
		}
		for (Sell sell : list) {
			ss.deleteSell(sell);
		}
		
		
		
		return "Invoice";

	}

	@RequestMapping("/sform")
	public String add() {
		
		
		
		return "Sellform";
	}

	@RequestMapping("/allsales")
	private String allSale(Model m) {
		List<Sell> list = ss.findAllSell();
		m.addAttribute("ml", list);
		return "Selldetails";
	}

	@GetMapping("/updatesale")
	private String findSaleById(@Param("sid") int sid, Model m) {
		Sell sell = ss.findSellById(sid);
		m.addAttribute("ml", sell);
		return "UpdateSell";
	}

	@GetMapping("/deleteSale")
	private String deleteSaleById(@Param("sid") Integer sid, Model m) {
		Sell sell = ss.findSellById(sid);
		ss.deleteSell(sell);
		allSale(m);
		return "Sellform";
	}

//	@RequestMapping("/seearch")
//	public String Findbyname(@RequestParam String vNo,Model m) {
//		m.addAttribute("vl",vr.getVehicleByVno(vNo));
//		
//	return "all_vehicles";
//		
//	}

	@RequestMapping("/searchsell")
	public String search(@RequestParam Date dos, Model m) {
		List<Sell> lr = sr.search(dos);
		m.addAttribute("se", lr);
		return "Sellinfo";
	}

	@RequestMapping("/searchbyname")
	public String sellform(@RequestParam String mname, Model m) {

		LocalDate curentd = LocalDate.now();
		m.addAttribute("rom", ir2.getinvoice1()+1);
		m.addAttribute("rom1", ir2.getinvoice1());
        System.out.println(mname);
		Medicine lr = mr.search1(mname);
		System.out.println(lr);
		List<Sell> list = ss.findAllSell();
		m.addAttribute("ml", list);
		m.addAttribute("se", lr);
		m.addAttribute("cdate", curentd);

		return "Sellform";
	}

	@RequestMapping("/showamount")
	public String calculate(@RequestParam int subtotal, int discount, int mvat, Model m) {
		int caldis = subtotal / 100 * discount;
		int lessdiscount = subtotal - caldis;
		int addvat = lessdiscount / 100 * mvat;
		int grandtot = lessdiscount + addvat;
		m.addAttribute("show", grandtot);
		m.addAttribute("dis", caldis);
		m.addAttribute("vat", addvat);
		List<Sell> list = ss.findAllSell();
		m.addAttribute("tot", sr.gettotal());
		m.addAttribute("ml", list);
		return "Sellform";

	}

	

}
