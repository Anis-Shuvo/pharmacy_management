package com.exam.spring.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Purchasefinal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int pfid;
	String supplier;
	String mname;
	
	Date dop; 
	int grandtotall;
	int invoice;
	public Purchasefinal() {
		super();
	}
	public Purchasefinal(int pfid) {
		super();
		this.pfid = pfid;
	}
	public Purchasefinal(String supplier, String mname, Date dop, int grandtotall, int invoice) {
		super();
		this.supplier = supplier;
		this.mname = mname;
		this.dop = dop;
		this.grandtotall = grandtotall;
		this.invoice = invoice;
	}
	public Purchasefinal(int pfid, String supplier, String mname, Date dop, int grandtotall, int invoice) {
		super();
		this.pfid = pfid;
		this.supplier = supplier;
		this.mname = mname;
		this.dop = dop;
		this.grandtotall = grandtotall;
		this.invoice = invoice;
	}
	public int getPfid() {
		return pfid;
	}
	public void setPfid(int pfid) {
		this.pfid = pfid;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public Date getDop() {
		return dop;
	}
	public void setDop(Date dop) {
		this.dop = dop;
	}
	public int getGrandtotall() {
		return grandtotall;
	}
	public void setGrandtotall(int grandtotall) {
		this.grandtotall = grandtotall;
	}
	public int getInvoice() {
		return invoice;
	}
	public void setInvoice(int invoice) {
		this.invoice = invoice;
	}
	@Override
	public String toString() {
		return "Purchasefinal [pfid=" + pfid + ", supplier=" + supplier + ", mname=" + mname + ", dop=" + dop
				+ ", grandtotall=" + grandtotall + ", invoice=" + invoice + "]";
	}
	
}
