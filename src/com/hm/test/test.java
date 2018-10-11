package com.hm.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hm.bean.Employee;
import com.hm.utils.HibernateUtil;
import com.hm.utils.MySessionFactory;

public class test {
	public static void main(String[] args) {
		Session session=HibernateUtil.openSession();
		Transaction trans=null;
		try {
			trans=session.beginTransaction();
			
			Query query=session.createQuery("from Employee where name='hh'");
			List<Employee> list=query.list();
			for(Employee e:list) {
				System.out.println(e.getName());
			}
			trans.commit();
		}catch(Exception e) {
			if(trans!=null) {
				{trans.rollback();}
				throw new RuntimeException(e.getMessage());
			}
		}finally {
			if(session!=null && session.isOpen()) {
				//session���ʾ���jdbc��connection
				session.close();
			}
		}
		
	}
	
}
