package com.bridgelabz.controller;

import com.bridgelabz.dao.EmployeeDao;

/**
 * @author Deepak Prajapati
 * @Description this class is used to store the employee details into the database.
 *
 */
public class Store {
	public static void main(String[] args) {
		EmployeeDao employeeDao=new EmployeeDao();
		boolean isStore=employeeDao.insertEmployee();
		if(isStore)
		{
			System.out.println("Data Inserted.");
		}
		else{
			System.out.println("Data is not Inserted.");
		}
	}  

}
