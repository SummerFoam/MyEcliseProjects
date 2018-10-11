package com.hm.manytomany2;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hm.utils.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.openSession();
		Transaction trans=session.beginTransaction();
		
		Student s1=new Student();
		s1.setName("jack");
		
		Course c1=new Course();
		c1.setName("java");
		Course c2=new Course();
		c2.setName("php");
		
		StuCouId sci1=new StuCouId();
		sci1.setCou(c1);
		sci1.setStu(s1);
		
		StuCouId sci2=new StuCouId();
		sci2.setCou(c2);
		sci2.setStu(s1);
		
		StuCou sc1=new StuCou();
		sc1.setId(sci1);
		sc1.setRemark("99.9");
		
		StuCou sc2=new StuCou();
		sc2.setId(sci2);
		sc2.setRemark("88.8");
		
		s1.getScs().add(sc1);
		s1.getScs().add(sc2);
		
		session.save(c1);
		session.save(c2);
		session.save(s1);
		trans.commit();
		session.close();
	}

}
