package com.bridgelabz.dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgelabz.model.Address;
import com.bridgelabz.model.Employee;

/**
 * @author Deepak Prajapati
 * @Description This class is used to communicate with the database.
 *
 */
public class EmployeeDao {
	/**
	 * @return boolean
	 * @Description This method is used to insert the employee data into the database,
	 * It will return true if Employee data is inserted otherwise it will return false.
	 */
	@SuppressWarnings("resource")
	public boolean insertEmployee()
	{
		boolean check=false;
		Scanner scanner=new Scanner(System.in);
		Employee employee=new Employee();
		Address address=new Address();
		
		System.out.println("Enter the Employee name : ");
		String name=scanner.nextLine();
		employee.setName(name);
		System.out.println("Enter the Employee email id : ");
		String email=scanner.nextLine();
		employee.setEmail(email);  

		System.out.println("Enter the Employee address line : ");
		String line1=scanner.nextLine();
		address.setAddressLine1(line1);
		System.out.println("Enter the Employee city : ");
		String city=scanner.nextLine();
		address.setCity(city);
		System.out.println("Enter the Employee state : ");
		String state=scanner.nextLine();
		address.setState(state);
		System.out.println("Enter the Employee country : ");
		String country=scanner.nextLine();
		address.setCountry(country);
		System.out.println("Enter the Employee pincode : ");
		int pincode=scanner.nextInt();
		address.setPincode(pincode);

		try{
			Configuration configuration=new Configuration();  
			configuration.configure("hibernate.cfg.xml");
			SessionFactory sessionFactory=configuration.buildSessionFactory();  
			Session session=sessionFactory.openSession();  
			Transaction transaction=session.beginTransaction(); 
			employee.setAddress(address);
			address.setEmployee(employee);  

			session.persist(employee);  
			transaction.commit();  
			session.close();
			check=true;
		}catch (Exception e) {
			return check=false;
		}
		return check;
		
	}
}
