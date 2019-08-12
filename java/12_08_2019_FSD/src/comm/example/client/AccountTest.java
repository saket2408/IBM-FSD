package comm.example.client;

public class AccountTest {
	public static void main(String args[]) {
		
		account a = new account("saket", "saxena" , 2000);
		account b = new account("saket", "saxena" , 2000);
		System.out.println(a);
		System.out.println(a==b);
		System.out.println(a.equals(b));
	}
}
