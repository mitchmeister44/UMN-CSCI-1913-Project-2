package student;

/**
 * Write a description of class UnoWarMatch here.
 *
 * @author Mitchell Smith
 * @version Written and compiled on 11/10/23
 */
public class UnoWarMatch
{
    private AI ai1;
    private AI ai2;

    /**
     * Constructor for objects of class UnoWarMatch
     */
    public UnoWarMatch(AI ai1, AI ai2)
    {
        this.ai1 = ai1;
        this.ai2 = ai2;
    }

    public boolean playGame() {
        Deck deck = new Deck();
        Hand hand1 = new Hand(deck, 5);
        Hand hand2 = new Hand(deck, 5);
        CardPile pile;
        Card play1;
        Card play2;
        int wins1 = 0;
        int wins2 = 0;
        int toGoFirst = 1;
        boolean roundWin = false;
        while(wins1 < 10 || wins2 < 10) {
            roundWin = false;
            pile = new CardPile(deck.draw());
            if(toGoFirst == 1) {
                while(!roundWin) {
                    play1 = ai1.getPlay(hand1, pile);
                    if(play1 == null) {
                        wins2++;
                        toGoFirst = 2;
                        roundWin = true;
                    } else {
                        hand1.remove(play1);
                    }
                    play2 = ai2.getPlay(hand2, pile);
                    if(play2 == null) {
                        wins1++;
                        toGoFirst = 1;
                        roundWin = true;
                    } else {
                        hand2.remove(play2);
                    }
                }
            }
            if(toGoFirst == 2) {
               while(!roundWin) {
                    play2 = ai2.getPlay(hand2, pile);
                    if(play2 == null) {
                        wins1++;
                        toGoFirst = 1;
                        roundWin = true;
                    } else {
                        hand2.remove(play2);
                    }
                    play1 = ai1.getPlay(hand1, pile);
                    if(play1 == null) {
                        wins2++;
                        toGoFirst = 2;
                        roundWin = true;
                    } else {
                        hand1.remove(play1);
                    }
                } 
            }
        }
        return wins1 > wins2;
    }
    
    public double winRate(int nTrials) {
        int wins1 = 0;
        int wins2 = 0;
        for(int i = 0; i < nTrials; i ++) {
            if(playGame()) {
                wins1++;
            } else {
                wins2++;
            }
        }
        return wins1/wins2;
    }
}
