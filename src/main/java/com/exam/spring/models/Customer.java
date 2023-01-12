package com.exam.spring.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   int cid;
	   String cname;
		int mobile;
		String email;
		String contact;
		String address;
		String city;
		public Customer() {
			super();
		}
		public Customer(int cid) {
			super();
			this.cid = cid;
		}
		public Customer(String cname, int mobile, String email, String contact, String address, String city) {
			super();
			this.cname = cname;
			this.mobile = mobile;
			this.email = email;
			this.contact = contact;
			this.address = address;
			this.city = city;
		}
		public Customer(int cid, String cname, int mobile, String email, String contact, String address, String city) {
			super();
			this.cid = cid;
			this.cname = cname;
			this.mobile = mobile;
			this.email = email;
			this.contact = contact;
			this.address = address;
			this.city = city;
		}
		public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		@Override
		public String toString() {
			return "Customer [cid=" + cid + ", cname=" + cname + ", mobile=" + mobile + ", email=" + email
					+ ", contact=" + contact + ", address=" + address + ", city=" + city + "]";
		}
		

}
