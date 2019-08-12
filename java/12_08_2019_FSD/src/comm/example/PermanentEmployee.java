package comm.example;

public class PermanentEmployee extends Employee {
	private int salary;

	public PermanentEmployee() {
		super();
	}

	public PermanentEmployee(int salary) {
		super(1, "saket" , "saxena");
		this.salary = salary;
	}
	
	@Override
	public String getDetails() {
		return super.getDetails() + " salary: " + salary;
	}
	
}
