package com.exam.spring.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Sell {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
int sid;
String cname;
int mobile;
String mname ;
String ptype;
Date dos; 
Date expired;
int munit;
int mprice;
int total;
int subtotal;
int mvat ;
int discount;
int grandtotall;
int paid;
int invoice;
int mid;
public Sell() {
	super();
}
public Sell(int sid) {
	super();
	this.sid = sid;
}
public Sell(String cname, int mobile, String mname, String ptype, Date dos, Date expired, int munit, int mprice,
		int total, int subtotal, int mvat, int discount, int grandtotall, int paid, int invoice,int mid) {
	super();
	this.cname = cname;
	this.mobile = mobile;
	this.mname = mname;
	this.ptype = ptype;
	this.dos = dos;
	this.expired = expired;
	this.munit = munit;
	this.mprice = mprice;
	this.total = total;
	this.subtotal = subtotal;
	this.mvat = mvat;
	this.discount = discount;
	this.grandtotall = grandtotall;
	this.paid = paid;
	this.invoice = invoice;
	this.mid=mid;
}
public Sell(int sid, String cname, int mobile, String mname, String ptype, Date dos, Date expired, int munit,
		int mprice, int total, int subtotal, int mvat, int discount, int grandtotall, int paid, int invoice,int mid) {
	super();
	this.sid = sid;
	this.cname = cname;
	this.mobile = mobile;
	this.mname = mname;
	this.ptype = ptype;
	this.dos = dos;
	this.expired = expired;
	this.munit = munit;
	this.mprice = mprice;
	this.total = total;
	this.subtotal = subtotal;
	this.mvat = mvat;
	this.discount = discount;
	this.grandtotall = grandtotall;
	this.paid = paid;
	this.invoice = invoice;
	this.mid=mid;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
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
public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
}
public String getPtype() {
	return ptype;
}
public void setPtype(String ptype) {
	this.ptype = ptype;
}
public Date getDos() {
	return dos;
}
public void setDos(Date dos) {
	this.dos = dos;
}
public Date getExpired() {
	return expired;
}
public void setExpired(Date expired) {
	this.expired = expired;
}
public int getMunit() {
	return munit;
}
public void setMunit(int munit) {
	this.munit = munit;
}
public int getMprice() {
	return mprice;
}
public void setMprice(int mprice) {
	this.mprice = mprice;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
public int getSubtotal() {
	return subtotal;
}
public void setSubtotal(int subtotal) {
	this.subtotal = subtotal;
}
public int getMvat() {
	return mvat;
}
public void setMvat(int mvat) {
	this.mvat = mvat;
}
public int getDiscount() {
	return discount;
}
public void setDiscount(int discount) {
	this.discount = discount;
}
public int getGrandtotall() {
	return grandtotall;
}
public void setGrandtotall(int grandtotall) {
	this.grandtotall = grandtotall;
}
public int getPaid() {
	return paid;
}
public void setPaid(int paid) {
	this.paid = paid;
}
public int getInvoice() {
	return invoice;
}
public void setInvoice(int invoice) {
	this.invoice = invoice;
}

public int getMid() {
	return mid;
}
public void setMid(int mid) {
	this.mid = mid;
}
@Override
public String toString() {
	return "Sell [sid=" + sid + ", cname=" + cname + ", mobile=" + mobile + ", mname=" + mname + ", ptype=" + ptype
			+ ", dos=" + dos + ", expired=" + expired + ", munit=" + munit + ", mprice=" + mprice + ", total=" + total
			+ ", subtotal=" + subtotal + ", mvat=" + mvat + ", discount=" + discount + ", grandtotall=" + grandtotall
			+ ", paid=" + paid + ", invoice=" +invoice + "]";
}



}