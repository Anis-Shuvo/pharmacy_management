package com.exam.spring.controllers;

import java.io.IOException;
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
import com.exam.spring.models.Medicine;
import com.exam.spring.models.Purchase;
import com.exam.spring.models.PurchaseContainer;
import com.exam.spring.models.Purchasefinal;
import com.exam.spring.models.Returnmedicine;
import com.exam.spring.models.Rfinal;
import com.exam.spring.models.Sell;
import com.exam.spring.repositories.PurchaseRepository;
import com.exam.spring.services.MedicineService;
import com.exam.spring.services.PurchaseService;
import com.exam.spring.services.PurchasecService;
import com.exam.spring.services.PurchasefinalService;

@Controller
public class PurchaseController {
	@Autowired
    PurchaseService ps;
	@Autowired
	MedicineService ms;
	@Autowired
	PurchaseRepository pr;
	@Autowired
    PurchasecService pss;
	@Autowired
	PurchasefinalService pfs;
	
	
	@RequestMapping("/addpurchase")
	public String newPurchase(@RequestParam int munit, int sprice, int mid, @ModelAttribute Purchase pee, Model m) {
		pee.setTotal(munit * sprice);
		ps.addPurchase(pee);
		
		Medicine lr=ms.findMedicineById(mid);
	

			int mstok=lr.getMstock()+munit;
			lr.setMstock(mstok);
			ms.saveMedicine(lr);
			
			LocalDate curentd = LocalDate.now();
			 List<Purchase> list=ps.findAllPurchase();
			 System.out.println(list.toString());

//			
//		List<Invoice>invoice=is.findAllInvoice();
//		List<Sell> list = ss.findAllSell();
			m.addAttribute("cdate", curentd);
		m.addAttribute("tot", pr.gettotal1());
		m.addAttribute("ml", list);
//	m.addAttribute("pd",invoice);
		//m.addAttribute("rom", ir2.getinvoice1()+1);
		
		return "Purchaseform";

	}


	@RequestMapping("/purchase")
	public String sellfinal(Model m,@RequestParam int subtotal,@RequestParam int discount,int grandtotall, @RequestParam int paid,@ModelAttribute Purchasefinal pf) {
		Purchasefinal purchasefinal=pfs.addpurchasefinall(pf);
		List<Purchase> list = ps.findAllPurchase();
	
		 List<Purchase> purchas = ps.findPurchaseByMidWithOptional(list.get(0).getMid());
		 purchasefinal.setSupplier(purchas.get(0).getSupplier());
		 purchasefinal.setMname(purchas.get(0).getMname());
		 purchasefinal.setDop(purchas.get(0).getDop());
		 purchasefinal.setGrandtotall(grandtotall);
		 System.out.println( grandtotall);
		 purchasefinal.setInvoice(purchas.get(0).getInvoice());
		 pfs.addpurchasefinall(purchasefinal);
		 
		 
		 List<Purchase> pinv=ps.findAllPurchase();
			m.addAttribute("print1",pinv);
			m.addAttribute("pr2", subtotal);
		 
		 
		PurchaseContainer purc=null;
		for (Purchase purchase : list) {
			
			
			purc=new PurchaseContainer();
			
			purc.setDop(purchase.getDop());
			purc.setSupplier(purchase.getSupplier());
			purc.setInvoice(purchase.getInvoice());
			purc.setSupplier(purchase.getSupplier());
			purc.setMid(purchase.getMid());
			purc.setMname(purchase.getMname());
			purc.setMunit(purchase.getMunit());
			purc.setPrice(purchase.getSprice());
			purc.setTotal(purchase.getTotal());
			purc.setMid(purchase.getMid());
			purc.setGrandtotall(purchase.getGrandtotall());
			purc.setSubtotal(subtotal);
			purc.setDiscount(discount);
			purc.setPaid(paid);
			pss.addPurchase(purc);
		}
		for (Purchase purchase : list) {
			ps.deletePurchase(purchase);
		}
		return "Purchaseform";

	}

	@RequestMapping("/pform")
	public String add(Model m) {
		LocalDate curentd = LocalDate.now();
		m.addAttribute("cdate", curentd);
		
		return "Purchaseform";
	}
	
	@RequestMapping("/allpurchase")
	private String allpurchase(Model m) {
		List<Purchase> list = ps.findAllPurchase();
		m.addAttribute("ml", list);
		return "Purchaseform";
	}
	
	@RequestMapping("/allpurchasef")
	private String allpurchasef(Model m) {
		List<Purchasefinal> list = pfs.findAllPurchasefinal();
		m.addAttribute("ml", list);
		return "Purchaseaction";
	}

	@GetMapping("/deletepurchase")
	private String deletepurchaseById(@Param("pid") Integer pid, Model m) {
		
		Purchase purchase = ps.findPurchaseById(pid);
		ps.deletePurchase(purchase);
		
		allpurchase(m);
		return "Purchaseform";
	}
	
	@GetMapping("/deletepurchasef")
	private String deletepurchasefById(@Param("pfid") Integer pfid, Model m) {
		
		Purchasefinal purchasef = pfs.findPurchasefinalById(pfid);
		pfs.deletepurchasefinall(purchasef);
		
		allpurchasef(m);
		return "Purchaseaction";
	}

	


//	@RequestMapping("/searchbynamereturn")
//	public String returnform(@RequestParam String mname, Model m) {
//
//		LocalDate curentd = LocalDate.now();
//		
//        System.out.println(mname);
//		Medicine lr = mr.search1(mname);
//		System.out.println(lr);
//		List<Sell> list = ss.findAllSell();
//		m.addAttribute("ml", list);
//		m.addAttribute("se", lr);
//		m.addAttribute("cdate", curentd);
//		
//	      
//
//		return "Returnform";
//	}
//	@RequestMapping("/searchbyinvoicereturn")
//	public String returnform1(@RequestParam int invoice, Model m) {
//
//		
//		//m.addAttribute("rom3", rfr.getinvoice2());
//       // System.out.println(invoice);
//		
//		Rfinal invsearch=rfr.search4(invoice);
//		
//		m.addAttribute("ins", invsearch);
//		System.out.println(invsearch);
//	
//
//		return "Returnform";
//	}

	@RequestMapping("/showPamount")
	public String calculate(@RequestParam int subtotal, int discount,int mvat,  Model m) {
		int caldis = subtotal / 100 * discount;
		int lessdiscount = subtotal - caldis;
		int addvat = lessdiscount / 100 * mvat;
		int grandtot = lessdiscount + addvat;
		m.addAttribute("show", grandtot);
		m.addAttribute("dis", caldis);
		m.addAttribute("vat", addvat);
		List<Purchase> list = ps.findAllPurchase();
		m.addAttribute("tot", pr.gettotal1());
		m.addAttribute("ml", list);
		return "Purchaseform";

	}
}
