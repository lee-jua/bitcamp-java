package com.jse.grade;

public class GradeServiceImpl implements GradeService {
	private Grade[] grades;
	private int count;
	public GradeServiceImpl() {
		grades = new Grade[5];
		count = 0;
	}
	@Override
	public void setGrades(Grade[] grades) {
		this.grades = grades;
	}
	@Override
	public Grade[] getGrades() {
		return grades;
	}

	@Override
	public void add(Grade grade) { //구상 메소드
		grades[count] = grade;	
		count++;
	
	}

	@Override
	public int totalScore(Grade grade) {
		return grade.getKorean() + grade.getEnglish() + grade.getMath();
	}
	
	@Override
	public String record(Grade grade) {
		int average = totalScore(grade)/3;
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
	@Override
	public String printGrades() {
		String result = "";
		Grade[] grades = getGrades();
		for(int i=0;i<3;i++) {
			result += String.format("이름 : %s , 학점 : %s" ,grades[i].getName(),record(grades[i]));
		}
		return result;
	}
	@Override
	public String ranking() {
		
		Grade[] grades = getGrades();
		int a = totalScore(grades[0]);
		int b = totalScore(grades[1]);
		int c = totalScore(grades[2]);
		
		int first;
		int second;
		int third;
	
	if(a > b && a>c) {
		if(b>c) {  //a > b >c
		first = a; 
			second = b;
			third = c;
		}else { //a > c > b
			first = a;
			second = c;
			third = b;
		}
	}else if(b>a && b>c) {
		if(a>c) { // b>a>c
			 first = b;
			second = a;
			third = c;
		}else { //b > c >a
			first = b;
		second = c;
			third = a;
		}
	}else {
		if(a>b) { //c>a>b
		first =c;
		second = a;
		 third = b;
		}else { //c>b>a
		 first = c;
			second = b;
		third = a;
		}
	
	
	}
	String message = ("1번째 : "+first+"  2번째 : "+second+"  3번째 : "+third);
	return message;
	}
	}
