package com.hm.onetomany;

import java.util.HashSet;
import java.util.Set;

public class Person {
	private int id;
	private String name;
	private Set<Car> cars=new HashSet<Car>();
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
	public Set<Car> getCars() {
		return cars;
	}
	public void setCars(Set<Car> cars) {
		this.cars = cars;
	}
	
}
