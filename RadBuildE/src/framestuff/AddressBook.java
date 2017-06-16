package framestuff;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


import java.awt.SystemColor;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/**
 * The Class AddressBook; 
 *
 * @author Nelle Been
 */

public class AddressBook extends JFrame implements ActionListener { 


	
	private JFrame frame;
	
	
	private final ButtonGroup buttonGroup = new ButtonGroup();


	/**
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				try {
					AddressBook window = new AddressBook();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * AddressBook class landing page, options
	 */

	public AddressBook() {
		initialize();
	}


	/**
	 * Initialize the contents of the frame.
	 */




	private void initialize() {
	
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 500, 320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		
		JButton btnAddContacts = new JButton("Add Contacts");

		buttonGroup.add(btnAddContacts);		
		btnAddContacts.setFont(new Font("Avenir", Font.PLAIN, 17));
		btnAddContacts.setBounds(31, 103, 204, 28);
		frame.getContentPane().add(btnAddContacts);
		btnAddContacts.addActionListener(this);

		
		JButton btnSearchContacts = new JButton("Search Contacts");
		buttonGroup.add(btnSearchContacts);
		btnSearchContacts.setFont(new Font("Avenir", Font.PLAIN, 17));
		btnSearchContacts.setBounds(31, 154, 204, 28);
		frame.getContentPane().add(btnSearchContacts);

		/**
		 * button to edit contacts
		 */
		JButton btnEditContacts = new JButton("Edit Contacts");
		buttonGroup.add(btnEditContacts);
		btnEditContacts.setFont(new Font("Avenir", Font.PLAIN, 17));
		btnEditContacts.setBounds(254, 103, 204, 28);
		frame.getContentPane().add(btnEditContacts);

		
		JButton btnDeleteContacts = new JButton("Delete Contacts");
		buttonGroup.add(btnDeleteContacts);
		btnDeleteContacts.setFont(new Font("Avenir", Font.PLAIN, 17));
		btnDeleteContacts.setBounds(254, 154, 204, 28);
		frame.getContentPane().add(btnDeleteContacts);

		
		JLabel lblRadicalio = new JLabel("Radical.io");
		lblRadicalio.setHorizontalAlignment(SwingConstants.CENTER);
		lblRadicalio.setFont(new Font("Avenir", Font.PLAIN, 20));
		lblRadicalio.setBounds(95, 35, 305, 33);
		frame.getContentPane().add(lblRadicalio);

		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				System.exit(0);
			}
		});
	

		btnExit.setFont(new Font("Avenir", Font.PLAIN, 17));
		btnExit.setBounds(31, 202, 427, 28);
		frame.getContentPane().add(btnExit);
	}
	
	/**
	 * Action performed.
	 *
	 * @param event the event
	 */
	@Override
	public void actionPerformed(ActionEvent event) {
		newContact nc = new newContact();   	       
		nc.setVisible(true);
		frame.setVisible(false);


	}




}








