package Programs;

import Dao.DaoUtility;

/**
 * @author Deepak Prajapati
 * @Description Here you will Update the Student Details.
 */
public class Update {
	public static void main(String[] args) {
		boolean update=DaoUtility.upadateStudent();
		if(update)
		{
			System.out.println("Data updated.");
		}
	}
}
