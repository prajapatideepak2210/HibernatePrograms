package com.bridgelabz.programs;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgelabz.model.EmployeeBean;


public class Test {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		boolean check=true;
		Configuration configure=new Configuration(); 
		configure.configure();
		SessionFactory factory=configure.buildSessionFactory();  
		
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		EmployeeBean emp=new EmployeeBean();
		Scanner scanner=new Scanner(System.in);
		try{
		
		System.out.println("Enter the name : ");
		String name=scanner.nextLine();
		emp.setName(name);
		System.out.println("Enter the age : ");
		int age=scanner.nextInt();
		emp.setAge(age);
		System.out.println("Enter the salary : ");
		long salary=scanner.nextLong();
		emp.setSalary(salary);
		
		session.save(emp);
		tr.commit();
		}catch (Exception e) {
			System.out.println("input is wrong.");
			check=false;
		}
		if(check)
			System.out.println("Data Inserted");
		session.close();
		
	}
}
