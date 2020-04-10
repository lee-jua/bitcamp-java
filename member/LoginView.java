package com.jse.member;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginView extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	JLabel[] labels;
	JTextField[] textfields;
	   JButton[] buttons;
		JPanel panel;
	public void execute() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		this.setVisible(true);
		this.add(panel);
		
		labels = new JLabel[2];
		textfields =  new JTextField[2];
		String[] name = {"아이디", "비밀번호"};
		for (int i = 0; i <2; i++) {
			labels[i] = new JLabel(name[i]);
			panel.add(labels[i]);
			
			textfields[i] = new JTextField();
			panel.add(textfields[i]); 
		}
	 
	 
		String[] buttonname = {"로그인", "로그아웃"};
		buttons = new JButton[2];
		for (int i = 0; i < 2; i++) {
			buttons[i] = new JButton(buttonname[i]);
			panel.add(buttons[i]);
		}
	  
		

	   labels[0].setBounds(40,100,60,40);
	   labels[1].setBounds(40,200,60,40); 
	
	   textfields[0].setBounds(150,100,200,30);
	   textfields[1].setBounds(150,200,200,30);

	   buttons[0].setBounds(125, 330, 100, 30);
	   buttons[1].setBounds(240, 330, 100, 30);
	   buttons[0].addActionListener(this);
	   buttons[1].addActionListener(this);
	   this.setLocationRelativeTo(null);
	   
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		 if(e.getSource() == buttons[0]) { //주소값 비교
				JOptionPane.showMessageDialog(this, textfields[0].getText());
			 }else if(e.getSource() ==  buttons[1]) {
				 JOptionPane.showMessageDialog(this, textfields[0].getText());
		
	}
	}
	}

