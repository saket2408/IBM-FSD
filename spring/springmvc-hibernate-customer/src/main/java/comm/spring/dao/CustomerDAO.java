package comm.spring.dao;

import java.util.List;

import comm.spring.entity.Customer;

public interface CustomerDAO {
	public void createCustomer(Customer customer);
	public List<Customer> viewCustomers();
	public void deleteCustomer(int id);
	public Customer getCustomer(int id);
	public void update(int id, Customer customer);
	public List<Customer> search(String key);
}
