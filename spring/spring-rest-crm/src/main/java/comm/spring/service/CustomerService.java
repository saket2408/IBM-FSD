package comm.spring.service;

import java.util.List;

import comm.spring.entity.Customer;

public interface CustomerService {
	public void createCustomer(Customer customer);
	public List<Customer> viewCustomers();
	public void deleteCustomer(int id);
	public Customer getCustomer(int id);
	public void update(Customer customer);
}
