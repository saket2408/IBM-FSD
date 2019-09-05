package comm.spring_annotation.bean;

import javax.annotation.PostConstruct;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.stereotype.Component;
@Component
public class DataSource extends BasicDataSource {

	@PostConstruct
	public void setter() {
		String user="root";
		String passsword="admin";
		String url="jdbc:mysql://localhost:3306/mydb";
		this.setUsername(user);
		this.setPassword(passsword);
		this.setUrl(url);
		
	}
	
}
