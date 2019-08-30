package comm.ibm.fsd.crud_maven;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Methods {

	private SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
			.addAnnotatedClass(Employee.class).buildSessionFactory();
	private Session session = factory.openSession();
	private List<Employee> list;

	@SuppressWarnings("unchecked")
	public void getAllEmployee() {
		list = session.createQuery("from Employee").getResultList();

		for (Employee e : list) {
			System.out.println(e);
		}

	}

	public void addEmployee(Employee e) {
		session.getTransaction().begin();
		session.save(e);
		session.getTransaction().commit();
		System.out.println("saved");
	}

	public void findEmployee(int id) {
		session.getTransaction().begin();
		Employee e = session.get(Employee.class, id);
		if (e != null) {
			System.out.println(e);
		} else {
			System.out.println("not found");
		}
		session.getTransaction().commit();
	}

	public void deleteEmployee(int id) {
		session.getTransaction().begin();
		Employee e = session.get(Employee.class, id);
		if (e != null) {
			session.delete(e);
			System.out.println("deleted");
		} else {
			System.out.println("id doesn't exists");
		}
		session.getTransaction().commit();
	}

	public void updateEmployee(int id, String fname, String lastname, String email) {
		session.getTransaction().begin();
		Employee e = session.get(Employee.class, id);
		if (e != null) {
			e.setFirstName(fname);
			e.setLastName(lastname);
			e.setEmail(email);
			session.merge(e);
			System.out.println("updated");
		} else {
			System.out.println("id not found..");
		}
		session.getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	public void findByName(String fname) {
		session.getTransaction().begin();
		Query query = session.createQuery("from Employee e where e.firstName=:fname");
		query.setParameter("fname", fname);
		list = query.getResultList();
		for (Employee e : list) {
			System.out.println(e);
		}
		session.getTransaction().commit();

	}

}
