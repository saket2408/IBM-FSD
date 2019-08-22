package objectInputOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputOutput e = new ObjectInputOutput("10", "saket", "2000", "mumbai", new ObjectInputOutput());
		ObjectInputOutput e1 = new ObjectInputOutput("11", "saket1", "20001", "mumbai1", new ObjectInputOutput());
		ObjectInputOutput e2 = new ObjectInputOutput("12", "saket2", "20002", "mumbai2", new ObjectInputOutput());
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.out"));
		out.writeObject(e);
		out.writeObject(e1);
		out.writeObject(e2);
		out.flush();
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.out"));
		e = (ObjectInputOutput) in.readObject();
		try {
			while(e != null) {
				System.out.println("written==" + e);
				e=(ObjectInputOutput) in.readObject();
			}
			
		} catch (Exception a2) {
			System.exit(0);
		}
		
	}

}
