package com.jse.inheritance;

public class CellPhone extends Phone{
	private boolean portable;
	private String move;

	public CellPhone(String phoneNumber, String name,
									String company,	boolean portable) {
		super(phoneNumber, name, company); 	// super에게 저장된다 super = Phone
		 setPortable(portable);
	}
	public boolean isPortable() { // boolean타입은 get이 아니라 is
		return portable;
	}
	public void setPortable(boolean portable) {
		if(portable) {
			this.move = "휴대 가능";
		}else {
			this.move = "휴대 불가능";
		}
	}

	public String getMove() {
		return move;
	}


	public void setMove(String move) {
		this.move = move;
	}



	
}
