package com.hm.bean.component;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hm.utils.HibernateUtil;

public class TestComponent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.openSession();
		Transaction trans=session.beginTransaction();
		Address addr=new Address();
		addr.setProvince("╨сдо");
		addr.setCountry("china");
		addr.setCity("shanghai");
		
		Human hu=new Human();
		hu.setName("tom");
		hu.setAddress(addr);
		session.save(hu);
		trans.commit();
		session.close();
	}

}
