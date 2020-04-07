package com.jse.app;
import java.util.Scanner;
public class HelloJava { //block body
		public static void main(String[] args) {
				
				Scanner scanner = new Scanner(System.in);
				System.out.println("어디 사세요?"); 		//static -바뀌지 않는다
				String place = scanner.next();
				System.out.println("아, " + place +" 좋은 곳이죠!");
				System.out.println("몇 살이세요 ?");			
				int age = scanner.nextInt();				//지역변수 - 자주 바뀐다
				System.out.println(age + "살이에요.");
				System.out.println("키는 몇이고, 몸무게는 몇 kg 입니까?");
				double height = scanner.nextDouble();
				double weight = scanner.nextDouble();
				System.out.println("혈액형이 뭐에요?");
				char Bloodtype = scanner.next().charAt(0);
				
		}

}

