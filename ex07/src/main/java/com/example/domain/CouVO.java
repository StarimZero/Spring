package com.example.domain;

public class CouVO extends ProVO{

	private String lcode;
	private String lname;
	private int hours;
	private String room;
	private String instructor;
	private int capacity;
	private int persons;
	private String dept;
	
	
	
	public String getLcode() {
		return lcode;
	}
	public void setLcode(String lcode) {
		this.lcode = lcode;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hour) {
		this.hours = hour;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getPersons() {
		return persons;
	}
	public void setPersons(int persons) {
		this.persons = persons;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "CouVO [lcode=" + lcode + ", lname=" + lname + ", hour=" + hours + ", room=" + room + ", instructor="
				+ instructor + ", capacity=" + capacity + ", persons=" + persons + ", dept=" + dept + ", getPname()="
				+ getPname() + "]";
	}
	
	
	
	
	
	
}


