package com.hm.manytomany;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hm.utils.HibernateUtil;

public class TestManytoMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.openSession();
		Transaction trans=session.beginTransaction();
		Student s1=new Student();
		s1.setName("zhang");
		Student s2=new Student();
		s2.setName("tom");
		
		Course c1=new Course();
		c1.setName("java");
		Course c2=new Course();
		c2.setName("c++");
		
		//把课程添加到数据库
		s1.getCous().add(c1);
		s1.getCous().add(c2);
		
		//把s2添加到数据库
		c1.getStus().add(s2);
		c2.getStus().add(s2);
		
		session.save(c1);
		session.save(c2);
		trans.commit();
		session.close();
	}

}
