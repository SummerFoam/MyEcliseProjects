package com.hm.inheritance.onetable;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hm.utils.HibernateUtil;



public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.openSession();
		Transaction trans=session.beginTransaction();
		
		Dog d=new Dog();
		d.setName("oude");
		d.setColor("红色");
		d.setCallType("汪汪");
		session.save(d);
		
		Bird b=new Bird();
		b.setName("八哥");
		b.setColor("黑色");
		b.setType("can speak");
		session.save(b);
		
		trans.commit();
		session.close();
	}

}
