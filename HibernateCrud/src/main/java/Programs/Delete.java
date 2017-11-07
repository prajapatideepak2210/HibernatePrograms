package Programs;

import Dao.DaoUtility;

/**
 * @author Deepak Prajapati
 * 
 * @Decription Here you will delete the Student Record.
 */
public class Delete {
	public static void main(String[] args) {
		boolean delete=DaoUtility.deleStudent();
		if(delete)
		{
			System.out.println("Data Deleted.");
		}
	}
}
