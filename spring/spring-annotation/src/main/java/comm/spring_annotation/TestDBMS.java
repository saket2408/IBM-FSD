package comm.spring_annotation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDBMS {

	public static void main(String[] args) throws SQLException {
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		 DataSource ds = (DataSource) context.getBean("datasource");
		 Connection conn = ds.getConnection();
		 PreparedStatement pst = conn.prepareStatement("insert into employee(firstname) values('saket')");
		 pst.executeUpdate();
	}

}
