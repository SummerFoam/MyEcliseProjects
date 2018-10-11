package com.hm.onetomany;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hm.utils.HibernateUtil;


public class TestOnetoMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.openSession();
		Transaction trans=session.beginTransaction();
		Person p=new Person();
		p.setName("tom");
		
		Car c1=new Car();
		c1.setCard("豫D123456");
		c1.setFactory("上海");
		
		Car c2=new Car();
		c2.setCard("豫D123456");
		c2.setFactory("北京现代");
		
		c1.setPerson(p);
		c2.setPerson(p);
		p.getCars().add(c1);
		p.getCars().add(c2);
		session.save(c1);
		session.save(c2);
		trans.commit();
		session.close();
	}

}
