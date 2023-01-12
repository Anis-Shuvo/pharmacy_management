package com.exam.spring.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Invoice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 int inid ;
	    int invoice;
        String cname ;
		int mobile;
		Date dos; 
		String mname ;
		int quantity ;
		int price;
		int total;
		int subtotal;
		int discount;
		int paid;
		int mid;
		public Invoice() {
			super();
		}
		public Invoice(int inid) {
			super();
			this.inid = inid;
		}
		public Invoice(int invoice, String cname, int mobile, Date dos, String mname, int quantity, int price,
				int total, int subtotal, int discount, int paid,int mid) {
			super();
			this.invoice = invoice;
			this.cname = cname;
			this.mobile = mobile;
			this.dos = dos;
			this.mname = mname;
			this.quantity = quantity;
			this.price = price;
			this.total = total;
			this.subtotal = subtotal;
			this.discount = discount;
			this.paid = paid;
			this.mid=mid;
		}
		public Invoice(int inid, int invoice, String cname, int mobile, Date dos, String mname, int quantity, int price,
				int total, int subtotal, int discount, int paid,int mid) {
			super();
			this.inid = inid;
			this.invoice = invoice;
			this.cname = cname;
			this.mobile = mobile;
			this.dos = dos;
			this.mname = mname;
			this.quantity = quantity;
			this.price = price;
			this.total = total;
			this.subtotal = subtotal;
			this.discount = discount;
			this.paid = paid;
			this.mid=mid;
		}
		public int getInid() {
			return inid;
		}
		public void setInid(int inid) {
			this.inid = inid;
		}
		public int getInvoice() {
			return invoice;
		}
		public void setInvoice(int invoice) {
			this.invoice = invoice;
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
		public String getMname() {
			return mname;
		}
		public void setMname(String mname) {
			this.mname = mname;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
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
			return "Invoice [inid=" + inid + ", invoice=" + invoice + ", cname=" + cname + ", mobile=" + mobile
					+ ", dos=" + dos + ", mname=" + mname + ", quantity=" + quantity + ", price=" + price + ", total="
					+ total + ", subtotal=" + subtotal + ", discount=" + discount + ", paid=" + paid + "]";
		}
		
		
		
}
