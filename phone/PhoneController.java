package com.jse.phone;
import javax.swing.JOptionPane;
import com.jse.util.Constants; //* = all
public class PhoneController {
		public static void main(String[] args) {
			PhoneService service = new PhoneService(); 
			Phone phone = null;
			CellPhone cellPhone = null;
			Iphone iphone = null;
			GalaxyNote galaxynote = null;
			while(true) {
					switch(JOptionPane.showInputDialog(Constants.MENU)) {
					case "0" : return;
					case "1" :
						for (int i = 0; i < 3; i++) {
							String[] values = JOptionPane.showInputDialog(Constants.PHONE_MENU).split(",");  
							phone = new Phone();
							phone.setPhoneNumber(values[0]);
							phone.setName(values[1]);
							phone.setCompany(values[2]);
							service.add(phone);
							}
						 	//3x3배열
					break;
					case "2": 
						JOptionPane.showMessageDialog(null, service.toString());
						break;
	//				}}}}
					case "3": 
						for (int i = 0; i <3; i++) {
							String[] values = JOptionPane.showInputDialog(Constants.CELLPHONE_MENU).split(",");
							cellPhone = new CellPhone();
							cellPhone.setPhoneNumber(values[0]);
							cellPhone.setName(values[1]);
							cellPhone.setCompany(values[2]);
							cellPhone.setPortable(true);
							service.add(cellPhone);
						}
						//3x4 배열
					break;
					case "4": 
							JOptionPane.showMessageDialog(null, service.toString());
					break;
					case "5" : 
						for (int i = 0; i < 3; i++) {
							String[] values = JOptionPane.showInputDialog(Constants.IPHONE_MENU).split(",");
							iphone = new Iphone();
							iphone.setPhoneNumber(values[0]);
							iphone.setName(values[1]);
							iphone.setCompany(values[2]);
							iphone.setPortable(true);
							iphone.setSearch(values[4]);
							service.add(iphone);
						}
						//3x5배열
					break;
					case "6" : 
					JOptionPane.showMessageDialog(null, service.toString());			
				break;
					case "7":
						for (int i = 0; i < 3; i++) {
							String[] values = JOptionPane.showInputDialog(Constants.GALAXYNOTE_MENU).split(",");
							galaxynote = new GalaxyNote();
							galaxynote .setPhoneNumber(values[0]);
							galaxynote .setName(values[1]);
							galaxynote .setCompany(values[2]);
							galaxynote .setPortable(true);
							galaxynote.setSearch(values[4]);
							galaxynote.setBigSize(values[4]);
							service.add(galaxynote);
						}
						break;
					case  "8":
						JOptionPane.showMessageDialog(null, service.toString());
						break;
		}
	}
}
}
