package com.rabbit.consulting;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public static void main(String[] args) {
		EmployeeClient employeeClient = new EmployeeClient();
		List<Employee> employeeList = employeeClient.addEmployees();
		System.out.println("------------------------------------------");
		employeeClient.printEmployeeList(employeeList);
	}
	
	private List<Employee> addEmployees(){
		List<Employee> employeeList = new ArrayList<Employee>();
		Employee emp = new Employee();
		emp.setId(1);emp.setName("Steve"); emp.setPhone("111-222-3333");emp.setAddress("Main St, NY");
		System.out.println("Adding Employee.. steve");
		employeeList.add(emp);
		System.out.println("------------------------------------------");
		Employee emp1 = new Employee();
		emp1.setId(2);emp1.setName("Smith"); emp1.setPhone("444-555-6666");emp1.setAddress("First St, CA");
		System.out.println("Adding Employee.. smith");
		employeeList.add(emp1);
		return employeeList;
	}
	
	private void printEmployeeList(List<Employee> employeeList){
		System.out.println("Printing employee details");
		for(Employee currentEmployee :employeeList){
			System.out.println("Employee Id:"+currentEmployee.getId());
			System.out.println("Employee Name:"+currentEmployee.getName());
			System.out.println("Employee Phone:"+currentEmployee.getPhone());
			System.out.println("Employee Address:"+currentEmployee.getAddress());
			System.out.println("------------------------------------------");
		}
	}

}
