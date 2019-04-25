package com.hari.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Main {

	public static void main(String[] args) {
		Student_Info student = new Student_Info();
		student.setName("Hari");
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student_Info.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(student);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
	

}
