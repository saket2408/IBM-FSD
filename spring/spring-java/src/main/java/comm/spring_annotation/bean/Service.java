package comm.spring_annotation.bean;

import org.springframework.stereotype.Component;

@Component
public class Service {
	public String getFortune() {
		return "great year ahead!!";
	}
}
