package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class MyconnectionObject {
	private static Connection connection=null;
	private static MyconnectionObject connectionObject=null;

	
	private MyconnectionObject() throws SQLException {
		connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "admin");
	}

		
	public static MyconnectionObject createObject() throws SQLException{
		if(connectionObject == null) {
			connectionObject = new MyconnectionObject();
		}
			return connectionObject;
		
	}
	
	public Connection getconnectionObject() {
		return connection;
	}
	
	
	
	
}
