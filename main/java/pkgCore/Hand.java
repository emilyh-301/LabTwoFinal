package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

public class Hand {

	private int iScore;
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public Hand()
	{
		
	}
	
	public int[] ScoreHand()
	{
		int [] iScore = new int[2];
		
		iScore[0] = 5;
		iScore[1] = 10;
		
		Collections.sort(cards);
		
		int score = 0; 
		
		for (Card c: cards)
		{
			//	TODO: Determine the score.  
			//			Cards:
			//			2-3-4 - score = 9
			//			5-J-Q - score = 25
			//			5-6-7-2 - score = 20
			//			J-Q	- score = 20
			//			8-A = score = 9 or 19
			//			4-A = score = 5 or 15
			switch(c.getERank)
			{
			case TWO:
				score +=2;
				break;
			case THREE:
				score+=3;
				break;
			case FOUR:
				score+=4;
				break;
			case FIVE:
				score +=5;
				break;
			case SIX:
				score+=6;
				break;
			case SEVEN:
				score+=7;
				break;
			case EIGHT:
				score+=8;
				break;
			case NINE:
				score+=9;
				break;
			case TEN: case JACK: case KING: case QUEEN: 
				score+=10
			case ACE:
				if (score + 11 > 21) {
					score+=1;
				}else {
					score+=11;
				}
				break;
				}
			}
		}
		
		return iScore;
	}
	
	public void Draw(Deck d)
	{
		//	TODO: add a card to 'cards' from a card drawn from Deck d
		cards.add(d.draw());
	}
	
	private void AddCard(Card c)
	{
		cards.add(c);
	}
	
}
