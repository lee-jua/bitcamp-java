package com.jse.app;


/*
 * 개발자님 키와 몸무게를 이용하여
 * 키우푸지수를 구하고
 * 그 결과 정상, 저체중, 비만 등으로 몸의 상태만 알려주는 프로그램을 만들어 주세요
 */

public class Kaup {

	 private double height;
	 private double weight;
	 
	 public void setheight(double height) {
	 		this.height = height;
	 }
	 
	 public double getheight() {
		 return height;
	 }
	
	 public void setweight(double weight) {
		 this.weight = weight;
	 }
	 
	 public double getweight() {
		 return weight;
	 }
	 
	 public String kaupcalculate() { 
	
		 double kaupindex = weight / (height*height);
		 String kaupresult = "";
	    if (kaupindex <= 13) {
	    	kaupresult = "영양실조";
	    }else if(13 < kaupindex && kaupindex<=15 ) {
	    	kaupresult = "여윔";
	    }else if(15 < kaupindex && kaupindex <=18) {
	    	kaupresult = "정상";
	    }else if(18 < kaupindex && kaupindex <= 20) {
	    	kaupresult = "과체중";
	    }else {
	    	kaupresult = "비만";
	    }
		 return kaupresult;
	 }
	 

}
