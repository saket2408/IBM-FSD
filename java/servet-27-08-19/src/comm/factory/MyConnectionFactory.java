package comm.factory;

import java.sql.Connection;

import javax.sql.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;


public class MyConnectionFactory {

	private static DataSource datasource = null;
	private static Connection connection= null;
	public static Connection getMySqlConnection() {
		try {
			Context initcontext = new InitialContext();
			Object o = initcontext.lookup("java:/comp/env/jdbc/mysql");
			datasource = (DataSource) o;
			 connection = datasource.getConnection();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}
