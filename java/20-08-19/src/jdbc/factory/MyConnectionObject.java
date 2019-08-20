package jdbc.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class MyConnectionObject {
	private static Connection connection=null;
	private static MyConnectionObject connectionObject=null;

	
	private MyConnectionObject() throws SQLException {
		connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "admin");
	}

		
	public static MyConnectionObject createObject() throws SQLException{
		if(connectionObject == null) {
			connectionObject = new MyConnectionObject();
		}
			return connectionObject;
		
	}
	
	public Connection getconnectionObject() {
		return connection;
	}
	
	
	
	
}