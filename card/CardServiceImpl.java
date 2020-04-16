package com.jse.card;

public class CardServiceImpl implements CardService {
		private Card[] cards;
		private int count;
		
		public CardServiceImpl() {
			cards = new Card[3];
			count = 0;
		}
		
		public void add(Card card) {
			cards[count] = card; //첫번째칸에 내가 받은 카드 값을 넣는다.
			count++;
		}
		@Override
		public Card[] list() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public Card detail(Card card) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public int count() {
			// TODO Auto-generated method stub
			return 0;
		}
		@Override
		public void update(Card card) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void delete(Card card) {
			// TODO Auto-generated method stub
			
		}
}
