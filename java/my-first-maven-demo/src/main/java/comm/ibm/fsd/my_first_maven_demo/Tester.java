package comm.ibm.fsd.my_first_maven_demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Tester {
	public static void main(String[] args) {
		try {
			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").
					addAnnotatedClass(Employee.class).buildSessionFactory();
			Session session = factory.openSession();
			Employee emp = new Employee("sachin" , "tendulkar" , "god@gg.com");
			session.getTransaction().begin();
			session.persist(emp);
			System.out.println("inserted...!!");
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
