package com.zeshan.restPassenger.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Passenger {
	
	private String Name;
	private String id;
	private long phoneMumber;
	private int age;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public long getPhoneMumber() {
		return phoneMumber;
	}
	public void setPhoneMumber(long phoneMumber) {
		this.phoneMumber = phoneMumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
