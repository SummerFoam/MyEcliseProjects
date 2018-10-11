package com.hm.test;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.hm.bean.Employee;
import com.hm.utils.MySessionFactory;

public class testMain {
	//�Ҽ�recactior-create method ѡ��1-4
	public static void main(String[] args) {
		//addEmp();
		//�޸Ķ���1.��ѯ������2.setXXX�޸�����
		//updateEmp();
		//ɾ������1.��ѯһ������2.ɾ��
		//delEmp();
		//selectEmpty();
		}
//	private static void selectEmpty() throws HibernateException {
//		Session session=MySessionFactory.getSessionFactorey().openSession();
//		Transaction ts=session.beginTransaction();
//		Employee emp=(Employee) session.load(Employee.class, 2);
//	}
//ͨ��IDɾ��Ա��
	private static void delEmp() {
		Session session=MySessionFactory.getSessionFactorey().openSession();
		Transaction ts=session.beginTransaction();
		Employee emp=(Employee) session.load(Employee.class, 2);
		session.delete(emp);
		ts.commit();
		session.close();
	}

	private static void updateEmp() {
		Session session=MySessionFactory.getSessionFactorey().openSession();
		Transaction trans=session.beginTransaction();
		Employee emp=(Employee) session.load(Employee.class, 2);
		emp.setName("tom");
		emp.setEmail("tom@126.com");
		trans.commit();
		session.close();
	}

	private static void addEmp() {
		//1.ʹ��hibernate������ݿ����ɾ�Ĳ�[ֻ�ܼ������󲻼���]
		//����һ��configuration,�ö������ڶ�ȡhibernate.cfg.xml��
		//��ɳ�ʼ������
		Configuration configure=new Configuration().configure();
		//2.����SessionFactory����һ���Ự��������һ���������Ķ���һ����Ŀֻ��һ����
		SessionFactory factory=configure.buildSessionFactory();
		//3.����Session,�൱��jdbc�������ݿ��Connection,����servert�е�HttpSession,Ҳ����jsp Session
		Session session=factory.openSession();
		//4����Hibernate����,Ҫ�����Ա�ڽ�����ɾ�Ĳ�����ʱ���ύ���񣬿���һ������
		Transaction trans=session.beginTransaction();
		//���һ����Ա��Ϣ
		Employee el=new Employee();
		el.setName("hh");
		el.setEmail("hh@126.com");
		el.setHiredate(new Date());
		//save employee�������ݿ⣬����ĳ־û�
		session.save(el);
		trans.commit();
		session.close();
	}
}
