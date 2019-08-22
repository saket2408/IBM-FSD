package fileInputOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileInputOutputStream {

	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream(new File("inputstream.txt"));
		FileOutputStream out = new FileOutputStream(new File("outputstream.txt"));
		int c;
		
		while((c=in.read())!= -1) {
			System.out.println(c);
			out.write(c);
		}
		
		in.close();
		out.close();
	}

}
