package comm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.mysql.cj.protocol.Resultset;

import comm.factory.MyConnectionFactory;
import comm.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private Connection connection = MyConnectionFactory.getMySqlConnection();
	private List<Employee> list = null;
	private PreparedStatement ps = null;

	@Override
	public List<Employee> viewEmployee() throws SQLException {
		Statement s = connection.createStatement();
		list = new ArrayList<Employee>();
		ResultSet rs = s.executeQuery("select * from users");
		while (rs.next()) {
			list.add(new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
		}
		return list;

	}

	@Override
	public void addEmployee(Employee e) throws SQLException {
		ps = connection.prepareStatement("insert into users(name,password,email,country) values(?,?,?,?)");
		ps.setString(1, e.getName());
		ps.setString(2, e.getPassword());
		ps.setString(3, e.getEmail());
		ps.setString(4, e.getCountry());
		ps.executeUpdate();
	}

	@Override
	public void deleteEmployee(int id) throws SQLException {
		ps = connection.prepareStatement("delete from users where id=?");
		ps.setInt(1, id);
		ps.executeUpdate();
	}

	@Override
	public Employee getEmploye(int id) throws SQLException {
		ps = connection.prepareStatement("select * from users where id=?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		rs.next();
		Employee e = (new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
		return e;
	}

	@Override
	public void editEmploye(Employee e) throws SQLException {
		ps = connection.prepareStatement("update users set name=?,password=?,email=?,country=? where id=?");
		ps.setString(1, e.getName());
		ps.setString(2, e.getPassword());
		ps.setString(3, e.getEmail());
		ps.setString(4, e.getCountry());
		ps.setInt(5, e.getId());
		ps.executeUpdate();

	}

	@Override
	public int findEmploye(String name, String password) throws SQLException {
		ps = connection.prepareStatement("select * from users where name=? && password=?");
		ps.setString(1, name);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		int count =0;
		while(rs.next()) {
			count++;
			
		}
		return count;
		
	}
}
