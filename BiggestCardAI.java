package student;


/**
 * Write a description of class BiggestCardAI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BiggestCardAI extends AI {
    @Override
    public Card getPlay(Hand hand, CardPile cardPile) {
        Card returnCard = null;
        Card referenceCard = null;
        for (int i = 0; i < hand.getSize(); i ++) {
            if (cardPile.canPlay(hand.get(i)) == true) {
                referenceCard = hand.get(i);
                if (returnCard == null) {
                    returnCard = referenceCard; 
                }
                if (returnCard.getRankNum() < referenceCard.getRankNum()) {
                    returnCard = referenceCard;
                }
            }
        }
        return returnCard;
    }

    @Override
    public String toString() {
        return "Biggest Card AI";
    }
}
