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

public class AdminLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AdminLogin page");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 15));
		lblNewLabel.setBounds(151, 29, 134, 20);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(207, 59, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Admin Name");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNewLabel_1.setBounds(73, 62, 91, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNewLabel_2.setBounds(73, 98, 91, 13);
		contentPane.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(207, 103, 96, 19);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 10));
		btnNewButton.setBounds(73, 171, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setFont(new Font("Calibri", Font.BOLD, 10));
		btnNewButton_1.setBounds(207, 169, 85, 21);
		contentPane.add(btnNewButton_1);

	}

}
