package comm.ibm.fsd.hibernate_onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class InstructorImpl {

	public void addInstructor(Instructor instructor) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		 Session session = factory.getCurrentSession();
		 session.getTransaction().begin();
		 session.persist(instructor);
		 session.getTransaction().commit();
		 session.close();
	}

}
