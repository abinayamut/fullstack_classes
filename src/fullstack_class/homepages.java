package fullstack_class;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class homepages extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepages frame = new homepages();
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
	public homepages() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(128, 128, 192));
		contentPane.setBorder(new EmptyBorder(8, 8, 9, 9));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HR SYSTEM");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel.setBounds(155, 25, 92, 27);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("UserLogin");
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(134, 77, 124, 27);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("AdminLogin");
		btnNewButton_1.setFont(new Font("Calibri", Font.BOLD, 12));
		btnNewButton_1.setBounds(134, 127, 124, 27);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("RegisterLogin");
		btnNewButton_2.setFont(new Font("Calibri", Font.BOLD, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(134, 182, 124, 27);
		contentPane.add(btnNewButton_2);

	}
}
