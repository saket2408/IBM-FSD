package frameUsingBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import jdbc.model.Employee;
import jdbc.service.EmployeeService;
import jdbc.service.EmployeeServiceImpl;

import com.jgoodies.forms.layout.FormSpecs;
import net.miginfocom.swing.MigLayout;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class DemiFrame {

	private JFrame frmFdf;
	private JTextField textField;
	private JTextField textField_1;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private JTextField textField_2;
	private JTextField textField_3;
	private EmployeeService service = new EmployeeServiceImpl();
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemiFrame window = new DemiFrame();
					window.frmFdf.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DemiFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFdf = new JFrame();
		frmFdf.setTitle("CRUD employee");
		frmFdf.setBounds(100, 100, 735, 300);
		frmFdf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFdf.getContentPane().setLayout(null);
		
		JLabel lblUserName = new JLabel("Employee ID:");
		lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUserName.setBounds(10, 21, 109, 22);
		frmFdf.getContentPane().add(lblUserName);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(129, 22, 200, 19);
		frmFdf.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(129, 64, 200, 20);
		frmFdf.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				service.createEmployee(new Employee(Integer.parseInt(textField.getText().toString()), textField_1.getText(),textField_2.getText() , textField_3.getText()));
				JOptionPane.showMessageDialog(frmFdf, "success: " + textField_3.getText().toString() + " successfully added!!");
			}
		});
		btnSubmit.setBackground(Color.LIGHT_GRAY);
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSubmit.setBounds(30, 227, 89, 23);
		frmFdf.getContentPane().add(btnSubmit);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(161, 227, 109, 23);
		frmFdf.getContentPane().add(btnNewButton);
		
		JLabel lblFirstName = new JLabel("First Name: ");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFirstName.setBounds(10, 67, 99, 14);
		frmFdf.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name: ");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLastName.setBounds(10, 117, 99, 14);
		frmFdf.getContentPane().add(lblLastName);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(129, 111, 200, 20);
		frmFdf.getContentPane().add(textField_2);
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmail.setBounds(10, 162, 99, 14);
		frmFdf.getContentPane().add(lblEmail);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(129, 156, 200, 20);
		frmFdf.getContentPane().add(textField_3);
		
		JLabel label = new JLabel("Employee ID:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(519, 21, 109, 22);
		frmFdf.getContentPane().add(label);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_4.setColumns(10);
		textField_4.setBounds(468, 54, 200, 19);
		frmFdf.getContentPane().add(textField_4);
		
		JButton btnFindElementBy = new JButton("Find element by id");
		btnFindElementBy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				Employee e = service.getEmployeeById(Integer.parseInt(textField_4.getText().toString()));
				if(e==null) {
					JOptionPane.showMessageDialog(frmFdf, "error: not found!!");
				}
				else {
					textField.setText(""+e.getId()+"");
					textField_1.setText(e.getFirstName());
					textField_2.setText(e.getLastName());
					textField_3.setText(e.getEmail());
				}
			}
		});
		btnFindElementBy.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnFindElementBy.setBackground(Color.LIGHT_GRAY);
		btnFindElementBy.setBounds(468, 94, 200, 23);
		frmFdf.getContentPane().add(btnFindElementBy);
		
		JButton btnDeleteElementBy = new JButton("delete element by id");
		btnDeleteElementBy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int count = service.deleteEmployee(Integer.parseInt(textField_4.getText().toString()));
				if(count == 1) {
					JOptionPane.showMessageDialog(frmFdf, "success: employee deleted!!");
				}
				else {
					JOptionPane.showMessageDialog(frmFdf, "error: not found!!");
				}
			}
		});
		btnDeleteElementBy.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDeleteElementBy.setBackground(Color.LIGHT_GRAY);
		btnDeleteElementBy.setBounds(468, 128, 200, 23);
		frmFdf.getContentPane().add(btnDeleteElementBy);
		
		JButton btnUpdateElementBy = new JButton("update");
		btnUpdateElementBy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int count = service.updateEmployee(new Employee(Integer.parseInt(textField.getText().toString()), textField_1.getText(),textField_2.getText() , textField_3.getText()));
				if(count == 1) {
					JOptionPane.showMessageDialog(frmFdf, "success: employee updated!!");
				}
				else {
					JOptionPane.showMessageDialog(frmFdf, "error: not found!!");
				}
			}
		});
		btnUpdateElementBy.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnUpdateElementBy.setBackground(Color.LIGHT_GRAY);
		btnUpdateElementBy.setBounds(325, 227, 117, 23);
		frmFdf.getContentPane().add(btnUpdateElementBy);
		
		JButton btnShowEmployee = new JButton("show employee");
		btnShowEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new DemiFrame2();
			}
		});
		btnShowEmployee.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnShowEmployee.setBackground(Color.LIGHT_GRAY);
		btnShowEmployee.setBounds(505, 227, 163, 23);
		frmFdf.getContentPane().add(btnShowEmployee);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "SwingAction_1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
