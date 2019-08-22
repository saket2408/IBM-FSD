package objectInputOutputStream;

import java.io.Serializable;

public class ObjectInputOutput implements Serializable {

	private static final long serialVersionUID = -8253232625440620092L;
	private String id;
	private String name;
	private String salary;
	private transient String address;// item will not be stored
	private ObjectInputOutput o;

	public ObjectInputOutput() {
		super();
	}

	
	public ObjectInputOutput(String id, String name, String salary, String address, ObjectInputOutput o) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.o = o;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "ObjectInputOutput [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + ", o="
				+ o + "]";
	}

	

}
