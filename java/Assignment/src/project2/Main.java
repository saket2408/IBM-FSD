package project2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		do {
		Scanner scanner = new Scanner(System.in);
		String password = scanner.next();
		boolean match= UserMainCode.checkPassword(password);
		if(match) {
			System.out.println("valid password");
		}
		else {
			System.out.println("invalid password");
		}
	}
		while(true);
		}

}
