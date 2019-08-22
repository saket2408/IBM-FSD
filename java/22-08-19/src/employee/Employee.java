package employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import jdbc.service.EmployeeService;
import jdbc.service.EmployeeServiceImpl;

public class Employee {
	private BufferedReader	reader;
	private String[] strArray = new String[4];
	private EmployeeService e = new EmployeeServiceImpl();

	public void addEmployee(String source) throws IOException {
		reader = new BufferedReader(new FileReader(source));
        String string =reader.readLine();
        while(string!=null) {
        strArray = string.split("\\s");
        e.createEmployee(new jdbc.model.Employee(Integer.parseInt(strArray[0]), strArray[1], strArray[2], strArray[3]));
        string = reader.readLine();
        }
        reader.close();
	}

	public static void main(String[] args) throws IOException {
		Employee e = new Employee();
		e.addEmployee("employee.src");
		System.out.println("added!!");
	}
}
