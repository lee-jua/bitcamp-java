package com.jse.card;
import java.util.Scanner;
public class CardController {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			CardServiceImpl service = new CardServiceImpl();
			while(true) {
				System.out.println("0: Exit 1:카드 3장 받기 2:출력");
				switch(scanner.nextInt()){
					case 0 : return;
					case 1 : System.out.println("카드 3장 받기 모양 , 숫자"); 
					for(int i=0;i<3;i++) {
					service.add(new Card(scanner.next(),scanner.nextInt()));
					}
					break;
					case 2 : System.out.println("출력");
					Card[] cards = service.list();
					for(int i=0;i<3;i++) {
						System.out.println(String.format("모양 : %s , 숫자 : %d " , cards[i].getKind(), cards[i].getNumber()));
					}
					break;
				}
				
			}
		}
}
