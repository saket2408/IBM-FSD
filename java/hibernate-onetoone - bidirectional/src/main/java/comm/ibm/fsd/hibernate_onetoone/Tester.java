package comm.ibm.fsd.hibernate_onetoone;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		InstructorImpl impl = new InstructorImpl();
		int choice =scanner.nextInt();
		switch (choice) {
		case 1:
			InstructorDetail detail = new InstructorDetail("http://yfsudw.com", "gaming");
			detail.setInstructor(new Instructor("sachin", "tendulkar", "ten@gg.com"));
			impl.addInstructordetail(detail);
			break;
			
		case 2:
			int id = 6;
			impl.deleteInstructorDetail(id);
			break;
		
		case 3:
			int id1 = 3;
			impl.getInstructorDetail(id1);
			break;
		default:
			break;
		}
	}

}
