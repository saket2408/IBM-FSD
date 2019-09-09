package comm.spring.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.annotation.PostConstruct;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import comm.spring.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private Session session;
	private List<Customer> list =new ArrayList<Customer>(); 

	@PostConstruct
	public void setSession() {
		session = sessionFactory.openSession();
	}

	public CustomerDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void createCustomer(Customer customer) {
		session.saveOrUpdate(customer);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Customer> viewCustomers() {
		list = session.createQuery("from Customer").getResultList();
		return list;

	}

	@Transactional
	public void deleteCustomer(int id) {
		Customer e = session.get(Customer.class, id);
			//session.delete(e);
		session.getTransaction().begin();
			session.remove(e);
			session.getTransaction().commit();
	}

	public Customer getCustomer(int id) {
		Customer e = session.get(Customer.class, id);
		return e;
	}
	
	public void update(int id , Customer customer) {
		Customer c = new Customer(id,customer.getFirstName(),customer.getLastName(),customer.getEmail());
		session.getTransaction().begin();
		session.merge(c);
		session.getTransaction().commit();

	}

	@SuppressWarnings("unchecked")
	public List<Customer> search(String key){
		session.getTransaction().begin();
		javax.persistence.Query query = session.createQuery("from Customer e where e.firstName like '%"+key+"%' or e.lastName like '%"+key+"%' or e.email like '%"+key+"%'");
		list = query.getResultList();
		session.getTransaction().commit();
		return list;

	}

}
