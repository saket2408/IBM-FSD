package project1;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;


public class Employee implements Comparable<Object> {

	private int id;
	private String name;
	private String department;
	private Date dateOfJoining;
	private int age;
	private int salary;
	Set<Employee> list = new TreeSet<Employee>();

	public Employee() {
		super();
	}

	public Employee(int id, String name, String department, Date dateOfJoining, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.dateOfJoining = dateOfJoining;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void addEmployee(int id,String name, String department,Date dateOfJoining,int age,int salary) {
		list.add(new Employee(id, name, department, dateOfJoining, age, salary));
	}
	
	public Set<Employee> getEmployee(){
		return list;
	}

	@Override
	public String toString() {
		return id + "\t" + name + "\t" + department + "\t" + dateOfJoining + "\t" + age + "\t" + salary;
	}

	@Override
	public int compareTo(Object o) {
		Employee s = (Employee) o;
		if (this.getSalary() == s.getSalary()) {
			return 0;
		} else if (this.getSalary() > s.getSalary()) {
			return 1;
		} else {
			return -1;
		}
	}

}
