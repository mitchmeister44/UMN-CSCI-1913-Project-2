package Student;

/**
 * Write a description of class Hand here.
 *
 * @author Mitchell Smith
 * @version Written and compiled on 11/10/23
 */
public class Hand
{
    private Card[] deckHand;
    private int size;
    private Deck deck;
    /**
     * Constructor for objects of class Hand
     */
    public Hand(Deck deck, int size)
    {
        this.deckHand = new Card[size];
        this.size = size;
        this.deck = deck;
        deck.shuffle();
        for(int i = 0; i < size; i ++) {
            deckHand[i] = deck.draw();
        }
    }

    public int getSize() {
        return size;
    }

    public Card get(int i) {
        if(i > deckHand.length || i < 0) {
            System.out.println("Invalid hand index!");
            return deckHand[0];
        } else {
            return deckHand[i];
        }
    }

    public boolean remove(Card card) {
        for(int i = 0; i < deckHand.length; i ++) {
            if(deckHand[i] == card) {
                deckHand[i] = deck.draw();
                return true;
            }
        }
        return false;
    }
}
