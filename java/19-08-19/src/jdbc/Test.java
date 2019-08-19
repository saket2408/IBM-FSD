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

		do {
			System.out.println("Enter your Choice: \n" + "1. Add \n" + "2. view \n" + "3. delete \n" + "4. update");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				PreparedStatement pst = connection.prepareStatement("insert into students values(?,?)");
				System.out.println("enter item to add");
				System.out.println("ID: ");
				int id = scanner.nextInt();
				System.out.println("name: ");
				String name = scanner.next();
				pst.setInt(1, id);
				pst.setString(2, name);
				int count = pst.executeUpdate();
				System.out.println(count + " row(s) inserted!!");
				break;
			case 2:
				pst = connection.prepareStatement("select * from students");
				ResultSet resultSet = pst.executeQuery();
				System.out.println("ID NAME");
				while (resultSet.next()) {
					System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2));
				}
				break;
			case 3:
				pst = connection.prepareStatement("delete  from students where ID= ?");
				System.out.println("ID: ");
				id = scanner.nextInt();
				pst.setInt(1, id);
				count = pst.executeUpdate();
				System.out.println(count + " row(s) deleted!!");
				break;
			case 4:
				pst = connection.prepareStatement("update students set name =? where ID=?");
				System.out.println("ID where you want to update: ");
				id = scanner.nextInt();
				pst.setInt(2, id);
				System.out.println("enter name to update: ");
				name = scanner.next();
				pst.setString(1, name);
				count = pst.executeUpdate();
				System.out.println(count + " row(s) updated!!");
				break;

			}

		} while (true);

	}
}
