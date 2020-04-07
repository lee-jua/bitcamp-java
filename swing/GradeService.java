package com.jse.swing;

public class GradeService {
			private GradeBean[] grades;
			public GradeService() {
				grades = new GradeBean[10];
			}
			public void setGrades(GradeBean[] grades) {
				this.grades = grades;
			}
			public GradeBean[] getGrades() {
				return grades;
			}
}
