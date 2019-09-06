package comm.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component(value = "empService02")
public class empService_02 {
	@Autowired
	private JdbcTemplate jTemplate;
	private String query;
	private List<Employee> list = new ArrayList<Employee>();
		
		
	public void createEmployee(Employee employee) {
		query = "insert into employee(firstname,lastname,email) values(?,?,?)";
		Object[] obj = { employee.getFirstName(),employee.getLastName(),employee.getEmail()};
		jTemplate.update(query, obj);
		System.out.println("inserted");
	}
	
	public List<Employee> getEmployee() throws SQLException{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		 DataSource datasource = (DataSource) context.getBean("datasource");
		 Connection con = datasource.getConnection();
		 Statement statement = con.createStatement();
		 ResultSet rs = statement.executeQuery("select * from employee");
		 while(rs.next()) {
			 list.add(new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
		 }
		 return list;
	}
	
	public List<Employee> searchEmployee(String pattern) throws SQLException{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		 DataSource datasource = (DataSource) context.getBean("datasource");
		 Connection con = datasource.getConnection();
		 PreparedStatement ps = con.prepareStatement("select * from employee where firstname like '%"+pattern+"%' || lastname like '%"+pattern+"%' || email like '%"+pattern+"%'");
		 ResultSet rs = ps.executeQuery();
		 while(rs.next()) {
			 list.add(new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
		 }
		 return list;
	}
	
	
	

	
}
