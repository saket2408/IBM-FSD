package networkingDatabase;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
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
import javax.swing.JTable;

public class NetworkClient {

	private JFrame frame;
	private JTextField textField;
	private JTable table;
	private JScrollPane scrollPane;
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
		textField.setBounds(119, 11, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterId = new JLabel("Enter id:");
		lblEnterId.setBounds(31, 17, 46, 14);
		frame.getContentPane().add(lblEnterId);
		
		JButton btnFindEmployee = new JButton("Find employee");
		btnFindEmployee.addActionListener(new ActionListener() {
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
	               
	                String result = br.readLine();
	                System.out.println(result);
	                if(result.equals("not found!!")) {
	                	JOptionPane.showMessageDialog(frame, "hello " + result);
	                	table.setVisible(false);
	                }
	                else {
	                	 String[][] a = new String[1][4];
	                a[0]= result.split("\\s");
	                String[] column={"ID","FIRST NAME","LAST NAME", "EMAIL"};
	                table = new JTable(a, column);
	                scrollPane = new JScrollPane();
	        		scrollPane.setBounds(72, 144, 288, 77);
	        		frame.getContentPane().add(scrollPane);
	        		scrollPane.setViewportView(table);
	                }
				} catch (UnknownHostException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnFindEmployee.setBounds(119, 81, 122, 23);
		frame.getContentPane().add(btnFindEmployee);
		
		
		//frame.getContentPane().add(textArea);
	}

}
