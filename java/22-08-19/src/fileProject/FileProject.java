package fileProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class FileProject {

	private JFrame frmFileSystem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileProject window = new FileProject();
					window.frmFileSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FileProject() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFileSystem = new JFrame();
		frmFileSystem.setTitle("file system");
		frmFileSystem.setBounds(100, 100, 547, 386);
		frmFileSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFileSystem.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(55, 11, 413, 213);
		frmFileSystem.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnSave = new JButton("save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileWriter out = new FileWriter(new File("out.txt"));
					String s = textArea.getText();
					for(int i = 0; i<s.length();i++) {
						out.write(s.charAt(i));
					}
					out.close();
					textArea.setText("");
				} catch (IOException e1) { 
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSave.setBounds(86, 262, 89, 23);
		frmFileSystem.getContentPane().add(btnSave);
		
		JButton btnRead = new JButton("read");
		btnRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileReader in = new FileReader(new File("out.txt"));
					int c;
					String s ="";
					while((c=in.read())!=-1) {
						s=s+ (char)c;
					}
					textArea.setText(s);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnRead.setBounds(262, 262, 89, 23);
		frmFileSystem.getContentPane().add(btnRead);
	}
}
