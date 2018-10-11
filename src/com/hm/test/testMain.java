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
	//右键recactior-create method 选中1-4
	public static void main(String[] args) {
		//addEmp();
		//修改对象1.查询出对象2.setXXX修改属性
		//updateEmp();
		//删除对象，1.查询一个对象2.删除
		//delEmp();
		//selectEmpty();
		}
//	private static void selectEmpty() throws HibernateException {
//		Session session=MySessionFactory.getSessionFactorey().openSession();
//		Transaction ts=session.beginTransaction();
//		Employee emp=(Employee) session.load(Employee.class, 2);
//	}
//通过ID删除员工
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
		//1.使用hibernate完成数据库的增删改查[只能见到对象不见表]
		//创建一个configuration,该对象用于读取hibernate.cfg.xml文
		//完成初始化工作
		Configuration configure=new Configuration().configure();
		//2.创建SessionFactory，是一个会话工厂，是一个重量级的对象，一个项目只有一个，
		SessionFactory factory=configure.buildSessionFactory();
		//3.创建Session,相当于jdbc连接数据库的Connection,不是servert中的HttpSession,也不是jsp Session
		Session session=factory.openSession();
		//4对于Hibernate而言,要求程序员在进行增删改操作的时候提交事务，开启一个事务
		Transaction trans=session.beginTransaction();
		//添加一个雇员信息
		Employee el=new Employee();
		el.setName("hh");
		el.setEmail("hh@126.com");
		el.setHiredate(new Date());
		//save employee对象到数据库，对象的持久化
		session.save(el);
		trans.commit();
		session.close();
	}
}
