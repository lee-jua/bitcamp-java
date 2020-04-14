package com.jse.member;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.*;
public class MemberView extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
    private Container container; 
    private JLabel title,nameLabel,useridLabel,passwordLabel,
    				ssnLabel,addrLabel; 
    private JTextField nameText, useridText, passwordText, ssnText,
    					addrText; 
    private JTextArea resultText; 
    private JButton submitButton, listButton, loginButton; 
    public MemberService memberService;
    public void open(){ 
        memberService = new MemberServiceImpl();
    	setTitle("Swing Exercise"); 
        setBounds(300, 90, 900, 600); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
  
        container = getContentPane(); 
        container.setLayout(null); 
  
        title = new JLabel("Swing Form"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(300, 30); 
        title.setLocation(300, 30); 
        container.add(title); 
  
        nameLabel = new JLabel("Name"); 
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        nameLabel.setSize(100, 20); 
        nameLabel.setLocation(100, 100); 
        container.add(nameLabel); 
  
        nameText = new JTextField(); 
        nameText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        nameText.setSize(190, 20); 
        nameText.setLocation(200, 100); 
        container.add(nameText); 
  
        useridLabel = new JLabel("Userid"); 
        useridLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        useridLabel.setSize(100, 20); 
        useridLabel.setLocation(100, 150); 
        container.add(useridLabel); 
  
        useridText = new JTextField(); 
        useridText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        useridText.setSize(150, 20); 
        useridText.setLocation(200, 150); 
        container.add(useridText); 
  
        passwordLabel = new JLabel("Password"); 
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        passwordLabel.setSize(100, 20); 
        passwordLabel.setLocation(100, 200); 
        container.add(passwordLabel); 
        
        passwordText = new JTextField(); 
        passwordText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        passwordText.setSize(150, 20); 
        passwordText.setLocation(200, 200); 
        container.add(passwordText);
  
        ssnLabel = new JLabel("SSN"); 
        ssnLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        ssnLabel.setSize(100, 20); 
        ssnLabel.setLocation(100, 250); 
        container.add(ssnLabel); 
        
        ssnText = new JTextField(); 
        ssnText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        ssnText.setSize(150, 20); 
        ssnText.setLocation(200, 250); 
        container.add(ssnText);
  
        addrLabel = new JLabel("Address"); 
        addrLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        addrLabel.setSize(100, 20); 
        addrLabel.setLocation(100, 300); 
        container.add(addrLabel); 
        
        addrText = new JTextField(); 
        addrText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        addrText.setSize(150, 20); 
        addrText.setLocation(200, 300); 
        container.add(addrText);
        
  
        submitButton = new JButton("Submit"); 
        submitButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        submitButton.setSize(100, 20); 
        submitButton.setLocation(150, 450); 
        container.add(submitButton); 
  
        listButton = new JButton("List"); 
        listButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        listButton.setSize(100, 20); 
        listButton.setLocation(270, 450); 
        container.add(listButton); 
        
       loginButton = new JButton("Login"); 
        loginButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        loginButton.setSize(100, 20); 
        loginButton.setLocation(390, 450); 
        container.add(loginButton); 
  
        resultText = new JTextArea(); 
        resultText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        resultText.setSize(300, 400); 
        resultText.setLocation(500, 100); 
        resultText.setLineWrap(true); 
        resultText.setEditable(false); 
        container.add(resultText); 
 
        submitButton.addActionListener(this);
		listButton.addActionListener(this);
		loginButton.addActionListener(this);
        setVisible(true); 
    } 
	@Override
	public void actionPerformed(ActionEvent e) { //기능을 한다 컨트롤러 액션을 수행한다
		
		if(e.getSource() == submitButton) {
			nameText.setText("홍길동,유관순,이순신,신사임당,이도"); //자연어 nl 입력
			 useridText.setText("hong,you,lee,shin,leedo");
			 passwordText.setText("1,1,1,1,1");
			 ssnText.setText("900101-1,960101-2,980101-1,011010-4,020606-3");
			 addrText.setText("서울,서울,서울,부산,부산");
			String data = String.format("%s/%s/%s/%s/%s",  //nlp 자연언어처리 
					nameText.getText(),
					useridText.getText(),
					passwordText.getText(),
					 ssnText.getText(),
					 addrText.getText());
			String[] arr = data.split("/"); //corpus 말뭉치로 전환 dimension이 하나 올라간다
			Member[] members = new Member[5];
			String[] names = arr[0].split(",");
			String[] userids = arr[1].split(",");
			String[] passwords = arr[2].split(",");
			String[] ssns = arr[3].split(",");
			String[] addrs = arr[4].split(",");
			for(int i=0;i< 5; i++) {
				members[i] = new Member(); //element로 취급한다 preprocessing
				members[i].setName(names[i]);
				members[i].setUserId(userids[i]);
				members[i].setPasswd(passwords[i]);
				members[i].setSsn(ssns[i]);
				members[i].setAddr(addrs[i]);
				memberService.add(members[i]);
			}
		
		}else if(e.getSource() == listButton) {
			Member[] members = memberService.getMembers();
			String message = "";
			for (int i = 0; i < members.length; i++) {
				message +=(String.format("%s \n", members[i].toString()));
			}
			resultText.setText(message);
			nameText.setText("");
			useridText.setText("");
			passwordText.setText("");
			ssnText.setText("");
			 addrText.setText("");
		}else if(e.getSource() == loginButton) {
			Member member = new Member();
			member.setUserId(useridText.getText());
			member.setPasswd(passwordText.getText());
			Member returnMember =memberService.login(member);
			if (returnMember != null) {
				JOptionPane.showMessageDialog(this, "로그인 성공");
				 resultText.setText(returnMember.toString());
			}else {
				JOptionPane.showMessageDialog(this, "로그인 실패");
			}
			}
			
		}
		
	}
















