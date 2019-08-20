package jdbc.service;

import java.util.List;

import jdbc.model.Employee;

public interface EmployeeService {
	public void createEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(int id);

}
