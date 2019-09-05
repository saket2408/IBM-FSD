package comm.spring_annotation;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import comm.spring_annotation.bean.empService;

public class TestDBMS {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
		empService service = context.getBean("empService", empService.class);
		try {
			service.createEmployee("rahul", "Dravid", "wall@gg.com");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
