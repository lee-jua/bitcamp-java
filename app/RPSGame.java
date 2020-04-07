package com.jse.app;


public class RPSGame{
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
