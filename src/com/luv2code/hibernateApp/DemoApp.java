package com.luv2code.hibernateApp;

import java.text.ParseException;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.date.DateUtils;
import com.luv2code.hibernate.entity.Employee;

public class DemoApp {

	public static void main(String[] args) throws ParseException {
			
		//create Sessionfactory
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Employee.class)
									.buildSessionFactory();
		
		//create currentSession
		Session session = factory.getCurrentSession();
		
		//create Employee object
		
		Employee employee= new Employee("Micha³","Chojnacki","SunHunter",DateUtils.parseDate("26/09/1994"));
		Employee employee2= new Employee("Bartek","Jagodzinski","ZRW",DateUtils.parseDate("26/09/1994"));
		 
	try {	
		
		  //begin transaction 
		session.beginTransaction();
		  
		  //save object's 
		session.save(employee); 
		session.save(employee2);
		  
		  //commit transaction 
		session.getTransaction().commit();
		 
	 // MY NEW CODE DELETE OBJECTS
		
		/*
		 * //begin transaction session = factory.getCurrentSession();
		 * session.beginTransaction(); int employeeId=2; Employee
		 * employee3=session.get(Employee.class,employeeId); //delete object's
		 * session.delete(employee3);
		 * 
		 * //commit transaction session.getTransaction().commit();
		 */
		
		
		/*
		 * // MY NEW CODE RETRIEVE OBJECTS //begin transaction session =
		 * factory.getCurrentSession(); session.beginTransaction(); int employeeId=3;
		 * Employee employee3=session.get(Employee.class,employeeId); Employee
		 * employee4=session.get(Employee.class,4);
		 * 
		 * System.out.println("Employee 1 : "+ employee3);
		 * System.out.println("Employee 2 : "+ employee4); //commit transaction
		 * session.getTransaction().commit();
		 */
		
		/*
		 * // MY NEW CODE QUERY //begin transaction session =
		 * factory.getCurrentSession(); session.beginTransaction();
		 * 
		 * //update objects
		 * session.createQuery("update Employee set lastName='CHOJNACKI'").executeUpdate
		 * (); //commit transaction session.getTransaction().commit();
		 */
		 // MY NEW CODE FIND EMPLOYEE BY COMPANY
			//begin transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
//			//update objects
//			List<Employee> employeeZRW =session.createQuery("from Employee e WHERE company='ZRW'").list();
//			for(Employee employees: employeeZRW) {
//			System.out.println(employees);
//			}
//			//commit transaction
//			session.getTransaction().commit();
		}
	finally {
	 factory.close();
 		}
	}
}	
	
