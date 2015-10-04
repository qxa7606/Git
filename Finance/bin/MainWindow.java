import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MainWindow {

	private JFrame frame;
	private JTextField txtFpts;
	private JFormattedTextField UserName;
	private JPasswordField PassWord;
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
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
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 824, 546);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtFpts = new JTextField();
		txtFpts.setBackground(Color.LIGHT_GRAY);
		txtFpts.setHorizontalAlignment(SwingConstants.CENTER);
		txtFpts.setFont(new Font("Tahoma", Font.PLAIN, 31));
		txtFpts.setText("FPTS");
		txtFpts.setBounds(202, 11, 397, 68);
		frame.getContentPane().add(txtFpts);
		txtFpts.setColumns(10);
		
		JButton btnSignIn = new JButton("Sign in");
		btnSignIn.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, UserName.getText() + "\n" + PassWord.getText());
			}
		});
		btnSignIn.setBounds(352, 350, 89, 23);
		frame.getContentPane().add(btnSignIn);
		
		UserName = new JFormattedTextField();
		UserName.setBounds(323, 171, 135, 23);
		frame.getContentPane().add(UserName);
		
		PassWord = new JPasswordField();
		PassWord.setBounds(323, 205, 135, 28);
		frame.getContentPane().add(PassWord);
		
		txtUsername = new JTextField();
		txtUsername.setBackground(SystemColor.control);
		txtUsername.setText("Username");
		txtUsername.setBounds(201, 172, 86, 20);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setText("Password");
		txtPassword.setBounds(201, 209, 86, 20);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
	}
}
