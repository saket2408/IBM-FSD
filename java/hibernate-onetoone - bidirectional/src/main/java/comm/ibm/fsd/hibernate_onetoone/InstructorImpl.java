package comm.ibm.fsd.hibernate_onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class InstructorImpl {

	private SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	
	public void addInstructordetail(InstructorDetail instructordetail) {
		
		 Session session = factory.getCurrentSession();
		 session.getTransaction().begin();
		 session.persist(instructordetail);
		 session.getTransaction().commit();
		 session.close();
	}

	public void deleteInstructorDetail(int id)
	{
		 Session session = factory.getCurrentSession();
		 session.getTransaction().begin();
		 InstructorDetail detail = session.get(InstructorDetail.class, id);
		 if(detail!=null) {
			 session.delete(detail);
		 }
		 session.getTransaction().commit();
		 session.close();
	}
	
	public void getInstructorDetail(int id) {
		Session session = factory.getCurrentSession();
		 session.getTransaction().begin();
		 InstructorDetail detail = session.get(InstructorDetail.class, id);
		 if(detail!=null) {
			 System.out.println(detail);
		 }
		 session.getTransaction().commit();
		 session.close();
	}
}
