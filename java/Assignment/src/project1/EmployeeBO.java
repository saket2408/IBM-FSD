package project1;

import java.util.ArrayList;
import java.util.Set;

public class EmployeeBO {

	public static void printEmployee(Set<Employee> list) {
		for(Employee emp:list) {
			System.out.println(emp);
		}
	}
	
	public static void printEmployeebyList(ArrayList<Employee> list) {
		for(Employee emp:list) {
			System.out.println(emp);
		}
	}

}
