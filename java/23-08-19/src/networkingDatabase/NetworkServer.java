package networkingDatabase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import jdbc.model.Employee;
import jdbc.service.EmployeeService;
import jdbc.service.EmployeeServiceImpl;

public class NetworkServer {

	public static void main(String[] args) {
		ServerSocket server = null;
		Socket client;

		// Default port number we are going to use
		int portnumber = 1234;

		// Create Server side socket
		try {
			server = new ServerSocket(portnumber);
		} catch (IOException ie) {
			System.out.println("Cannot open socket." + ie);
			System.exit(1);
		}
		System.out.println("ServerSocket is created on" + portnumber);

		// Wait for the data from the client and reply
		while (true) {

			try {

				// Listens for a connection to be made to
				// this socket and accepts it. The method blocks until
				// a connection is made
				System.out.println("Waiting for connect request...");
				client = server.accept();

				System.out.println("Connect request is accepted...");
				String clientHost = client.getInetAddress().getHostAddress();
				int clientPort = client.getPort();
				System.out.println("Client host = " + clientHost + " Client port = " + clientPort);

				// Read data from the client
				InputStream clientIn = client.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(clientIn));
				String msgFromClient = br.readLine();
				System.out.println("Message received from client = " + msgFromClient);

				// Send response to the client
				if (msgFromClient != null && !msgFromClient.equalsIgnoreCase("bye")) {
					OutputStream clientOut = client.getOutputStream();
					PrintWriter pw = new PrintWriter(clientOut, true);
					int ansMsg = Integer.parseInt(msgFromClient);
					EmployeeService s = new EmployeeServiceImpl();
					Employee s1 = new Employee();
					s1 = s.getEmployeeById(ansMsg);
					if(s1!=null) {
					pw.println(s1.getId()+ " "+s1.getFirstName()+" "+s1.getLastName()+ " "+ s1.getEmail());
				}
					else {
						pw.println("not found!!");
					}
				}

				// Close sockets
				if (msgFromClient != null && msgFromClient.equalsIgnoreCase("bye")) {
					server.close();
					client.close();
					break;
				}

			} catch (IOException ie) {
			}
		}
	}

}
