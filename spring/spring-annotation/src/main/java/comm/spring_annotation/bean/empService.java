package comm.spring_annotation.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "empService")
public class empService {
	@Autowired
	private DataSource ds;

	public empService(DataSource ds) {
		super();
		this.ds = ds;
	}

	public void createEmployee(String fname, String lname, String email) throws SQLException {
		Connection conn = ds.getConnection();
		PreparedStatement pst = conn.prepareStatement("insert into employee(firstname,lastname,email) values(?,?,?)");
		pst.setString(1, fname);
		pst.setString(2, lname);
		pst.setString(3, email);
		pst.executeUpdate();
		System.out.println("inserted");
	}
}
