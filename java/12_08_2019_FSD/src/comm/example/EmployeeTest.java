package comm.example;
import comm.example.*;

public class EmployeeTest {
	public static void main(String args[]) {
		Employee e = null;
		e = new PermanentEmployee(320000);
		System.out.println(e.getDetails()) ;
		
		e = new ContractEmployee(32000);
		System.out.println(e.getDetails()) ;
	}
}
