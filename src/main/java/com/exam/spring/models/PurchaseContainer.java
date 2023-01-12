package com.exam.spring.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class PurchaseContainer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 int pcid ;
	    int invoice;
        String supplier ;
		int mobile;
		Date dop; 
		String mname ;
		int munit ;
		int price;
		int total;
		int subtotal;
		int grandtotall;
		int discount;
		int paid;
		int mid;
		public PurchaseContainer() {
			super();
		}
		public PurchaseContainer(int pcid) {
			super();
			this.pcid = pcid;
		}
		public PurchaseContainer(int invoice, String supplier, int mobile, Date dop, String mname, int munit, int price,
				int total, int subtotal, int grandtotall, int discount, int paid, int mid) {
			super();
			this.invoice = invoice;
			this.supplier = supplier;
			this.mobile = mobile;
			this.dop = dop;
			this.mname = mname;
			this.munit = munit;
			this.price = price;
			this.total = total;
			this.subtotal = subtotal;
			this.grandtotall = grandtotall;
			this.discount = discount;
			this.paid = paid;
			this.mid = mid;
		}
		public PurchaseContainer(int pcid, int invoice, String supplier, int mobile, Date dop, String mname, int munit,
				int price, int total, int subtotal, int grandtotall, int discount, int paid, int mid) {
			super();
			this.pcid = pcid;
			this.invoice = invoice;
			this.supplier = supplier;
			this.mobile = mobile;
			this.dop = dop;
			this.mname = mname;
			this.munit = munit;
			this.price = price;
			this.total = total;
			this.subtotal = subtotal;
			this.grandtotall = grandtotall;
			this.discount = discount;
			this.paid = paid;
			this.mid = mid;
		}
		public int getPcid() {
			return pcid;
		}
		public void setPcid(int pcid) {
			this.pcid = pcid;
		}
		public int getInvoice() {
			return invoice;
		}
		public void setInvoice(int invoice) {
			this.invoice = invoice;
		}
		public String getSupplier() {
			return supplier;
		}
		public void setSupplier(String supplier) {
			this.supplier = supplier;
		}
		public int getMobile() {
			return mobile;
		}
		public void setMobile(int mobile) {
			this.mobile = mobile;
		}
		public Date getDop() {
			return dop;
		}
		public void setDop(Date dop) {
			this.dop = dop;
		}
		public String getMname() {
			return mname;
		}
		public void setMname(String mname) {
			this.mname = mname;
		}
		public int getMunit() {
			return munit;
		}
		public void setMunit(int munit) {
			this.munit = munit;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
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
		public int getGrandtotall() {
			return grandtotall;
		}
		public void setGrandtotall(int grandtotall) {
			this.grandtotall = grandtotall;
		}
		public int getDiscount() {
			return discount;
		}
		public void setDiscount(int discount) {
			this.discount = discount;
		}
		public int getPaid() {
			return paid;
		}
		public void setPaid(int paid) {
			this.paid = paid;
		}
		public int getMid() {
			return mid;
		}
		public void setMid(int mid) {
			this.mid = mid;
		}
		@Override
		public String toString() {
			return "PurchaseContainer [pcid=" + pcid + ", invoice=" + invoice + ", supplier=" + supplier + ", mobile="
					+ mobile + ", dop=" + dop + ", mname=" + mname + ", munit=" + munit + ", price=" + price
					+ ", total=" + total + ", subtotal=" + subtotal + ", grandtotall=" + grandtotall + ", discount="
					+ discount + ", paid=" + paid + ", mid=" + mid + "]";
		}
		
		
		
}
