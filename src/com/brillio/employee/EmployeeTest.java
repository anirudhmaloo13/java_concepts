package com.brillio.employee;

public class EmployeeTest {
	
	

	public static void main(String[] args) {
		Employee.companyname = "Brillio";
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();

		emp1.empid=101;
		emp1.empname= "Anirudh";
		emp1.empsalary = 90.3;
		
		
		emp2.empid=102;
		emp2.empname= "Anirudh2";
		emp2.empsalary = 9444;
		
		
		
	/*	System.out.println("---------------");
		System.out.println(emp2.empid);
		System.out.println(emp2.empname);
		System.out.println(emp2.empsalary);
		System.out.println(Employee.companyname); */
		
		//Employee.displayEmployeeDetails(emp1);
		//Employee.displayEmployeeDetails(emp2);
		//Employee.displayEmployeeDetails(emp3);
		
		emp1.printEmployeeDetails();
		emp2.printEmployeeDetails();
		emp3.printEmployeeDetails();
	}

}
