package Programs;

import java.util.Iterator;
import java.util.List;

import Dao.DaoUtility;
import Model.Student;

/**
 * @author Deepak Prajapati
 * 
 * @Description This class is used to get the list of students.
 *
 */
public class GetAllStudent {
	public static void main(String[] args) {
		DaoUtility utility=new DaoUtility();
		List<Student> list=utility.getStudents();
		Iterator<?> iterator=list.iterator();
		while (iterator.hasNext()) {
			Student student = (Student) iterator.next();
			System.out.println("Student [ Id : "+student.getId()+", Name : "+student.getName()+
					", Age : "+student.getAge()+", Address : "+student.getAddress()+" ].");
		}
	}
}
