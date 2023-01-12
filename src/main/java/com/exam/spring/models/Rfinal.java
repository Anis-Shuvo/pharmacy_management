package com.exam.spring.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Rfinal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int rfid;
	String cname;
	int mobile;
	Date dos; 
	int grandtotall;
	int invoice;
	public Rfinal() {
		super();
	}
	public Rfinal(int rfid) {
		super();
		this.rfid = rfid;
	}
	public Rfinal(String cname, int mobile, Date dos, int grandtotall, int invoice) {
		super();
		this.cname = cname;
		this.mobile = mobile;
		this.dos = dos;
		this.grandtotall = grandtotall;
		this.invoice = invoice;
	}
	public Rfinal(int rfid, String cname, int mobile, Date dos, int grandtotall, int invoice) {
		super();
		this.rfid = rfid;
		this.cname = cname;
		this.mobile = mobile;
		this.dos = dos;
		this.grandtotall = grandtotall;
		this.invoice = invoice;
	}
	public int getRfid() {
		return rfid;
	}
	public void setRfid(int rfid) {
		this.rfid = rfid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public Date getDos() {
		return dos;
	}
	public void setDos(Date dos) {
		this.dos = dos;
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
		return "Rfinal [rfid=" + rfid + ", cname=" + cname + ", mobile=" + mobile + ", dos=" + dos + ", grandtotall="
				+ grandtotall + ", invoice=" + invoice + "]";
	}
	
	
}
