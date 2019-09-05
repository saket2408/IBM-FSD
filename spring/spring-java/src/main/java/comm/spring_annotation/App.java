package comm.spring_annotation;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import comm.spring_annotation.bean.Employee;


public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
        Employee e = context.getBean("employee", Employee.class);
        System.out.println(e.getWorkOut());
        System.out.println(e.getName()+"-------"+e.getEmail());
        System.out.println(e.getFortune());
        context.close();
    }
}
