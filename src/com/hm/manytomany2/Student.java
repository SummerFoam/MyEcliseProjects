package com.hm.manytomany2;

import java.util.HashSet;
import java.util.Set;

public class Student {
	private int id;
	private String name;
	private Set<StuCou> scs=new HashSet<StuCou>();
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
	public Set<StuCou> getScs() {
		return scs;
	}
	public void setScs(Set<StuCou> scs) {
		this.scs = scs;
	}
	
	
}
