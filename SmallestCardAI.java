package student;

/**
 * Write a description of class SmallestCardAI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SmallestCardAI extends AI
{
    
    @Override
    public Card getPlay(Hand hand, CardPile cardPile) {
        Card[] validCards = new Card[hand.getSize()];
        int minRankNum = 13; 
        Card returnCard = new Card(1,1);
        for(int i = 0; i < hand.getSize(); i ++) {
            if(cardPile.canPlay(hand.get(i)) == true) {
                validCards[i] = hand.get(i);
            }
        }
        for(int i = 0; i < validCards.length; i ++) {
            if(validCards[i] == null) {
                continue;
            } else if(validCards[i].getRankNum() <= minRankNum) {
                returnCard = validCards[i];
                minRankNum = validCards[i].getRankNum();
            }
        }
        return returnCard;
    }

    @Override
    public String toString() {
        return "Smallest Card AI";
    }
}
