package com.StudentSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import com.StudentSystem.Window;

public class AddEvent extends JFrame implements ActionListener{
	private static final long serialVersionUID = -1928970409928880648L;
	
	public void actionPerformed(ActionEvent e)
	{
		AddEvent addevent = new AddEvent();
	}
	
	JLabel jlnumber = new JLabel("学号");
	JLabel jlname = new JLabel("姓名");
	JLabel jlsex = new JLabel("性别");
	JLabel jlbirthday = new JLabel("出生日期");
	JLabel jldepartment = new JLabel("学院");
	
	JTextField jtnumber = new JTextField("", 20);
	JTextField jtname = new JTextField("", 20);
	JTextField jtsex = new JTextField("", 20);
	JTextField jtbirthday = new JTextField("", 20);
	JTextField jtdepartment = new JTextField("", 20);
	
	JButton addButton = new JButton("Add");
	JButton returnButton = new JButton("Return");
	
	public AddEvent()
	{
		JPanel jpnumber = new JPanel();
		JPanel jpname = new JPanel();
		JPanel jpsex = new JPanel();
		JPanel jpbirthday = new JPanel();
		JPanel jpdepartment = new JPanel();
		
		jpnumber.add(jlnumber);
		jpnumber.add(jtnumber);
		
		jpname.add(jlname);
		jpname.add(jtname);
		
		jpsex.add(jlsex);
		jpsex.add(jtsex);
		
		jpbirthday.add(jlbirthday);
		jpbirthday.add(jtbirthday);
		
		jpdepartment.add(jldepartment);
		jpdepartment.add(jtdepartment);
		
		addButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
			}
		}
		);
		
		this.setLayout(new GridLayout(9, 1));
		this.setSize(400, 300);
		this.add(jpnumber);
		this.add(jpname);
		this.add(jpsex);
		this.add(jpbirthday);
		this.add(jpdepartment);
		this.add(addButton);
		this.add(returnButton);
		
		this.setVisible(true);
	}
}
