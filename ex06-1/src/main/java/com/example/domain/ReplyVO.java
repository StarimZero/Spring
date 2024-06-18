package com.example.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ReplyVO extends UserVO{
	private int rid;
	private int bid;
	private String uid;
	
	@JsonFormat(pattern="yy년MM월dd일 HH시mm분ss초", timezone="Asia/Seoul")
	private Date regDate;
	private String contents;
	private int rating;
	
	
	
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	@Override
	public String toString() {
		return "ReplyVO [rid=" + rid + ", bid=" + bid + ", uid=" + uid + ", regDate=" + regDate + ", contents="
				+ contents + ", rating=" + rating + ", getPhone()=" + getPhone() + ", getPhoto()=" + getPhoto()
				+ ", getUname()=" + getUname() + "]";
	}

	
	
	
}
