package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public abstract class Test {

	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		MyconnectionObject myconnectionObject = MyconnectionObject.createObject();
		Connection connection = myconnectionObject.getconnectionObject();
		PreparedStatement pst = connection.prepareStatement("insert into students values(?,?)");
		System.out.println("ID: ");
		int id = scanner.nextInt();
		System.out.println("name: ");
		String name = scanner.next();
		pst.setInt(1, id);
		pst.setString(2, name);
		int count = pst.executeUpdate();
		System.out.println(count + " row(s) inserted!!");
		
		pst = connection.prepareStatement("select * from students");
		ResultSet resultSet = pst.executeQuery();
		System.out.println("ID NAME");
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1)+" " + resultSet.getString(2));
		}
		

	}

}
