package jdbc;

import java.sql.Connection;
import java.sql.*;
import java.sql.SQLException;
import java.util.*;

public class JdbcDemo {

	private static Properties properties = null;

	static {
		properties = new Properties();
		properties.put("URL", "jdbc:mysql://localhost:3306/mydb");
		properties.put("username", "root");
		properties.put("password", "admin");

	}

	public static void main(String args[]) throws SQLException {
		Connection connection = DriverManager.getConnection(properties.getProperty("URL"),
				properties.getProperty("username"), properties.getProperty("password"));
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from students");
		System.out.println("ID NAME");
		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2));
		}
	}

}
