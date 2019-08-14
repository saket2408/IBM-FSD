package enumeration;

import java.util.Scanner;

public class Test {
	public static void main(String args[]) {
		Scanner scanner  = new Scanner(System.in);
		String name=null;
		System.out.println("enter coach name: ");
		name = scanner.next();
		TennisCoach coach = new TennisCoach();
		coach.creatCoach(name, Level.High);
		System.out.println(coach.getCoachDetails().toString());
		
		}

}