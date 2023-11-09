package student;

/**
 * Write a description of class UnoWarMatch here.
 *
 * @author Mitchell Smith
 * @version Written and compiled on 11/10/23
 */
public class UnoWarMatch {
    private AI ai1;
    private AI ai2;

    /**
     * Constructor for objects of class UnoWarMatch.
     */
    public UnoWarMatch(AI ai1, AI ai2) {
        this.ai1 = ai1;
        this.ai2 = ai2;
    }

    public int playRound(int toGoFirst, Deck deck, Hand hand1, Hand hand2) {
        int roundWin = 1;
        CardPile pile = new CardPile(deck.draw());
        Card play1;
        Card play2;
        while (true) {
            if (toGoFirst == 1) {
                play1 = ai1.getPlay(hand1, pile);
                if (play1 == null) {
                    roundWin = 2;
                    break;
                } else if (play1 != null) {
                    pile.play(play1);
                    hand1.remove(play1);
                    toGoFirst = 2;
                }
            }
            if (toGoFirst == 2) {
                play2 = ai2.getPlay(hand2, pile);
                if (play2 == null) {
                    roundWin = 1;
                    break;
                } else if (play2 != null) {
                    pile.play(play2);
                    hand1.remove(play2);
                    toGoFirst = 1;
                }
            }
        }
        return roundWin;
    }

    public boolean playGame() {
        Deck deck = new Deck();
        Hand hand1 = new Hand(deck, 5);
        Hand hand2 = new Hand(deck, 5);
        int wins1 = 0;
        int wins2 = 0;
        int toGoFirst = 1;
        int roundResult;
        while (wins1 <= 10 && wins2 <= 10) {
            roundResult = playRound(toGoFirst, deck, hand1, hand2);
            if (roundResult == 1) {
                wins1 ++;
                toGoFirst = 1;
            }
            if (roundResult == 2) {
                wins2++;
                toGoFirst = 2;
            }
        }
        return wins1 > wins2;
    }

    public double winRate(int nTrials) {
        double wins1 = 0.0;
        boolean currentGame;
        for (int i = 0; i <= nTrials; i ++) {
            currentGame = playGame();
            if (currentGame) {
                wins1 += 1.0;
            }
        }
        return wins1 / nTrials;
    }
}
