package com.jse.app;


public class Dice {
	
	private String expect;
	private int diceNumber;
	
	public void setExpect(String expect) {
		this.expect=expect;
	}
	
	public String getExpect() {
	return expect;	
	};
	
	public void setdiceNumber(int diceNumber) {
		this.diceNumber = diceNumber;
	}
	
	public int getdiceNumber( ) {
		return diceNumber;
	}
	
	
public String switchDice() {
	
	String result = "";
	switch(diceNumber) {// 여러개의 body보다 한 개의 body가 메모리를 덜 차지하고 속도를 향상시킨다
	case 1: case 3: case 5: result = "홀"; break;
	case 2: case 4: case 6: result = "짝"; break;
	}
	System.out.println("생성 결과 : " + result);
	
	return result;
	}

}

		

	
	

		


