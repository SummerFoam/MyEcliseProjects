package com.hm.onetoone.zhujian;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hm.utils.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.openSession();
		Transaction trans=session.beginTransaction();
		Husband h=new Husband();
		h.setName("feng");
		h.setAge(22);
		
		Wife w=new Wife();
		w.setName("jing");
		w.setAge(22);
		
		h.setWife(w);
		w.setHusband(h);
		
		session.save(h);
		session.save(w);
		
		trans.commit();
		session.close();
	}

}
