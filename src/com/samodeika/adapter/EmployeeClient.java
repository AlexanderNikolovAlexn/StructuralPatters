package com.samodeika.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public List<Employee> getEmployeeList(){
		
		List<Employee> employees = new ArrayList<>();
		
		Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john.wick@gmail.com");		
		employees.add(employeeFromDB);
		
		EmployeeLdap employeeLdap = new EmployeeLdap("chewie", "Solo", "Han", "solo.han@gmail.com");
		
		employees.add(new EmployeeAdapterLdap(employeeLdap));		
		
		return employees;
		
	}
	
}
