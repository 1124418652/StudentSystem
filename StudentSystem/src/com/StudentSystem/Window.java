package com.StudentSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Window{
	public static void main(String[] args)
	{
		JFrame demo = new JFrame("Student Manage System");
		Dimension d = new Dimension(400, 300);
		
		demo.setSize(d);
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		demo.setVisible(true);
		
		JButton addButton = new JButton("Add");
		JButton delButton = new JButton("Delete");
		JButton chgButton = new JButton("Change");
		JButton chkButton = new JButton("Check");
		JButton viwButton = new JButton("View");
		
		JPanel jpanel = new JPanel(new FlowLayout());
		jpanel.add(addButton);
		jpanel.add(delButton);
		jpanel.add(chgButton);
		jpanel.add(chkButton);
		jpanel.add(viwButton);
		
		demo.add(jpanel);
	}
}
