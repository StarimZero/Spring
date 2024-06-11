package com.example.domain;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class UserVO {
	private String uid;
	private String uname;
	private String upass;
	private String phone;
	private String add1;
	private String add2;
	private String photo;
	
	@JsonFormat(pattern="yyyy년MM월dd일 HH:mm:ss", timezone="Asia/Seoul")
	private Date regDate;
	
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress1() {
		return add1;
	}
	public void setAddress1(String address1) {
		this.add1 = address1;
	}
	public String getAddress2() {
		return add2;
	}
	public void setAddress2(String address2) {
		this.add2 = address2;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	
	@Override
	public String toString() {
		return "UserVO [uid=" + uid + ", uname=" + uname + ", upass=" + upass + ", phone=" + phone + ", add1="
				+ add1 + ", add2=" + add2 + ", photo=" + photo + ", regDate=" + regDate + "]";
	}
}