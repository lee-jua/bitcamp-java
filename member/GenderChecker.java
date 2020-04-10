package com.jse.member;
import java.util.Scanner;
public class GenderChecker {
	public static void main(String[] args) {
		find();
	}
	static void find() {
		System.out.println("주민번호를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		String ssn = scanner.next();
		char ch = ssn.charAt(7);
		// String a = "";
		// char c = '';
		// case '1'
		String result = "잘못 입력한 값입니다.";
		switch(ch) {
		case '1': case '3': result = "남성입니다."; break; // 1,3
		case '2': case '4': result = "여성입니다."; break; // 2,4
		case '5': case '6': result = "외국인입니다."; break; // 5,6
		
		}

		System.out.println(result);
	}
}