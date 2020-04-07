package com.jse.swing;
/*클라이언트에서 프로그램 개발 요청이 왔습니다. 
 *  이름과 국,영,수 세과목점수를 입력받아서()
 *   [홍길동 : 총점 ***점, * 평균***점,학점 : F] 을 출력하는 프로그램을 만들어 주세요. 
 *   단) 평균은 소수점이하는 절삭합니다
 *    평균점수가 90점 이상 A * 80점 이상이면 B 70점 이상이면 C
     60점 이상이면 D 50점 이상이면 E 50점 미만이면 F 학점입니다라고 출력되게 해주세요
 */
public class GradeBean {
private String name; // 정보를 감춘다, 은닉화
private int korean;
private int english;
private int math;

public GradeBean(String name, int korean, int english, int math){
	this.name = name;
	this.korean = korean;
	this.english = english;
	this.math = math;
}

public String getName() {
	return name;
} 


public int getKorean() {
	return korean;
}

public int getEnglish() {
	return english;
}


public int getMath() {
	return math;
}

public String gradeResult() {
	int average = (korean + english + math)/3;
	System.out.println("평균 : "+average);
	String result = "";
	if(average >=90) {
		result = "A";
	}else if(average >=80) {
		result = "B";
	}else if(average >= 70) {
		result = "C";
	}else if(average >= 60) {
		result = "D";
	}else if(average >= 50) {
		result = "E";
	}else if(average < 50) {
		result = "F";
	}
	return result;
	
}

public int totalScore() {
	int total = korean+english+math;
	return total;
}


}
