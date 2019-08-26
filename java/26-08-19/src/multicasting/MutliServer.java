package multicasting;

import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;

public class MutliServer {

	private JFrame frame;
	private JTextArea textArea = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MutliServer window = new MutliServer();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MutliServer() {
		initialize();
		
	}
	
	public void serverMethod() throws IOException {
		textArea.setText("djndsn");
		int portnumber = 1236;
		String s = "";
		// Create a MulticastSocket
		MulticastSocket serverMulticastSocket = null;
		
			serverMulticastSocket = new MulticastSocket(portnumber);
				System.out.println("MulticastSocket is created...");
				s+= "MulticastSocket is created...";

		// Determine the IP address of a host, given the host name
		InetAddress group;
			group = InetAddress.getByName("224.0.0.1");
		

		// getByName- returns IP address of given host
			serverMulticastSocket.joinGroup(group);
		System.out.println("joinGroup method is called...");
		s+="\njoinGroup method is called... ";
		
		while(true) {
		// Continually receives data and prints them
			byte buf[] = new byte[1024];
			DatagramPacket data = new DatagramPacket(buf, buf.length);
				serverMulticastSocket.receive(data);
			String msg = new String(data.getData()).trim();
			System.out.println("Message received from client = " + msg);
			s+= "\n Message received from client = " +msg;
			textArea.setText(s);

		}	
		
		//serverMulticastSocket.close();
	
		
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

		JButton btnStartServer = new JButton("Start Server");
		btnStartServer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				
			    try {
				serverMethod();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
			   
			}
		});
		btnStartServer.setBounds(225, 191, 111, 23);
		frame.getContentPane().add(btnStartServer);

		textArea.setBounds(76, 22, 287, 145);
		frame.getContentPane().add(textArea);
	}

}
