package fileEncryption;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Encryption e =new Encryption();
		e.encrypt("data.txt", "encrypt.txt", 4);
		e.showEncrypt("encrypt.txt");

	}

}
