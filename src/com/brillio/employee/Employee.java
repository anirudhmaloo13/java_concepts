package com.brillio.employee;

public class Employee {

	 public int empid;
	 public String empname;
	 public double empsalary;
	 public static String companyname;
	 
	 
	// public static void displayEmployeeDetails(Employee e) {
	//	 System.out.println(e.empid);
	//		System.out.println(e.empname);
	//		System.out.println(e.empsalary);
	//		System.out.println(Employee.companyname);
	// }
	 public void printEmployeeDetails() {
		 System.out.println(empid);
			System.out.println(empname);
			System.out.println(empsalary);
			System.out.println(Employee.companyname);
	 }
	 

}
