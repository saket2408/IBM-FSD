package jdbc.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import jdbc.factory.MyConnectionObject;
import jdbc.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private MyConnectionObject factory = null;
	private Connection connection = null;
	private PreparedStatement pStatement = null;
	private Statement statement = null;
	private ResultSet resultSet = null;

	public EmployeeDaoImpl() throws SQLException {

		super();
		factory = MyConnectionObject.createObject();
		connection = factory.getconnectionObject();

	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list = new ArrayList<Employee>();
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from employee");
			while (resultSet.next())
			{
				list.add(new Employee(resultSet.getInt(1), resultSet.getString(2),
						resultSet.getString(3), resultSet.getString(4)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Employee getEmployeeById(int id) {
		Employee e = null;
		resultSet = null;
		try {
			pStatement = connection.prepareStatement("select * from employee where id=?");
			pStatement.setInt(1, id);
			resultSet = pStatement.executeQuery();
			ResultSetMetaData dMetaData = resultSet.getMetaData();
			resultSet.next();
			 e = new Employee(resultSet.getInt(1), resultSet.getString(2),
					resultSet.getString(3), resultSet.getString(4));
		} catch (SQLException s) {
			s.printStackTrace();
		}	
		
		return e;

	}
	
	@Override
	public void createEmployee(Employee employee) {
		try {
			pStatement = connection.prepareStatement("insert into employee values(?,?,?,?)");
			pStatement.setInt(1, employee.getId());
			pStatement.setString(2, employee.getFirstName());
			pStatement.setString(3, employee.getLastName());
			pStatement.setString(4, employee.getEmail());
			pStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("duplicate id");
			e.printStackTrace();
		} finally {
		}
	}
	
	@Override
	public void getConnectioninfo() {
		try {
			DatabaseMetaData dMetaData = connection.getMetaData();
			System.out.println(dMetaData.getDatabaseMajorVersion());
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}
	
	@Override
	public int deleteEmployee(int id)  {
		int count = 0;
		try {
			pStatement = connection.prepareStatement("delete  from employee where ID= ?");
			pStatement.setInt(1, id);
			count = pStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}
	
	@Override
	public int updateEmployee(Employee employee) {
		int count=0;
		try {
			pStatement = connection.prepareStatement("update employee set firstname =?, lastname=?, email=? where ID=?");
			pStatement.setInt(4, employee.getId());
			pStatement.setString(1, employee.getFirstName());
			pStatement.setString(2, employee.getLastName());
			pStatement.setString(3, employee.getEmail());
			
			count = pStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
		
	}

}
