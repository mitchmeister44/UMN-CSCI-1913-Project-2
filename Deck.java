package student;
import java.util.Random;
public class Deck {
    private Card[] deck = new Card[52];
    private int leftToShuffle = 52;
    public Deck() {
        int counter = 0;
        Card toAdd;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 13; j++) {
                toAdd = new Card(j, i);
                deck[counter] = toAdd;
                counter++;
            }
        }
        shuffle();
    }

    public void shuffle() {
        int j;
        Card first;
        Card second;
        Random rand = new Random();
        for (int i = this.deck.length - 1; i > 0; i--) {
            j = rand.nextInt(i);
            first = deck[i];
            second = deck[j];
            deck[i] = second;
            deck[j] = first;
        }
    }

    public Card draw() {
        Card toDraw;
        if (isEmpty()) {
            shuffle();
            leftToShuffle = 52;
        }
        toDraw = deck[deck.length - leftToShuffle];
        leftToShuffle--;
        return toDraw;
    }

    public int cardsRemaining() {
        return leftToShuffle;
    }

    public boolean isEmpty() {
        return cardsRemaining() == 0;
    }
}
