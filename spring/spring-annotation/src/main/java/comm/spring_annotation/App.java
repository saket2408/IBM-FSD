package comm.spring_annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import comm.spring_annotation.bean.Employee;


public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee e = context.getBean("employee", Employee.class);
        System.out.println(e.getWorkOut());
        System.out.println(e.getName()+"-------"+e.getEmail());
        System.out.println(e.getFortune());
        context.close();
    }
}
