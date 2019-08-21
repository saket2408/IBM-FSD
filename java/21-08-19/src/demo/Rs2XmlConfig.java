package demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.factory.MyConnectionObject;

public class Rs2XmlConfig {
	private MyConnectionObject factory;
	private Connection connection;
	public Rs2XmlConfig() throws SQLException {
		super();
		factory = MyConnectionObject.createObject();
		connection = factory.getconnectionObject();
	}
	
	public ResultSet getAllEmployee() throws SQLException {
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery("select concat(firstname ,' ', lastname) name, email , departName from student full join department on departmentId = department.Id");
		return rs;
}
}
