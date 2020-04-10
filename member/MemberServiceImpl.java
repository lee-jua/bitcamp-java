package com.jse.member;

public class MemberServiceImpl implements MemberService {
		private Member[] members;
		private int count;
		
		public MemberServiceImpl() {
			members = new Member[5];
			count = 0;
		}
		public void setMembers(Member[] members) {
			this.members = members;
		}
		public Member[] getMembers() {
			return members;
		}
		@Override
		public void add(Member member) {
			members[count]=member;
			count++;
		}
		public int getCount() {
			return count;
		}
		public void setCount(int count) {
			this.count = count;
		}
		
		
}
