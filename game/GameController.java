package com.jse.game;
import java.util.Random;
import com.jse.member.Member;
import java.util.Scanner;


import com.jse.util.Calculator;
//import com.jse.app.Member;   //같은 패키지에 있는 것은 이미 들어와 있다
public class GameController { 
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		Member member = new Member(); //instantiation instance를 만들었다
		Calculator calculator = null;
		Dice dice = null;
		Game rpsgame = null; //주소지가 없다, null 값이다 rpsgame을 reference
		//Kaup kaup = null;
		while (true) {
			System.out.println("0:종료 "
										    + "1:회원가입 "
										    + "2:로그인"
										    + "3: 계산기 "
										    + "4: 홀짝 " 
										    + "5: 가위바위보 "
										    + "6: 카우프지수");
			int flag = scanner.nextInt();
			switch(flag) {
			case 0 : System.out.println("종료"); return; 
			case 1 : System.out.println("회원가입"); 
					System.out.println("아이디 입력");
					String userid = scanner.next();
					member.setUserId(userid);
					break;
			case 2 : 
					System.out.println("로그인");
					System.out.println("아이디 입력");
					String id2 = scanner.next();
					String returnId = member.getUserId();
					System.out.println("로그인용 아이디: " + returnId);
					if(id2.equals(returnId)) {
						System.out.println("로그인 성공");
					}else {
						System.out.println("로그인 실패");
					}
					break;
				case 3:
					calculator = new Calculator() ;
					System.out.println("계산기");
					System.out.print("첫번째 수를 입력하세요. : ");
					int num1 = scanner.nextInt();  //첫번째 수 입력
					calculator.setNum1(num1); 
				System.out.print("두번째 수를 입력하세요. : ");
					int num2 = scanner.nextInt();	 //두번째 수 입력
					calculator.setNum2(num2);
					int c = calculator.calculate(); 
					System.out.println("두 수의 합은 : "+c);
					break;
				case 4:
					dice = new Dice();
					System.out.println("홀짝");
					System.out.print("기대하는 값 홀/짝을 입력해 주세요.");
					String expect = scanner.next();
					System.out.println("사용자가 입력한 값 : "+expect);
					dice.setExpect(expect);
					int diceNumber = random.nextInt(5)+1; 
					System.out.println("컴퓨터가 생성한 값 : " + diceNumber);
					dice.setdiceNumber(diceNumber);
					String result = dice.switchDice();
					if (result.equals(expect)) {
						System.out.println("***맞혔습니다***.");
					}else {
						System.out.println("***틀렸습니다***");
						}
					break;
				case 5:
					rpsgame = new Game();
					System.out.println("가위:1 바위:2 보:3 을 입력하세요.");
					int uservalue = scanner.nextInt();
					System.out.println("사용자의 값은"+uservalue+"입니다.");
					rpsgame.setuservalue(uservalue);
					int computervalue = random.nextInt(3)+1;
					System.out.println("컴퓨터의 값은 "+computervalue+"입니다.");
					rpsgame.setcomputervalue(computervalue);
					String rpsresult = rpsgame.game();
					System.out.println(rpsresult);
					break;
				
			}
					
		}
	}
	

}
