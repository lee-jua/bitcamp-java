package com.jse.member;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class JoinView extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	JLabel[] labels;
	JTextField[] textfields;
	   JButton[] buttons;
		JPanel panel;
		MemberService memberService;
		JoinView(){
			memberService = new MemberServiceImpl();
		}
	public void execute() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		this.setVisible(true);
		this.add(panel);
		
		labels = new JLabel[5];
		textfields =  new JTextField[5];
		String[] name = {"이름", "아이디", "비밀번호", "SSR", "추가사항"};
		for (int i = 0; i <5; i++) {
			labels[i] = new JLabel(name[i]);
			panel.add(labels[i]);
			
			textfields[i] = new JTextField();
			panel.add(textfields[i]); 
		}
	 
	 
		String[] buttonname = {"저장", "취소"};
		buttons = new JButton[2];
		for (int i = 0; i < 2; i++) {
			buttons[i] = new JButton(buttonname[i]);
			panel.add(buttons[i]);
		}
	  
		
	   buttons[0].addActionListener(this);
	   buttons[1].addActionListener(this);
	   

	   labels[0].setBounds(40,10,40,40);
	   labels[1].setBounds(40,50,40,40); 
	   labels[2].setBounds(40,90,60,40); 
	   labels[3].setBounds(40,130,40,40); 
	   labels[4].setBounds(40,170,60,40);
	   textfields[0].setBounds(120,10,200,30);
	   textfields[1].setBounds(120,50,200,30);
	   textfields[2].setBounds(120,90,200,30);
	   textfields[3] .setBounds(120,130,280,30);
	   textfields[4].setBounds(120,180,280,120);
	   buttons[0].setBounds(125, 330, 80, 30);
	   buttons[1].setBounds(240, 330, 80, 30);
	  
	   this.setLocationRelativeTo(null);
	   

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	 if(e.getSource() == buttons[0]) { //주소값 비교
			textfields[0].setText("홍길동,유관순,이순신,심사임당,이도");
			textfields[1].setText("hong,you,lee,sin,leedo");
			textfields[2].setText("1,2,3,4,5");
			textfields[3].setText("930505-1,940505-1,950505-2,960505-2,970505-3");
		JOptionPane.showMessageDialog(this, String.format("%s / %s / %s / %s / %s", 
				textfields[0].getText(),
				textfields[1].getText(),
				textfields[2].getText(),
				textfields[3].getText(),
				textfields[4].getText()));
		String[] data = String.format("%s / %s / %s / %s / %s", 
				textfields[0].getText(),
				textfields[1].getText(),
				textfields[2].getText(),
				textfields[3].getText(),
				textfields[4].getText()).split("/");
String[] names = data[0].split(",");
String[] ids = data[1].split(",");
String[] passwords = data[2].split(",");
String[] ssrs = data[3].split(",");
Member[] members = memberService.getMembers();
	for (int i = 0; i < members.length; i++) {
			System.out.println(members[i].toString());
		}
	 }else if(e.getSource() ==  buttons[1]) {
	 
	 }
		 
		
	}
}
