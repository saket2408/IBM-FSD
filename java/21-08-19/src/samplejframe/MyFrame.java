package samplejframe;

import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
	private JLabel label1;
	private JTextField textField1;
	private JButton button1;

	public MyFrame() throws HeadlessException {

		this.setTitle("my first JFrame");
		this.setSize(350,400);
		this.setLayout(new FlowLayout());
		label1 = new JLabel("Enter your name: ");
		textField1 = new  JTextField(25);
		button1 = new JButton("Say hello");
		button1.addActionListener(this);
		this.add(label1);
		this.add(textField1);
		this.add(button1);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JOptionPane.showMessageDialog(this, "hello " + textField1.getText());
		
	}

	

}
