package project4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number of contacts: ");
		ArrayList<Contact> list = new ArrayList<Contact>();
		String name;
		String email;
		long mobile;
		String address;
		
		int num =scanner .nextInt();
		for(int i=1;i<=num;i++) {
			System.out.println("enter contact "+i+" detail:");
			System.out.println("Enter name:");
			name = scanner.next();
			System.out.println("Enter email:");
			email = scanner.next();
			System.out.println("Enter mobile:");
			mobile = scanner.nextLong();
			System.out.println("Enter address:");
			address = scanner.next();
			list.add(new Contact(name, email, mobile, address));
			
		}
		Collections.sort(list);
		System.out.println("Contact list after sort by mobile number in descending order: ");
		for(Contact c: list) {
			System.out.println(c.getName()+"-"+c.getMobile());
		}
	}

}
