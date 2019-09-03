package comm.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CDImpl {

	public void addSpecial(SpecialEditionCD cd) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		 Session session = factory.getCurrentSession();
		 session.getTransaction().begin();
		 session.persist(cd);
		 session.getTransaction().commit();
		 session.close();
	}
	
	public void addInternational(InternationalCD cd) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		 Session session = factory.getCurrentSession();
		 session.getTransaction().begin();
		 session.persist(cd);
		 session.getTransaction().commit();
		 session.close();
	}

}
