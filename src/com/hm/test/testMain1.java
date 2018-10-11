package com.hm.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hm.bean.Employee;
import com.hm.utils.MySessionFactory;

public class testMain1 {
	public static void main(String[] args) {
//		Session s1=MySessionFactory.getSessionFactorey().getCurrentSession();
//		Session s2=MySessionFactory.getSessionFactorey().getCurrentSession();
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
		//‘⁄cfg.xml≈‰÷√getCurrentSession
		Session session=MySessionFactory.getSessionFactorey().getCurrentSession();
		Transaction trans=session.beginTransaction();
		Employee emp=(Employee) session.load(Employee.class, 2);
		emp.setName("tom");
		emp.setEmail("tom@126.com");
		trans.commit();
	}
}
