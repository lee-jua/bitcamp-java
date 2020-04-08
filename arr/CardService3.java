package com.jse.arr;

public class CardService3 {
		private CardBean[][][] cardContainer;
		public CardService3() {
			cardContainer = new CardBean [12][10][1000];
		}
		public void setCardContainer(CardBean[][][] cardContainer) {
			this.cardContainer = cardContainer;
		}
		public CardBean[][][] getCardContainer() {
			return cardContainer;
		}
}
