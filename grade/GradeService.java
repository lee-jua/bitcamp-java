package com.jse.grade;

public interface GradeService {
		public void setGrades(Grade[] grades) ;
		public Grade[] getGrades();
		public void add(Grade grade); //추상 메소드
		public void setCount(int count);
		public int getCount();
		public int totalScore(Grade grade);
		public String record(Grade grade);
		public String printGrades();
	public String ranking();
}
