package com.hm.bean;

import java.io.Serializable;
import java.util.Date;
//序列化的类：正常读写对象，id唯一
public class Employee implements Serializable{
	//无参构造函数
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Integer id;
	private String name;
	private String email;
	private Date hiredate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	
}
