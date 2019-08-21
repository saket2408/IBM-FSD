package project4;

import project1.Employee;

public class Contact implements Comparable<Object> {

	private String name;
	private String email;
	private long mobile;
	private String address;

	public Contact(String name, String email, long mobile, String address) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}

	public Contact() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int compareTo(Object o) {
		Contact s = (Contact)o;
		if (this.getMobile() == s.getMobile()) {
			return 0;
		} else if (this.getMobile() > s.getMobile()) {
			return -1;
		} else {
			return 1;
		}
		
	}

}
