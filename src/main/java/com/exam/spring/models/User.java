package com.exam.spring.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int uid;
	String userFullName;
	@Column(unique=true)
	String userName;
	String uPass;
	String uMobile;	
	String uEmail;	
	String uAddress;
	String uPhoto;
	public User() {
		super();
	}
	public User(int uid) {
		super();
		this.uid = uid;
	}
	public User(String userFullName, String userName, String uPass, String uMobile, String uEmail, String uAddress,
			String uPhoto) {
		super();
		this.userFullName = userFullName;
		this.userName = userName;
		this.uPass = uPass;
		this.uMobile = uMobile;
		this.uEmail = uEmail;
		this.uAddress = uAddress;
		this.uPhoto = uPhoto;
	}
	public User(int uid, String userFullName, String userName, String uPass, String uMobile, String uEmail,
			String uAddress, String uPhoto) {
		super();
		this.uid = uid;
		this.userFullName = userFullName;
		this.userName = userName;
		this.uPass = uPass;
		this.uMobile = uMobile;
		this.uEmail = uEmail;
		this.uAddress = uAddress;
		this.uPhoto = uPhoto;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUserFullName() {
		return userFullName;
	}
	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getuPass() {
		return uPass;
	}
	public void setuPass(String uPass) {
		this.uPass = uPass;
	}
	public String getuMobile() {
		return uMobile;
	}
	public void setuMobile(String uMobile) {
		this.uMobile = uMobile;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public String getuAddress() {
		return uAddress;
	}
	public void setuAddress(String uAddress) {
		this.uAddress = uAddress;
	}
	public String getuPhoto() {
		return uPhoto;
	}
	public void setuPhoto(String uPhoto) {
		this.uPhoto = uPhoto;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", userFullName=" + userFullName + ", userName=" + userName + ", uPass=" + uPass
				+ ", uMobile=" + uMobile + ", uEmail=" + uEmail + ", uAddress=" + uAddress + ", uPhoto=" + uPhoto + "]";
	}
	
	
}
