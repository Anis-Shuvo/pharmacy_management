package com.exam.spring.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Purchase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int pid;
	String mname ;
	String supplier;
	String ptype;
	Date dop; 
	Date expired;
	int munit;
	int sprice;
	int total;
	int subtotal;
	int mvat ;
	int discount;
	int grandtotall;
	int paid;
	int invoice;
	int mid;
	
	public Purchase() {
		super();
	}

	public Purchase(int pid) {
		super();
		this.pid = pid;
	}

	public Purchase(String mname, String supplier, String ptype, Date dop, Date expired, int munit, int sprice,
			int total, int subtotal, int mvat, int discount, int grandtotall, int paid, int invoice, int mid) {
		super();
		this.mname = mname;
		this.supplier = supplier;
		this.ptype = ptype;
		this.dop = dop;
		this.expired = expired;
		this.munit = munit;
		this.sprice = sprice;
		this.total = total;
		this.subtotal = subtotal;
		this.mvat = mvat;
		this.discount = discount;
		this.grandtotall = grandtotall;
		this.paid = paid;
		this.invoice = invoice;
		this.mid = mid;
	}

	public Purchase(int pid, String mname, String supplier, String ptype, Date dop, Date expired, int munit, int sprice,
			int total, int subtotal, int mvat, int discount, int grandtotall, int paid, int invoice, int mid) {
		super();
		this.pid = pid;
		this.mname = mname;
		this.supplier = supplier;
		this.ptype = ptype;
		this.dop = dop;
		this.expired = expired;
		this.munit = munit;
		this.sprice = sprice;
		this.total = total;
		this.subtotal = subtotal;
		this.mvat = mvat;
		this.discount = discount;
		this.grandtotall = grandtotall;
		this.paid = paid;
		this.invoice = invoice;
		this.mid = mid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public Date getDop() {
		return dop;
	}

	public void setDop(Date dop) {
		this.dop = dop;
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

	public int getSprice() {
		return sprice;
	}

	public void setSprice(int sprice) {
		this.sprice = sprice;
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
		return "Purchase [pid=" + pid + ", mname=" + mname + ", supplier=" + supplier + ", ptype=" + ptype + ", dop="
				+ dop + ", expired=" + expired + ", munit=" + munit + ", sprice=" + sprice + ", total=" + total
				+ ", subtotal=" + subtotal + ", mvat=" + mvat + ", discount=" + discount + ", grandtotall="
				+ grandtotall + ", paid=" + paid + ", invoice=" + invoice + ", mid=" + mid + ", getPid()=" + getPid()
				+ ", getMname()=" + getMname() + ", getSupplier()=" + getSupplier() + ", getPtype()=" + getPtype()
				+ ", getDop()=" + getDop() + ", getExpired()=" + getExpired() + ", getMunit()=" + getMunit()
				+ ", getSprice()=" + getSprice() + ", getTotal()=" + getTotal() + ", getSubtotal()=" + getSubtotal()
				+ ", getMvat()=" + getMvat() + ", getDiscount()=" + getDiscount() + ", getGrandtotall()="
				+ getGrandtotall() + ", getPaid()=" + getPaid() + ", getInvoice()=" + getInvoice() + ", getMid()="
				+ getMid() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
	
