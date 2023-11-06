package Student;


/**
 * Write a description of class Tournament here.
 *
 * @author Mitchell Smith
 * @version Written and compiled on 11/10/23
 */
public class Tournament
{
    public static void main (String[] args) {
        AI r1 = new AI();
        AI r2 = new AI();
        AI s1 = new SmallestCardAI();
        AI s2 = new SmallestCardAI();
        AI b1 = new BiggestCardAI();
        AI b2 = new BiggestCardAI();
        
        System.out.println(new UnoWarMatch(r1, r2).playGame());
        
        /*
        UnoWarMatch match = new UnoWarMatch(r1, r2);
        System.out.println("Random Card AI vs. Random Card AI winRate: " + match.winRate(2));
        
        match = new UnoWarMatch(r1, s1);
        System.out.println("Random Card AI vs. Random Card AI winRate: " + match.winRate(2));

        match = new UnoWarMatch(r1, b1);
        System.out.println("Random Card AI vs. Random Card AI winRate: " + match.winRate(2));
        
        match = new UnoWarMatch(s1, r1);
        System.out.println("Random Card AI vs. Random Card AI winRate: " + match.winRate(2));
        
        match = new UnoWarMatch(s1, s2);
        System.out.println("Random Card AI vs. Random Card AI winRate: " + match.winRate(2));
        
        match = new UnoWarMatch(s1, b1);
        System.out.println("Random Card AI vs. Random Card AI winRate: " + match.winRate(2));
        
        match = new UnoWarMatch(b1, r1);
        System.out.println("Random Card AI vs. Random Card AI winRate: " + match.winRate(2));
        
        match = new UnoWarMatch(b1, s1);
        System.out.println("Random Card AI vs. Random Card AI winRate: " + match.winRate(2));
        
        match = new UnoWarMatch(b1, b2);
        System.out.println("Random Card AI vs. Random Card AI winRate: " + match.winRate(2));
        */
    }
}
