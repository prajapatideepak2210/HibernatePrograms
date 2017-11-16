package Programs;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


import Dao.DaoUtility;
import Model.Student;

/**
 * @author Deepak Prajapati
 * @Description This method is used to get all students list by Address.
 *
 */
public class GetStudentByAddress {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		DaoUtility utility=new DaoUtility();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the address of Student : ");
		String address=scanner.nextLine();
		List<Student> list=utility.getStudentByAddess(address);
		Iterator<Student> iterator=list.iterator();
		while(iterator.hasNext())
		{
			Student student=iterator.next();
			System.out.println("Student [ Id : "+student.getId()+", Name : "+student.getName()+", Age : "+student.getAge()+" ]." );
		}
	}
}
