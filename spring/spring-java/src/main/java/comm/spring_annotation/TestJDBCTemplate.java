package comm.spring_annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import comm.spring_annotation.bean.empService;
import comm.spring_annotation.bean.empService_02;

public class TestJDBCTemplate {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
		 empService_02 service=context.getBean("empService02",empService_02.class);
		 service.createEmployee("sachin", "tendulkar", "god@gg.com");
		 service.deleteEmployee(26);
	}

}
