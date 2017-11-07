package Dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Model.Student;

/**
 * @author Deepak Prajapati
 *
 * @Description here you will found crud operations of hibernate like insertion deletion and updation.
 */
public class DaoUtility {
	/**
	 * @return boolean
	 * 
	 * @Description This method is used to insert Student Detail into database.
	 */
	public static boolean insertStudent()
	{
		Configuration configuration=new Configuration(); 
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();  
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		
		boolean check=true;
		try{
			Student student=new Student();
			System.out.println("Enter the Student name : ");
			String name = scanner.nextLine();
			student.setName(name);
			System.out.println("Enter the age : ");
			int age=scanner.nextInt();
			student.setAge(age);
			System.out.println("Enter the address : ");
			scanner.nextLine();
			String address=scanner.nextLine();
			student.setAddress(address);

			session.save(student);
			transaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Input miss match, Data is not inserted.");
			check=false;
		}
		session.close();
		return check;
	}

	/**
	 * @return boolean
	 * 
	 * @Description This method is used to Delete the Student record from database.
	 */
	@SuppressWarnings("resource")
	public static boolean deleStudent() {
		boolean check=true;
		Scanner scanner=new Scanner(System.in);
		Configuration configuration=new Configuration();
		configuration.configure();
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Student student=new Student();
		try{
			System.out.println("Enter the Student id : ");
			int id=scanner.nextInt();
			student=session.get(Student.class, id);
			session.delete(student);
			transaction.commit();
		}catch (Exception e) {
			System.out.println("input not matching, data is not deleted.");
			check=false;
		}
		session.close();
		return check;
	}

	/**
	 * @return boolean
	 * 
	 * @Description This method is used to update the Student details.
	 */
	public static boolean upadateStudent() {
		boolean check=true;
		Configuration configuration=new Configuration();
		configuration.configure();
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Student student=new Student();
		try {
			@SuppressWarnings("resource")
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the student id : ");
			int id=scanner.nextInt();
			student=session.get(Student.class, id);
			System.out.println("Enter student name : ");
			scanner.nextLine();
			String name = scanner.nextLine();
			student.setName(name);
			System.out.println("Enter address.");
			String address=scanner.nextLine();
			student.setAddress(address);
			System.out.println("Enter age ; ");
			int age=scanner.nextInt();
			student.setAge(age);
			session.update(student);
			transaction.commit();
		} catch (Exception e) {
			System.out.println("Input Missmatch, Data is not update");
			check=false;
		}
		
		session.close();
		return check;
	}
}
