package fullstack_class;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Registerform extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registerform frame = new Registerform();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registerform() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 589);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Register Page");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel.setBounds(138, 33, 164, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User id");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_1.setBounds(95, 97, 87, 26);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(206, 99, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("User Name");
		lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_2.setBounds(95, 147, 87, 13);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(206, 142, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_3.setBounds(95, 190, 87, 26);
		contentPane.add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(206, 192, 96, 19);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_4.setBounds(95, 237, 87, 26);
		contentPane.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(206, 239, 96, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Email");
		lblNewLabel_5.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_5.setBounds(95, 284, 57, 26);
		contentPane.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(206, 286, 96, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 12));
		btnNewButton.setBounds(78, 396, 85, 26);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setFont(new Font("Calibri", Font.BOLD, 12));
		btnNewButton_1.setBounds(227, 397, 85, 25);
		contentPane.add(btnNewButton_1);

	}

}
