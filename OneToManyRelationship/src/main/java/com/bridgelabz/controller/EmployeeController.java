package com.bridgelabz.controller;

import com.bridgelabz.dao.EmployeeDao;

/**
 * @author Deepak Prajapati
 * @Description This class is used to control all transaction.
 *
 */
public class EmployeeController {
	public static void main(String[] args) {
		EmployeeDao employeeDao=new EmployeeDao();
		boolean check=employeeDao.insert();
		if(check){
			System.out.println("Data Inserted.");
		}
		else{
			System.out.println("Data is not Inserted.");
		}
	}
}
