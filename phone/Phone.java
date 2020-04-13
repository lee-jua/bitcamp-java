
package com.jse.phone;
import lombok.Data;

@Data
public class Phone {
private String phoneNumber, name, company;


public String toString() {
	
	return "phoneNumber = " + phoneNumber + "name = " + name + "company = "+company;
}

}

 class CellPhone extends Phone{ // 상속관계
	private boolean portable;
	private String move;
public CellPhone() {

}
	
	public boolean isPortable() {
		return portable;
	}


	public void setPortable(boolean portable) {
		this.portable = portable;
	}


	public String getMove() {
		return move;
	}


	public void setMove(String move) {
		this.move = move;
	}


	@Override
	public String toString() {
		return super.toString() +", portable=" + portable + ", move=" + move  ;
	}



	
}
class Iphone extends CellPhone{
	private String search;
	
	

	public String getSearch() {
		return search;
	}



	public void setSearch(String search) {
		this.search = search;
	}



	@Override
	public String toString() {
		return super.toString() + ", search = " + search ;
	}

}
class GalaxyNote extends Iphone {
	private String bigSize;
	
	
	public String getBigSize() {
		return bigSize;
	}


	public void setBigSize(String bigSize) {
		this.bigSize = bigSize;
	}


	@Override
	public String toString() {
		return super.toString() + ", bigSize = " + bigSize ;
	}
	
}


