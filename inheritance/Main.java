package com.jse.inheritance;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			PhoneService service = new PhoneService(); 
			String message = "";
			while(true) {
					System.out.println();
					switch(JOptionPane.showInputDialog("0 : Exit\t 1:집전화입력\t 2:집전화출력"
									+ "\t 3: 휴대전화입력\t 4:휴대전화출력 \t 5: 아이폰입력 \t 6:아이폰출력 \t 7:갤노트입력\t8:갤노트출력" )) {
					case "0" : return;
					case "1" :
						for (int i = 0; i < 3; i++) {
							String[] values = JOptionPane.showInputDialog("핸드폰번호, 이름, 회사 입력").split(",");  
							service.add(new Phone(values[0],values[1],values[2]));		 
							}
							/*3x3 배열 
							 *  i=1 value[0] value[1] value[2]
							 *  i=2 value[0] value[1] value[2]
							 *  i=3 value[0] value[1] value[2]  
							 */
						 
					break;
					case "2": 
						Phone[] phones = service.getPhones();
						for (int i = 0; i < 3; i++) {
							message += String.format("번호 : %s , 이름 : %s, 회사 : %s \n" , 
							phones[i].getPhoneNumber(),
							phones[i].getName(),
							phones[i].getCompany());
							//+=오버로딩 ==오버라이딩
						}
						JOptionPane.showMessageDialog(null, message);
						break;
	
					case "3": 
						for (int i = 0; i <3; i++) {
							String[] values = JOptionPane.showInputDialog("핸드폰번호, 이름, 회사, 휴대여부 입력").split(",");
							service.add(new CellPhone(values[0],values[1],values[2],true));
						}
						//3x4 배열
					break;
					case "4": 
						CellPhone[] cellPhone =service.getCellPhones();
						for (int i = 0; i < 3; i++) {
							message += String.format("번호 : %s , 이름 : %s, 회사 :%s 휴대여부: %s \n",
																				cellPhone[i].getPhoneNumber(),
																				cellPhone[i].getName(),
																				cellPhone[i].getCompany(),
																				cellPhone[i].getMove());
																	}
							JOptionPane.showMessageDialog(null, message);
					break;
					case "5" : 
						for (int i = 0; i < 3; i++) {
							String[] values = JOptionPane.showInputDialog("핸드폰번호, 이름, 회사, 휴대 여부, 검색 입력").split(",");
							service.add(new Iphone(values[0],values[1],values[2],true,values[4]));
						}
						//3x5배열
					break;
					case "6" : 
						Iphone[] iphone = service.getIphones();
						for (int i = 0; i < 3; i++) {
							message += String.format("번호 : %s , 이름 : %s, 회사 :%s 휴대여부: %s 검색:%s \n",
							iphone[i].getPhoneNumber(),
							iphone[i].getName(),
							iphone[i].getCompany(),
							iphone[i].getMove(),
							iphone[i].getSearch());
						}
					JOptionPane.showMessageDialog(null, message);			
				break;
					case "7":
						for (int i = 0; i < 3; i++) {
							String[] values = JOptionPane.showInputDialog("번호, 이름, 회사, 휴대여부, 검색, 빅사이즈 입력").split(",");
							service.add(new GalaxyNote(values[0], values[1], values[2], true, values[4], values[5]));
						}
						break;
					case  "8":
						GalaxyNote[] galaxynote = service.getGalaxynotes();
						for (int i = 0; i < 3; i++) {
							message += String.format("출력 :  %s , %s, %s, %s, %s, %s\n",
								galaxynote[i].getPhoneNumber(),galaxynote[i].getName(),galaxynote[i].getCompany(),
								galaxynote[i].getMove(),galaxynote[i].getSearch(),galaxynote[i].getBigSize());
						}
						JOptionPane.showMessageDialog(null, message);
						break;
		}
	}
}
}
