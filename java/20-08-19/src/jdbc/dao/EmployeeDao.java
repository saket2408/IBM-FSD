package jdbc.dao;

import java.util.List;

import jdbc.model.Employee;

public interface EmployeeDao {

	public void createEmployee(Employee employee);

	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(int id);

	void getConnectioninfo();

}