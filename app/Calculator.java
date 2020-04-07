package com.jse.app;

public class Calculator{ 
	private int num1;
	private int num2; //instance 변수, field에 저장된다
	public void setNum1(int num1) { // parameter 존재
			this.num1 =num1;
			
	}
	public int getNum1() { 
		return num1;
	}
	
	public void setNum2(int num2) {
			this.num2 =num2;
	}
	public int getNum2() {
		return num2;
	}
	
	public int calculate( ) { 
		int c =this.num1 +this.num2 ;
		return c;
	}
	
}
 