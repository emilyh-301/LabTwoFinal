package pkgCore;

import java.util.ArrayList;

public class Deck{

	//	TODO: Add 'cards' attribute that is an ArrayList of Card
	
	
	//	TODO: Add a contructor that passes in the number of decks, and then populates
	//			ArrayList<Card> with cards (depending on number of decks).
	
	//			Example: Deck(1) will build one 52-card deck.  There are 52 different cards
	//			2 clubs, 3 clubs... Ace clubs, 2 hearts, 3 hearts... Ace hearts, etc
	
	//			Deck(2) will create an array of 104 cards.
	
	
	//	TODO: Add a draw() method that will take a card from the deck and
	//			return it to the caller
	ArrayList<E> cards = new ArrayList();
	
	public Deck(int x) {
		for(int i =0; i < x ; i++) {
			for(int s = 1; s <= 4; s++) {
				eSUIT es;
				switch (s)
				{
				case 1:
					es = CLUBS;
					break;
				case 2:
					es = DIAMONDS;
					break;
				case 3:
					es = HEARTS;
					break;
				case 4:
					es = SPADES;
				}
				
				
				for(int r = 1; r <= 14; r++) {
					switch (r)
					{
					case 1:
						cards.add(new Card(JOKER, es))
						break;
					case 2:
						cards.add(new Card(TWO, es))
						break;
					case 3:
						cards.add(new Card(THREE, es))
						break;
					case 4:
						cards.add(new Card(FOUR, es))
						break;
					case 5:
						cards.add(new Card(FIVE, es))
						break;
					case 6:
						cards.add(new Card(SIX, es))
						break;
					case 7:
						cards.add(new Card(SEVEN, es))
						break;
					case 8:
						cards.add(new Card(EIGHT, es))
						break;
					case 9:
						cards.add(new Card(NINE, es))
						break;
					case 10:
						cards.add(new Card(TEN, es))
						break;
					case 11:
						cards.add(new Card(JACK, es))
						break;
					case 12:
						cards.add(new Card(QUEEN, es))
						break;
					case 13:
						cards.add(new Card(KING, es))
						break;
					case 14:
						cards.add(new Card(ACE, es))
						break;
					}
				}
			}
		}
		Collections.shuffle(DeckCards);
	}
	
	public Card draw() throws Exception {
		if(DeckCards.size()==0){
			throw new Exception("Deck is empty");
		}
		return DeckCards.remove(0);
		
	}
}
