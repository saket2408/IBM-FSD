package comm.spring_annotation.bean;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component(value = "jTemplate")
public class MyJDBCtemplate extends JdbcTemplate {
	
	@Autowired
	private DataSource dataSource;
	@PostConstruct
	public void myInit()
	{
		setDataSource(dataSource);
	}

}
