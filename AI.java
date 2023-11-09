package student;

/**
 * Write a description of class AI here.
 *
 * @author Mitchell Smith
 * @version Written and compiled on 11/10/23
 */
public class AI {
    public Card getPlay(Hand hand, CardPile cardPile) {
        for (int i = 0; i < hand.getSize(); i++) {
            if (cardPile.canPlay(hand.get(i)) == true) {
                return hand.get(i);
            }
        }
        return null;
    }

    public String toString() {
        return "Random Card AI";
    }
}
