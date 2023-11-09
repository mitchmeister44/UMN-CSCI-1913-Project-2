package student;
/**
 * Write a description of class CardPile here.
 *
 * @author Mitchell Smith
 * @version Written and compiled on 11/10/23
 */
public class CardPile {
    private Card topCard;
    private int numCards;
    /**
     * Constructor for objects of class CardPile.
     */
    public CardPile(Card topCard) {
        this.topCard = topCard;
        this.numCards = 1;
    }

    /**
     * 
     */
    public boolean canPlay(Card card) {
        if (card == null) {
            return false;
        }
        if (card.getRankNum() >= topCard.getRankNum()) {
            return true;
        }
        if (card.getSuitName() == topCard.getSuitName()) {
            return true;
        }
        return false;
    }

    public void play(Card card) {
        if (canPlay(card) == false) {
            System.out.println("Illegal move detected!");
        } else {
            numCards++;
            topCard = card;
        }
    }

    public int getNumCards() {
        return numCards;
    }

    public Card getTopCard() {
        return topCard;
    }
}
