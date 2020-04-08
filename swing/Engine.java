package com.jse.swing;
import java.util.Scanner;

public class Engine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	   GradeService gradeService = new GradeService(); // GradeBean[] gradeBean = new GradeBean[3]; 과 같다
//   MemberService memberService= new MemberService();
		while(true) {
			System.out.println("0 : 종료 "
											+ "1 : 성적표입력 "
											+ "2 : 성적표 출력 "
											+ "3 : 줄 세우기 "
											+ "4 : 회원가입 "
											+ "5 : 멤버 나이순 정렬 ");
			switch(scanner.nextInt()) {
			case 0 : System.out.println("종료"); return;
			case 1 :System.out.println("학점");
						for (int i=0; i<3; i++) { //i를 값이 아니라 횟수로??
						System.out.println("이름, 국어, 영어, 수학 입력");
						gradeService.add(new GradeBean(
														scanner.next(),
														scanner.nextInt(),
														scanner.nextInt(),
														scanner.nextInt()));
						}
						
						
			break;
			case 2: 
				GradeBean[] grades = gradeService.getGrades();
				
						for(int i=0;i<3;i++) {
							System.out.println(grades[i].getName()+"님의 학점은 "+grades[i].gradeResult()+"입니다.");
						}
			break;
			}
		}
	}
}
//			case 3:
//				System.out.println("성적별로 1,2,3등 나열하기");
//				int first = grades[0].totalScore();
//				int second = grades[1].totalScore();
//				int third = grades[2].totalScore();
//				
//				if (first >second && first > third) {
//					if (second>third) {
//						System.out.println(first+" > "+second+" > "+third);
//						System.out.println("1등 : "+grades[0].getName()+" 2등 :"+grades[1].getName()+" 3등 :"+grades[2].getName());
//					}else {
//					System.out.println(first+" > "+third+" > "+second);
//					System.out.println("1등 : "+grades[0].getName()+" 2등 :"+grades[2].getName()+" 3등 :"+grades[1].getName());
//					}
//				}else if(second>first && second > third) {
//					if (first > third) {
//						System.out.println(second+" > "+first+" > "+third);
//						System.out.println("1등 :"+grades[1].getName()+" 2등 :"+grades[0].getName()+" 3등 :"+grades[2].getName());
//					}else {
//						System.out.println(second+" > "+third+" > "+first);
//						System.out.println("1등 :"+grades[1].getName()+" 2등 :"+grades[2].getName()+" 3등 :"+grades[0].getName());
//					}
//				}else if(third > first && third > second) {
//					if(first>second) {
//						System.out.println(third+" > "+first+" > "+second);
//						System.out.println("1등 :"+grades[2].getName()+" 2등 :"+grades[0].getName()+" 3등 :"+grades[1].getName());
//					}else {
//						System.out.println(third+" > "+second+" > "+first);
//						System.out.println("1등 :"+grades[2].getName()+" 2등 :"+grades[1].getName()+" 3등 :"+grades[0].getName());
//					}
//				}
//				break;
//			case 4:
//				for(int i=0;i<3;i++) {
//					members[i]=join(scanner);
//				}
//				break;
//			case 5:
//					int a= members[0].getage();
//					int b= members[1].getage();
//					int c= members[2].getage();
//					
//					int agefirst;
//					int agesecond;
//					int agethird;
//				
//				if(a > b && a>c) {
//					if(b>c) {  //a > b >c
//					 agefirst = a; 
//						agesecond = b;
//						agethird = c;
//					}else { //a > c > b
//						agefirst = a;
//						agesecond = c;
//						agethird = b;
//					}
//				}else if(b>a && b>c) {
//					if(a>c) { // b>a>c
//						 agefirst = b;
//						agesecond = a;
//						agethird = c;
//					}else { //b > c >a
//						agefirst = b;
//					agesecond = c;
//						agethird = a;
//					}
//				}else {
//					if(a>b) { //c>a>b
//					agefirst =c;
//					agesecond = a;
//					 agethird = b;
//					}else { //c>b>a
//					 agefirst = c;
//						agesecond = b;
//					 agethird = a;
//					}
//					System.out.println("1번째 : "+agefirst+"살"+"  2번째 : "+agesecond+"살"+"  3번째 : "+agethird+"살");
//				}
//			}
//	}
	
//		
//	public static GradeBean input(Scanner scanner) { //parameter
//		
//       //Grade grade = new Grade(scanner.next(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
//		//return grade;
//		
//	}
//	
//	public static MemberBean join(Scanner scanner) {
//		MemberBean member = new MemberBean();
//		System.out.println("아이디를 입력하세요.");
//		member.setuserId(scanner.next());
//		System.out.println("비밀번호를 입력하세요.");
//		member.setpasswd(scanner.next());
//		System.out.println("이름을 입력하세요.");
//		member.setName(scanner.next()); 
//		System.out.println("나이를 입력하세요.");
//		member.setage(scanner.nextInt());
//
//		return member;
//	}
//}

