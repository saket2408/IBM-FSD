package comm.example;

public class ContractEmployee extends Employee{

	private int payPerHour;

	public ContractEmployee() {
		super();
	}

	public ContractEmployee(int pph) {
		super(1, "Sherlock" , "Holmes");
		this.payPerHour = pph;
	}
	
	public String getDetails() {
		return super.getDetails() + " pay per hour: " + payPerHour;
	}
}
