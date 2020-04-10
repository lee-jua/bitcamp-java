package com.jse.game;


public class Game{
		private int uservalue;
		private int computervalue;
		//public RPSGame() {  //생략해도 있는 것처럼 취급한다.
			// TODO Auto-generated constructor stub
		//}

		public void setuservalue(int uservalue) {
			this.uservalue = uservalue;
		}
		public int getuservalue() {
			return uservalue;
		}
		
		public void setcomputervalue(int computervalue) {
			this.computervalue = computervalue;
		}
		
		public int getcomputervalue() {
			return computervalue;
		}
		
		public String game() {
		
			String rpsresult = "";
			if(computervalue==uservalue) {
				rpsresult ="비겼습니다.";
			}else {
			if(uservalue==1) {
				if (computervalue==2) {
					rpsresult = "컴퓨터 승리!";
				}else if(computervalue==3){
					rpsresult = "사용자 승리!";
				}
			}
			if(uservalue==2) {
				if (computervalue==1) {
					rpsresult = "사용자 승리!";
				}else if(computervalue==3) {
					rpsresult = "컴퓨터 승리!";
				}
			}
			if(uservalue==3)
				if(computervalue==1) {
					rpsresult = "사용자 승리!";
				}else if(computervalue==2) {
					rpsresult = "컴퓨터 승리!";
				}
		
			}
			
		 return rpsresult;
	}

}

class Dice {
	
	private String expect;
	private int diceNumber;
	public Dice() {
		// TODO Auto-generated constructor stub
	}
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

		
