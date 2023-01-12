package com.exam.spring.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Medicine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 int mid ;
     String mname ;
		String mgeneric;
		int munit;
		String mcategory;
		String mtype;
		String supplier;
		int mprice;
		int sprice;
		int mvat ;
		int mstock;
		Date dop; 
		Date doe;
		public Medicine() {
			super();
		}
		public Medicine(int mid) {
			super();
			this.mid = mid;
		}
		public Medicine(String mname, String mgeneric, int munit, String mcategory, String mtype, String supplier,
				int mprice, int sprice, int mvat, int mstock, Date dop, Date doe) {
			super();
			this.mname = mname;
			this.mgeneric = mgeneric;
			this.munit = munit;
			this.mcategory = mcategory;
			this.mtype = mtype;
			this.supplier = supplier;
			this.mprice = mprice;
			this.sprice = sprice;
			this.mvat = mvat;
			this.mstock = mstock;
			this.dop = dop;
			this.doe = doe;
		}
		
		public Medicine(int mid, String mname, String mgeneric, int munit, String mcategory, String mtype,
				String supplier, int mprice, int sprice, int mvat, int mstock, Date dop, Date doe) {
			super();
			this.mid = mid;
			this.mname = mname;
			this.mgeneric = mgeneric;
			this.munit = munit;
			this.mcategory = mcategory;
			this.mtype = mtype;
			this.supplier = supplier;
			this.mprice = mprice;
			this.sprice = sprice;
			this.mvat = mvat;
			this.mstock = mstock;
			this.dop = dop;
			this.doe = doe;
		}
		public int getMid() {
			return mid;
		}
		public void setMid(int mid) {
			this.mid = mid;
		}
		public String getMname() {
			return mname;
		}
		public void setMname(String mname) {
			this.mname = mname;
		}
		public String getMgeneric() {
			return mgeneric;
		}
		public void setMgeneric(String mgeneric) {
			this.mgeneric = mgeneric;
		}
		public int getMunit() {
			return munit;
		}
		public void setMunit(int munit) {
			this.munit = munit;
		}
		public String getMcategory() {
			return mcategory;
		}
		public void setMcategory(String mcategory) {
			this.mcategory = mcategory;
		}
		public String getMtype() {
			return mtype;
		}
		public void setMtype(String mtype) {
			this.mtype = mtype;
		}
		public String getSupplier() {
			return supplier;
		}
		public void setSupplier(String supplier) {
			this.supplier = supplier;
		}
		public int getMprice() {
			return mprice;
		}
		public void setMprice(int mprice) {
			this.mprice = mprice;
		}
		public int getSprice() {
			return sprice;
		}
		public void setSprice(int sprice) {
			this.sprice = sprice;
		}
		public int getMvat() {
			return mvat;
		}
		public void setMvat(int mvat) {
			this.mvat = mvat;
		}
		public int getMstock() {
			return mstock;
		}
		public void setMstock(int mstock) {
			this.mstock = mstock;
		}
		public Date getDop() {
			return dop;
		}
		public void setDop(Date dop) {
			this.dop = dop;
		}
		public Date getDoe() {
			return doe;
		}
		public void setDoe(Date doe) {
			this.doe = doe;
		}
		@Override
		public String toString() {
			return "Medicine [mid=" + mid + ", mname=" + mname + ", mgeneric=" + mgeneric + ", munit=" + munit
					+ ", mcategory=" + mcategory + ", mtype=" + mtype + ", supplier=" + supplier + ", mprice=" + mprice
					+ ", sprice=" + sprice + ", mvat=" + mvat + ", mstock=" + mstock + ", dop=" + dop + ", doe=" + doe
					+ "]";
		}
		
		
}
