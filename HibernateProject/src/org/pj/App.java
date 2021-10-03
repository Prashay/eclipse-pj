package org.pj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.pj.entity.Users;

public class App {
public static void main(String []args) {
	SessionFactory fc = new Configuration()
			            .configure("hibernate.cfg.xml")
			            .addAnnotatedClass(Users.class)
			            .buildSessionFactory();
	
	Session sc =fc.getCurrentSession();
	try {
		Users user = new Users("name","lastname");
		sc.beginTransaction();
		sc.save(user);
		sc.getTransaction().commit();
		System.out.println("Hibernate Done");
		
	}finally {
		sc.close();
		fc.close();
	}
	
	
}
}
