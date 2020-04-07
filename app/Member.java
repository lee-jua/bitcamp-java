package com.jse.app;

public class Member {
		private String id; //인스턴스(다이나믹) 멤버 변수 I.V
		public Member() { //생성자 constructor

		}
		public void setId(String param) { //method //이름은 일치하지 않아도 되고 타입이 같아야 한다
			    System.out.println("지역변수 들어옴 : "+id);
				this.id = param; 
				System.out.println("인스턴스 변수에 저장됨 : " + this.id);
		}
		public String getId() { //return이 있을때는 void를 쓰지 않는다 그리고 필드에 있는 것과 타입?을 일치시킨다
			return this.id;
		}
	
		
}
 