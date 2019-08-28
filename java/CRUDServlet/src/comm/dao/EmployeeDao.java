package comm.dao;

import java.sql.SQLException;
import java.util.List;

import comm.model.Employee;

public interface EmployeeDao {

	public List<Employee> viewEmployee() throws SQLException;
	public void addEmployee(Employee e) throws SQLException;
	public void deleteEmployee(int id) throws SQLException;
	public Employee getEmploye(int id) throws SQLException;
	public int findEmploye(String name, String password) throws SQLException;
	public void editEmploye(Employee e) throws SQLException;

}
