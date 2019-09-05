package comm.spring_annotation.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.mysql.cj.protocol.Resultset;

@Component(value = "empService02")
public class empService_02 {
	@Autowired
	private JdbcTemplate jTemplate;
	private String query;

	public void createEmployee(String fname, String lname, String email) {
		query = "insert into employee(firstname,lastname,email) values(?,?,?)";
		Object[] obj = { fname, lname, email };
		jTemplate.update(query, obj);
		System.out.println("inserted");
	}

	public void deleteEmployee(int id) {
		query = "delete from employee where id=?";
		Object[] obj = { id };
		jTemplate.update(query, obj);
		System.out.println("deleted");
	}
}
