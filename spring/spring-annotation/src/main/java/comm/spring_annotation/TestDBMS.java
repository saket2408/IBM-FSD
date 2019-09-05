package comm.spring_annotation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import comm.spring_annotation.bean.empService;

public class TestDBMS {

	public static void main(String[] args){
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		 empService service=context.getBean("empService",empService.class);
		try {
			service.createEmployee("rahul", "Dravid", "wall@gg.com");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
