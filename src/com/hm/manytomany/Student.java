package com.hm.manytomany;

import java.util.HashSet;
import java.util.Set;

public class Student {
	private int id;
	private String name;
	private Set<Course> cous=new HashSet<Course>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Course> getCous() {
		return cous;
	}
	public void setCous(Set<Course> cous) {
		this.cous = cous;
	}
	
}
