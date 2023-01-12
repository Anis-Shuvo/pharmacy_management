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

import com.exam.spring.models.Rfinal;
import com.exam.spring.models.Sell;
import com.exam.spring.models.User;
import com.exam.spring.repositories.CustomerRepository;
import com.exam.spring.repositories.MedicineRepository;
import com.exam.spring.repositories.PurchasecRepository;
import com.exam.spring.repositories.PurchasefinalRepository;
import com.exam.spring.repositories.RfinalRepository;
import com.exam.spring.repositories.UserRepository;
import com.exam.spring.services.UserService;

@Controller
public class UserController {
	@Autowired
	UserService us;
	@Autowired
	UserRepository ur;
	@Autowired
	MedicineRepository mr;
	@Autowired
	RfinalRepository rr;
	@Autowired
	CustomerRepository cr;
	@Autowired
	PurchasefinalRepository pfr;
    @Autowired
    PurchasecRepository pcr;
//	@PostMapping("/newUserregi")
	@RequestMapping("/newUserregi")
	public void newUser(HttpServletResponse response, User user, Model m) throws IOException {
		us.saveUser(user);
		List<User> list = us.findAllUser(null);
		m.addAttribute("ml", list);
		response.sendRedirect("uform");

	}

	@RequestMapping("/uform")
	public String add() {
		return "Userregi";
	}
	
	@RequestMapping("/Dash")
	public String dash(Model m) {
		mr.expdate();
		m.addAttribute("exp",mr.expdate());
		mr.stockout();
		rr.lastdaystotal();
		rr.todaystotal();
		m.addAttribute("ldt",rr.lastdaystotal());
		m.addAttribute("stock",mr.stockout());
		m.addAttribute("tdt",rr.todaystotal());
		mr.gettotalmedicine( );
		cr.gettotalcustomer();
		pfr.gettotalsupplier();
		m.addAttribute("tnm",mr.gettotalmedicine( ));
		LocalDate curentd = LocalDate.now();
		m.addAttribute("date", curentd);
		m.addAttribute("ctotal", cr.gettotalcustomer());
		m.addAttribute("stotal", pfr.gettotalsupplier());
		Integer rrr= pcr.supsubtotal();
		Integer ppp= pcr.suppaid();
		Integer fff=rrr-ppp;
		m.addAttribute("supdue", fff);
		
		return "Dashboardadmin";
		
	}


	@RequestMapping("/allUser")
	private String allUser(Model m) {
		List<User> list = us.findAllUser(null);
		m.addAttribute("ml", list);
		return "Useraction";
	}

	@GetMapping("/updateuser")
	private String findUserById(@Param("uid") int uid, Model m) {
		User user = us.findUserById(uid);
		m.addAttribute("ml", user);
		return "Updateuser";
	}

	@GetMapping("/deleteUser")
	private String deleteUserById(@Param("uid") Integer uid, Model m) {
		User user = us.findUserById(uid);
		us.deleteUser(user);
		allUser(m);
		return "Useraction";
	}

//	@RequestMapping("/seearch")
//	public String Findbyname(@RequestParam String vNo,Model m) {
//		m.addAttribute("vl",vr.getVehicleByVno(vNo));
//		
//	return "all_vehicles";
//		
//	}

	@RequestMapping("/searchreturn2")
	public String search2(@RequestParam String userName, Model m) {
		List<User> lr = ur.search(userName);
		m.addAttribute("se", lr);
		return "Updateuser";
	}
	@RequestMapping("/userLogin")
	public String findByemail(@RequestParam String uEmail,String uPass ,Model m) {
		List<User> li =us.searchByEmailPass(uEmail, uPass);
		String ret="";
		if(li.isEmpty()) {
			ret="login";
		}else {
			
		
			ret="Dashboardadmin";
		}
		
		long d=System.currentTimeMillis();
			Date d1=new Date(d);
			m.addAttribute("cd", d1);
		  
			return ret;
	}
	@RequestMapping("/")
	public String login() {
		
		return "login";
	}
	
	@RequestMapping("/report1")
	public String report1(Model m) {
		List<Rfinal> lst=rr.todaysell();
		
	
		m.addAttribute("ts",lst);
		
		
		
		return "Report1";
				}
	
	@RequestMapping("/report2")
	public String report2(Model m) {
		List<Rfinal>lst=rr.last7days();
	
		m.addAttribute("ts1",lst);
		
		
		
		return "Report2";
				}

}
