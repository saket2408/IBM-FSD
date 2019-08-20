package jdbc.service;

import java.sql.SQLException;
import java.util.List;

import jdbc.dao.EmployeeDao;
import jdbc.dao.EmployeeDaoImpl;
import jdbc.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao dao = null;

	public EmployeeServiceImpl() {
		try {
			dao = new EmployeeDaoImpl();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void createEmployee(Employee employee) {
		
		dao.createEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return dao.getAllEmployees();
	}

	@Override
	public Employee getEmployeeById(int id) {
		
		return dao.getEmployeeById(id);
	}

}
