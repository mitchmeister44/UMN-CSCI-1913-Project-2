package student;


/**
 * Write a description of class Tournament here.
 *
 * @author Mitchell Smith
 * @version Written and compiled on 11/10/23
 */
public class Tournament {
    public static void main(String[] args) {
        AI r = new AI();
        AI s = new SmallestCardAI();
        AI b = new BiggestCardAI();

        UnoWarMatch match = new UnoWarMatch(r, r);
        System.out.println("Random Card AI vs. Random Card AI winRate: " + match.winRate(1000));

        match = new UnoWarMatch(r, s);
        System.out.println("Random Card AI vs. Smallest AI winRate: " + match.winRate(1000));

        match = new UnoWarMatch(r, b);
        System.out.println("Random Card AI vs. Biggest Card AI winRate: " + match.winRate(1000));

        match = new UnoWarMatch(s, r);
        System.out.println("Smallest Card AI vs. Random Card AI winRate: " + match.winRate(1000));

        match = new UnoWarMatch(s, s);
        System.out.println("Smallest Card AI vs. Smallest Card AI winRate: " + match.winRate(1000));

        match = new UnoWarMatch(s, b);
        System.out.println("Smallest Card AI vs. Biggest Card AI winRate: " + match.winRate(1000));

        match = new UnoWarMatch(b, r);
        System.out.println("Biggest Card AI vs. Random Card AI winRate: " + match.winRate(1000));

        match = new UnoWarMatch(b, s);
        System.out.println("Biggest Card AI vs. Smallest Card AI winRate: " + match.winRate(1000));

        match = new UnoWarMatch(b, b);
        System.out.println("Biggest Card AI vs. Biggest Card AI winRate: " + match.winRate(1000));
    }
}
