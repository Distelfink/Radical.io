package framestuff;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;

/**
 * The Class newContact. - Add a new contact
 */
public class newContact extends JFrame{
	
	
	
	private JPanel contentPane;
	private JTextField firstNameTxtFld;
	private JTextField lastNameTxtFld;
	private JTextField companyTxtFld;
	private JTextField phoneNumberTxtFld;

	/**
	 * Launch the application.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					newContact frame = new newContact();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	
	/**
	 * New contact - add contact details
	 */
	public newContact()  {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 320);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel newContactLbl = new JLabel("New Contact");
		newContactLbl.setHorizontalAlignment(SwingConstants.CENTER);
		newContactLbl.setFont(new Font("Avenir", Font.PLAIN, 20));
		newContactLbl.setBounds(120, 11, 251, 33);
		contentPane.add(newContactLbl);
		
		JLabel firstNameLbl = new JLabel("First Name");
		firstNameLbl.setFont(new Font("Avenir", Font.PLAIN, 12));
		firstNameLbl.setBounds(26, 64, 86, 14);
		contentPane.add(firstNameLbl);
		
		firstNameTxtFld = new JTextField();
		firstNameTxtFld.setColumns(10);
		firstNameTxtFld.setBounds(26, 78, 212, 33);
		contentPane.add(firstNameTxtFld);
		
		JLabel lastNameLbl = new JLabel("Last Name");
		lastNameLbl.setFont(new Font("Avenir", Font.PLAIN, 12));
		lastNameLbl.setBounds(26, 122, 135, 14);
		contentPane.add(lastNameLbl);
		
		lastNameTxtFld = new JTextField();
		lastNameTxtFld.setColumns(10);
		lastNameTxtFld.setBounds(26, 136, 212, 33);
		contentPane.add(lastNameTxtFld);
		
		JLabel companylbl = new JLabel("Company");
		companylbl.setFont(new Font("Avenir", Font.PLAIN, 12));
		companylbl.setBounds(248, 64, 86, 14);
		contentPane.add(companylbl);
		
		companyTxtFld = new JTextField();
		companyTxtFld.setColumns(10);
		companyTxtFld.setBounds(248, 78, 212, 33);
		contentPane.add(companyTxtFld);
		
		JLabel phoneNumberLbl = new JLabel("Phone Number");
		phoneNumberLbl.setFont(new Font("Avenir", Font.PLAIN, 12));
		phoneNumberLbl.setBounds(248, 122, 86, 14);
		contentPane.add(phoneNumberLbl);
		
		phoneNumberTxtFld = new JTextField();
		phoneNumberTxtFld.setColumns(10);
		phoneNumberTxtFld.setBounds(248, 136, 212, 33);
		contentPane.add(phoneNumberTxtFld);
		
		JLabel contactAdded = new JLabel("");
		contactAdded.setBounds(185, 243, 251, 27);
		contentPane.add(contactAdded);
		
		JButton buttonSave = new JButton("Save");
		buttonSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contactAdded.setText("Contact added");
				contactAdded.setFont(new Font("Avenir", Font.PLAIN, 14));
				String text=firstNameTxtFld.getText();
				firstNameTxtFld.setText("");
				} 
			
		});
		buttonSave.setFont(new Font("Avenir", Font.PLAIN, 14));
		buttonSave.setBounds(83, 192, 103, 22);
		contentPane.add(buttonSave);
		
		JButton cancelbtn = new JButton("Cancel");
		cancelbtn.setFont(new Font("Avenir", Font.PLAIN, 14));
		
		cancelbtn.setBounds(299, 192, 103, 22);
		contentPane.add(cancelbtn);
		
	
	}




	 
}

		


