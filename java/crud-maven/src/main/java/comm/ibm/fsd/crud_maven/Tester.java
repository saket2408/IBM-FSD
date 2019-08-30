package comm.ibm.fsd.crud_maven;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		int id;
		String fname;
		String lname;
		String email;
		Methods m = new Methods();
		do {
		System.out.println("select an option: ");
		System.out.println("1. Add employee");
		System.out.println("2. show all employees");
		System.out.println("3. delete employee");
		System.out.println("4. update employee");
		System.out.println("5. find employee by id");
		System.out.println("6. find employee by first name");
		choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("enter  first name");
			fname = scanner.next();
			System.out.println("enter  last name");
			lname = scanner.next();
			System.out.println("enter email");
			email = scanner.next();
			m.addEmployee(new Employee(fname, lname, email));
			break;
		case 2:
			m.getAllEmployee();
			break;
		case 3:
			System.out.println("enter  id where you want to delete");
			id = scanner.nextInt();
			m.deleteEmployee(id);
			break;
		case 4:
			System.out.println("enter  id where you want to update");
			id = scanner.nextInt();
			System.out.println("enter  first name");
			fname = scanner.next();
			System.out.println("enter  last name");
			lname = scanner.next();
			System.out.println("enter email");
			email = scanner.next();
			m.updateEmployee(id, fname, lname, email);
			break;
		case 5:
			System.out.println("enter  id which you want to find");
			id = scanner.nextInt();
			m.findEmployee(id);
			break;
		case 6:
			System.out.println("enter  first name");
			fname = scanner.next();
			m.findByName(fname);
			break;
		default:
			System.out.println("invalid choice!!");
			break;
		}
	}while(true);
	}
	

}
