package Student;
import java.util.Random;
public class Deck {
    private Card[] deck = new Card[52]; 
    private int leftToShuffle = 52;
    public Deck() {
        final String[] ranks = Card.ranks;
        final String[] suits = Card.suits;
        int counter = 0;
        Card toAdd;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                toAdd = new Card(j+1,i+1);
                deck[counter] = toAdd;
                counter++;
            }
        }
        shuffle();
        /*
        for(int i = 0; i < deck.length; i++) {
            System.out.print(deck[i] + " ");
        }*/
    }
    public void shuffle() {
        int j;
        Card first;
        Card second;
        Random rand = new Random();
        for(int i = this.deck.length; i > 1; i--) {
            j = rand.nextInt(i);
            first = deck[i-1];
            second = deck[j];
            deck[i-1] = second;
            deck[j] = first;
        }
    }
    public Card draw() {
        Card toDraw;
        if(leftToShuffle > 0) {
            toDraw = deck[deck.length - leftToShuffle];
            leftToShuffle--;
            return toDraw;
        }
        else {
            shuffle();
            leftToShuffle = 52;
            toDraw = deck[deck.length - leftToShuffle];
            leftToShuffle--;
            return toDraw;
        }
    }
    public int cardsRemaining() {
        return leftToShuffle;
    }
    public boolean isEmpty() {
       return leftToShuffle == 0; 
    }
}