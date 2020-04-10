package com.jse.algorithm;

public class sum1To5 {
	public static void main(String[] args) {
		sum();
	} 
	
	static void sum() {
		int sum = 0;
		for(int i =1;i<=10;i++) {
			System.out.println(i);
			sum += i;
			//System.out.println(sum);
		}
		//System.out.println(String.format(">>>>>>>%d", sum));
		System.out.println(">>>>>>>"+sum);
	}
	
}//class end

