package comm.spring_annotation.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "employee")
public class Employee {
	@Value(value = "saket")
	private String name;
	@Value(value = "ss@gg.com")
	private String email;
	@Autowired
	private Service service;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWorkOut() {
		return "dfgeafiuwqkdj";
	}
	
	public String getFortune() {
		return service.getFortune();
	}
	@PostConstruct
	public void sayHello() {
		System.out.println("hello");
	}
	@PreDestroy
	public void sayGoodbye() {
		System.out.println("goodbye!!");
	}
}
