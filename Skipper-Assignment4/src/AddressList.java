import javax.swing.*;
import java.awt.*;
import java.util.*;

public class AddressList
{
	ListGUI gui = new ListGUI();
	ListNode list = new ListNode(null, null, null, null, null);
	
	class ListNode
	{
		private String name;
		private String tel;
		private String email;
		private String addr;
		private String dob;
		private ListNode next;
		private String data;
		
		private ListNode(String name, String tel, String email, String addr, String dob)
		{
			this.name = name;
			this.tel = tel;
			this.email = email;
			this.addr = addr;
			this.dob = dob;
		}
		
		public String getData()
		{
			data = name + tel + email + addr + dob;
			return data;
		}
		
		public void setData(String name, String tel, String email, String addr, String dob)
		{
			this.name = name;
			this.tel = tel;
			this.email = email;
			this.addr = addr;
			this.dob = dob;
			this.data = name + tel + email + addr + dob;
		}
		
		public ListNode getNext()
		{
			return next;
		}
		
		public void setNext(ListNode link)
		{
			next = link;
		}
		
	}
	
	public Boolean isEmpty()
	{
		if(list == null)
			return true;
		else 
			return false;
	}
	
	public void addToFront(String name, String tel, String email, String addr, String dob)
	{
		list = new ListNode(name, tel, email, addr, dob);
	}
	
	public void addToBack(String name, String tel, String email, String addr, String dob)
	{
		
	}
	
	private AddressList reverse(ListNode current, AddressList reversedList)
	{
		  if(current == null) 
			  return reversedList;
		  reversedList.addToFront(current.getData(), null, null, null, null);
		  return this.reverse(current.getNext(), reversedList);
	}
	
	public int sizeOf(ListNode list)
	{
		if(list == null)
			return 0;
		else
			return 1 + sizeOf(list.getNext());
	}
	
	public ListNode phoneNumberByName(ListNode list, String name)
	{
		if(list == null)
			return null;
		else
			if(list.getData() == name)
				return list;
			else 
				return phoneNumberByName(list.getNext(), name); 
	}
	
	public ListNode emailByName(ListNode list, String name)
	{
		if(list == null)
			return null;
		else
			if(list.getData() == name)
				return list;
			else 
				return emailByName(list.getNext(), name); 
	}
	
	public ListNode nameByPhoneNumber(ListNode list, String tel)
	{
		if(list == null)
			return null;
		else
			if(list.getData() == tel)
				return list;
			else 
				return nameByPhoneNumber(list.getNext(), tel); 
	}
	
	public ListNode dobByName(ListNode list, String name)
	{
		if(list == null)
			return null;
		else
			if(list.getData() == name)
				return list;
			else 
				return dobByName(list.getNext(), name); 
	}
	
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
}

