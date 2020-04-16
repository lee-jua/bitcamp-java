package com.jse.member;


public class MemberServiceImpl implements MemberService {
		private Member[] members; //members.length는 최대로 받을 수 있는 수
		private int count;  //현재 받고 있는 Member의 수
		
		public MemberServiceImpl() {
			members = new Member[5];
			count = 0;
		}
		
		@Override
		public void add(Member member) {
			members[count]=member;
			count++;
		}
		@Override
		public Member[] list() {
			
			return members;
		}
		@Override
		public Member[] searchByName(String name) {
			Member[]  returnMembers = null;
			if(count(name)!=0) {
				returnMembers = new Member[count(name)];
				int j=0;
				for (int i = 0; i < count; i++) {
					if(name.equals(members[i].getName())) {
						returnMembers[j]= members[i];
						j++;
						if (count(name)==j) {
							break;
						}
					}
				
				}
			}
			return returnMembers;
		}
		
		@Override
		public Member[] searchByGender(String ssn) {
			Member[]  returnMembers = null;
			if(count(ssn)!=0) {
				returnMembers = new Member[count(ssn)];
				int j=0;
				for (int i = 0; i < count; i++) {
					if(ssn.charAt(8) == members[i].getSsn().charAt(8)) {
						returnMembers[j]= members[i];
						j++;
						if (count(ssn)==j) {
							break;
						}
					}
				
				}
			}
			return returnMembers;
		}

	
		
		
		@Override
		public Member detail(String userId) {
			Member returnMember = null;
			for (int i = 0; i < count; i++) {
				if(userId.equals(members[i].getUserId())) {
					returnMember = new Member();
					returnMember =members[i];
					 break;
				}
			}
			return returnMember;
		}
		
		@Override
		public int count() {
			return count;
		}
		@Override
		public int count(String name) {  //동명이인의 수
			int searchCount = 0;
			for (int i = 0; i < count; i++) {
			if(name.equals(members[i].getName())) {
				searchCount++;
			}
		}
			
			return searchCount;
		}
		

		@Override
		public Member login(Member member) {
			Member returnMember = null;
			for (int i = 0; i <count; i++) {
				if(member.getUserId().equals(members[i].getUserId())
						&& member.getPasswd().equals(members[i].getPasswd())) {
				returnMember=members[i];
				break;
					}
			}
			return returnMember;
		}
		

		@Override
		public void update(Member member) {
			for (int i = 0; i < count; i++) {
				if(member.getUserId().equals(members[i].getUserId())) {
					members[i].setPasswd(member.getPasswd());
					break;
				}
			}
		}

		@Override
		public void delete(Member member) {
			for (int i = 0; i < count; i++) {
				if(member.getUserId().equals(members[i].getUserId())
						&& member.getPasswd().equals(members[i].getPasswd())) {
					members[i]=members[count-1];
					members[count-1]=null;
					count--;
				}
			}
			
		}

		
		
	
		
}
