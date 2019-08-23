package networking;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;

public class NetworkClient {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NetworkClient window = new NetworkClient();
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
	public NetworkClient() {
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

		textField = new JTextField();
		textField.setBounds(154, 11, 199, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblEnterNumber = new JLabel("Enter number:");
		lblEnterNumber.setBounds(47, 17, 83, 14);
		frame.getContentPane().add(lblEnterNumber);

		JButton btnCalculateFactorial = new JButton("calculate factorial");
		btnCalculateFactorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Socket client = null;

				// Default port number we are going to use
				int portnumber = 1234;
				try {
					client = new Socket(InetAddress.getLocalHost(), portnumber);
					OutputStream clientOut;
					clientOut = client.getOutputStream();
					PrintWriter pw = new PrintWriter(clientOut, true);
					 // Create an input stream of the client socket
	                InputStream clientIn = client.getInputStream();
	                BufferedReader br = new BufferedReader(new
	                        InputStreamReader(clientIn));
	                pw.println(textField.getText());
	                textField_1.setText(br.readLine());
				} catch (UnknownHostException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnCalculateFactorial.setBounds(164, 42, 156, 23);
		frame.getContentPane().add(btnCalculateFactorial);

		textField_1 = new JTextField();
		textField_1.setBounds(154, 110, 199, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblResult = new JLabel("Result:");
		lblResult.setBounds(47, 116, 46, 14);
		frame.getContentPane().add(lblResult);
	}

}
