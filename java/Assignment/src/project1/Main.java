package project1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	
	public static void main(String[] args) {
		String name;
		String department;
		String dateOfJoining;
		Date date = null;
		int age;
		int salary;
		int choice;
		Employee e = new Employee();
		AgeComparator a = new AgeComparator();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the number of employees");
		int num =scanner.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.println("Enter the details of employee "+i);
			name = scanner.next();
			department = scanner.next();
			dateOfJoining = scanner.next();
			try {
				date= new SimpleDateFormat("dd/MM/yyyy").parse(dateOfJoining);
			} catch (ParseException p) {
				p.printStackTrace();
			}
			age = scanner.nextInt();
			salary = scanner.nextInt();
			e.addEmployee(i, name, department, date, age, salary);	
		}
		
		do {
		System.out.println("1.Sort employees by salary\n" + 
				"2.Sort employees by age and by date of joining\n");
		System.out.println("Enter your choice");
		choice = scanner.nextInt();
		switch(choice) {
		case 1:
			System.out.println("id\tname\tdepartment\tdateOfJoining\t\tage\tsalary");
			EmployeeBO.printEmployee(e.getEmployee());
			break;
		case 2:
			a.setEmployee(e.getEmployee());
			System.out.println("id\tname\tdepartment\tdateOfJoining\t\tage\tsalary");
			EmployeeBO.printEmployeebyList(a.getEmployee());
			
		default:
			System.out.println("please enter valid choice");
			
			
		}
		}
		while(true);
		
	}

}
