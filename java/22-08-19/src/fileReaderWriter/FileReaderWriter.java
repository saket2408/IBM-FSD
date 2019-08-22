package fileReaderWriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	

	public static void main(String[] args) throws IOException {
		FileReader in = new FileReader(new File("filereader.txt"));
		FileWriter out = new FileWriter(new File("filewriter.txt"));
		int c;
		
		while((c=in.read())!= -1) {
			System.out.println((char)c);
			out.write(c);
		}
		
		in.close();
		out.close();

	}

}
