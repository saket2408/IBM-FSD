package comm.myCompany.first_spring_project;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import comm.myCompany.first_spring_project.beans.BaseballCoach;
import comm.myCompany.first_spring_project.beans.CricketCoach;
import comm.myCompany.first_spring_project.beans.Employee;


public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BaseballCoach coach = context.getBean("baseballCoach" , BaseballCoach.class);
        System.out.println(coach.getWorkout());
        
        Employee emp = context.getBean("theEmployee" , Employee.class);
        System.out.println(emp);
        CricketCoach coach1 = context.getBean("cricCoach", CricketCoach.class);
        System.out.println(coach1.getWorkout()+"----------"+coach1.getDailyfortune());
        System.out.println(coach1.getName()+" -- "+coach1.getEmail());
        context.close();
    }
}
