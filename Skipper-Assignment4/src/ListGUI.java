import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class ListGUI extends JFrame
	{
			public JTextField Name;
			public JTextField Email;
			public JTextField Telephone;
			public JTextField Address;
			public JTextField Dob;
			public JTextField Output;
			
			public ListGUI() 
			{
				getContentPane().setLayout(null);
				
				JLabel lblName = new JLabel("Name:");
				lblName.setBounds(6, 18, 61, 16);
				getContentPane().add(lblName);
				
				JLabel lblEmail = new JLabel("Email:");
				lblEmail.setBounds(6, 46, 61, 16);
				getContentPane().add(lblEmail);
				
				JLabel lblTelephone = new JLabel("Telephone:");
				lblTelephone.setBounds(6, 75, 77, 16);
				getContentPane().add(lblTelephone);
				
				JLabel lblAddress = new JLabel("Address:");
				lblAddress.setBounds(6, 101, 61, 16);
				getContentPane().add(lblAddress);
				
				JLabel lblDateOfBirth = new JLabel("Date of Birth:");
				lblDateOfBirth.setBounds(6, 129, 92, 16);
				getContentPane().add(lblDateOfBirth);
				
				Name = new JTextField();
				Name.setBounds(139, 12, 134, 28);
				getContentPane().add(Name);
				Name.setColumns(10);
				
				Email = new JTextField();
				Email.setBounds(139, 40, 134, 28);
				getContentPane().add(Email);
				Email.setColumns(10);
				
				Telephone = new JTextField();
				Telephone.setBounds(139, 69, 134, 28);
				getContentPane().add(Telephone);
				Telephone.setColumns(10);
				
				Address = new JTextField();
				Address.setBounds(139, 95, 134, 28);
				getContentPane().add(Address);
				Address.setColumns(10);
				
				Dob = new JTextField();
				Dob.setBounds(139, 123, 134, 28);
				getContentPane().add(Dob);
				Dob.setColumns(10);
				
				Output = new JTextField();
				Output.setEditable(false);
				Output.setBounds(6, 175, 438, 97);
				getContentPane().add(Output);
				Output.setColumns(10);
			}
	}