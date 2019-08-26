package multicasting;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.awt.event.ActionEvent;

public class MultiClient {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MultiClient window = new MultiClient();
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
	public MultiClient() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(38, 11, 343, 126);
		frame.getContentPane().add(textArea);

		JButton btnSend = new JButton("send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Default port number we are going to use
				int portnumber = 1236;

				try {
					// Create a MulticastSocket
					MulticastSocket chatMulticastSocket = new MulticastSocket(portnumber);

					// Determine the IP address of a host, given the host name
					InetAddress group = InetAddress.getByName("224.0.0.1");

					// Joins a multicast group
					chatMulticastSocket.joinGroup(group);

					// Prompt a user to enter a message
					String msg = textArea.getText();
					

					// Send the message to Multicast address
					DatagramPacket data = new DatagramPacket(msg.getBytes(), 0, msg.length(), group, portnumber);
					chatMulticastSocket.send(data);

					// Close the socket
					chatMulticastSocket.close();
				}

				catch (Exception ee) {
					ee.printStackTrace();
				}
			}
		});
		btnSend.setBounds(178, 167, 89, 23);
		frame.getContentPane().add(btnSend);
	}

}
