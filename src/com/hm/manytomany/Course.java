package com.hm.manytomany;

import java.util.HashSet;
import java.util.Set;

public class Course {
	private int id;
	private String name;
	private Set<Student> stus=new HashSet<Student>();
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
	public Set<Student> getStus() {
		return stus;
	}
	public void setStus(Set<Student> stus) {
		this.stus = stus;
	}
	
}
