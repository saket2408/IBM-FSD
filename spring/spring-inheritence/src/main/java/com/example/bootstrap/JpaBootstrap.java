package com.example.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.model.ContractEmployee;
import com.example.model.Employee;
import com.example.model.PermanentEmployee;
import com.example.repository.ContractEmployeeRepository;
import com.example.repository.EmployeeRepository;
import com.example.repository.PermanentEmployeeRepository;

@Component
public class JpaBootstrap implements ApplicationListener<ContextRefreshedEvent>{

	private ContractEmployeeRepository contractEmployeeRepository;
	private EmployeeRepository employeeRepository;
	private PermanentEmployeeRepository permanentEmployeeRepository;
	
		

		public JpaBootstrap(ContractEmployeeRepository contractEmployeeRepository, EmployeeRepository employeeRepository,
			PermanentEmployeeRepository permanentEmployeeRepository) {
		super();
		this.contractEmployeeRepository = contractEmployeeRepository;
		this.employeeRepository = employeeRepository;
		this.permanentEmployeeRepository = permanentEmployeeRepository;
	}

		@Override
		public void onApplicationEvent(ContextRefreshedEvent event) {
			// TODO Auto-generated method stub
			init();
		}

		private void init() {
			Employee employee = new Employee("saket", "saxena","saket@gmail.com");
			employeeRepository.save(employee);
			PermanentEmployee pEmployee = new PermanentEmployee("ram", "murti", "ram@gg.com", 20000);
			permanentEmployeeRepository.save(pEmployee);
			ContractEmployee cEmployee = new ContractEmployee("anubhav", "patel", "anubhav@gg.com", "2000", "3 months");
			contractEmployeeRepository.save(cEmployee);

		}


	}



