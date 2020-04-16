package com.jse.member;

public interface MemberService {
	public void add(Member member);  //create
	public Member[] list(); //read
	public Member[] searchByName(String name); //read
	public Member[] searchByGender(String gender); //read
	public Member detail(String userId); //read
	public int count(); //read
	public int count(String name);
	public Member login(Member member); 
	public void update(Member member);  //update
	public void delete(Member member);  //delete
}
