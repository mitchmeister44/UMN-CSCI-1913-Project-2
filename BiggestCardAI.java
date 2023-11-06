package Student;


/**
 * Write a description of class BiggestCardAI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BiggestCardAI extends AI
{
    
    @Override
    public Card getPlay(Hand hand, CardPile cardPile) {
        Card[] validCards = new Card[hand.getSize()];
        int maxRankNum = 1; 
        Card returnCard = new Card(1,1);
        for(int i = 0; i < hand.getSize(); i ++) {
            if(cardPile.canPlay(hand.get(i)) == true) {
                validCards[i] = hand.get(i);
            }
        }
        for(int i = 0; i < validCards.length; i ++) {
            if(validCards[i] == null) {
                continue;
            } else if(validCards[i].getRankNum() >= maxRankNum) {
                returnCard = validCards[i];
                maxRankNum = validCards[i].getRankNum();
            }
        }
        return returnCard;
    }
       
    @Override
    public String toString() {
        return "Biggest Card AI";
    }
}
