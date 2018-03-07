package pkgCore;
import pkgEnum.*;
import java.util.ArrayList;
import java.util.Collections;

public class Deck{

	//	TODO: Add 'cards' attribute that is an ArrayList of Card
	
	
	//	TODO: Add a contructor that passes in the number of decks, and then populates
	//			ArrayList<Card> with cards (depending on number of decks).
	
	//			Example: Deck(1) will build one 52-card deck.  There are 52 different cards
	//			2 clubs, 3 clubs... Ace clubs, 2 hearts, 3 hearts... Ace hearts, etc
	
	//			Deck(2) will create an array of 104 cards.
	
	
	//	TODO: Add a draw() method that will take a card from the deck and
	//			return it to the caller
	ArrayList<Card> cards = new ArrayList();
	
	public Deck(int x) {
		for(int i =0; i < x ; i++) {
			eSuit es = null;
			for(int s = 1; s <= 4; s++) {
				
				switch (s)
				{
				case 1:
					es = eSuit.CLUBS;
					break;
				case 2:
					es = eSuit.DIAMONDS;
					break;
				case 3:
					es = eSuit.HEARTS;
					break;
				case 4:
					es = eSuit.SPADES;
				}
				
				// Starts at 2 so we don't have jokers for blackjack
				for(int r = 2; r <= 14; r++) {
					switch (r)
					{
					case 1:
						cards.add(new Card(eRank.JOKER, es));
						break;
					case 2:
						cards.add(new Card(eRank.TWO, es));
						break;
					case 3:
						cards.add(new Card(eRank.THREE, es));
						break;
					case 4:
						cards.add(new Card(eRank.FOUR, es));
						break;
					case 5:
						cards.add(new Card(eRank.FIVE, es));
						break;
					case 6:
						cards.add(new Card(eRank.SIX, es));
						break;
					case 7:
						cards.add(new Card(eRank.SEVEN, es));
						break;
					case 8:
						cards.add(new Card(eRank.EIGHT, es));
						break;
					case 9:
						cards.add(new Card(eRank.NINE, es));
						break;
					case 10:
						cards.add(new Card(eRank.TEN, es));
						break;
					case 11:
						cards.add(new Card(eRank.JACK, es));
						break;
					case 12:
						cards.add(new Card(eRank.QUEEN, es));
						break;
					case 13:
						cards.add(new Card(eRank.KING, es));
						break;
					case 14:
						cards.add(new Card(eRank.ACE, es));
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
