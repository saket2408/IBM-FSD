package error_exeption;

import java.util.Scanner;

public class Tester {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		Person person = new Person();
		Person person1 = new Person("","");
		
		int i = 0;
		String name;
		String lname;
		do {
			try {
				System.out.println("enter name : ");
				name = scanner.next();
				System.out.println("enter last name : ");
				lname = scanner.next();
				person.createPerson(name, lname);
				person.equals(person, person1);
				person1.setName(name);
				person1.setLname(lname);
				
			} catch (NameIsNotValidException e) {
				System.err.println(e.getMessage());
				System.exit(0);
				}
			catch(ObjectSameException o) {
				System.err.println(o.getMessage());
				System.exit(0);
			}
			
	
		}
		while(true);
	}

}
