package example;

import java.sql.SQLException;

import comm.dao.EmployeeDao;
import comm.dao.EmployeeDaoImpl;


public class Model {

	private String username;
	private String password;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int verifyUser() throws SQLException {
		EmployeeDao emp = new EmployeeDaoImpl();
		int a = emp.findEmploye(username, password);
		return a;
	}

}
