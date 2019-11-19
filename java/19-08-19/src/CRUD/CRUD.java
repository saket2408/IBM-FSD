
package CRUD;
import java.util.Scanner;

class CRUD {

	public static void main(String[] args) {
		int choice;
		String name;
		String id;
		double gpa;
		Student student = new Student();
		Scanner scanner = new Scanner(System.in);
		do {
		System.out.println("Enter your Choice: \n"
				+ "1. Add \n"
				+ "2. view \n"
				+ "3. delete \n"
				+ "4. update");
		choice = scanner.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("enter id:");
			id = scanner.next();
			System.out.println("enter name:");
			name = scanner.next();
			System.out.println("enter GPA:");
			gpa = scanner.nextDouble();
			student.addStudent(id, name, gpa);
			System.out.println("added!!!");
			break;
			
		case 2:
			student.viewStudents();
			break;
		case 3:
			System.out.println("enter id to delete: ");
			id = scanner.next();
			try {
				student.deleteStudent(id);
			} catch (ObjectNotFoundException e) {
				System.err.println(e.getMessage());
			}
			break;
		case 4:
			System.out.println("enter id where to update:");
			id = scanner.next();
			System.out.println("enter name:");
			name = scanner.next();
			System.out.println("enter GPA:");
			gpa = scanner.nextDouble();
			try {
				student.updateStudent(id,name,gpa);
			} catch (ObjectNotFoundException e) {
				System.err.println(e.getMessage());
			}
			break;
			
		default:
			System.err.println("enter correct choice");
			
			
		}
		}
		while(true);
	}

}