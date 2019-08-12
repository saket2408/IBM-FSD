package comm.example.client;
import comm.example.*;

public class Tester {
	public static void main(String[] args) {
		MyDate myDate = new MyDate();
		myDate.createDate(24, 8 , 1997);
		System.out.println(myDate.getDate());
	}
}
