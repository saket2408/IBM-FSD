package comm.example;

public class Employee {
	private int Eid;
	private String name;
	private String lastname;
	public Employee() {
		
	}
	public Employee(int eid, String name, String lastname) {
		Eid = eid;
		this.name = name;
		this.lastname = lastname;
	}
	
	protected String getDetails() {
		return "Eid: "  + Eid + " name: " +name+ " lastname: " + lastname;
	}
	
	

}
