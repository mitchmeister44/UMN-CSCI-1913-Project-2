package Student;
import java.util.*;
public class Card {
    private String rankName;
    private String suitName;
    private int rankNum;
    public static String[] ranks = new String[] {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
    public static String[] suits = new String[] {"Spades","Hearts","Clubs","Diamonds"};
    public Card (int rank, int suit) {
        if(rank > 13 || rank < 0) {
            rankName = ranks[0];
            suitName = suits[0];
            rankNum = 1;
            System.out.println("Invalid Card");
        } else if (suit > 4 || suit < 0) {
            rankName = ranks[0];
            suitName = suits[0];
            rankNum = 1;
            System.out.println("Invalid Card");
        } else {
            rankName = ranks[rank-1];
            suitName = suits[suit-1];
            rankNum = rank;
        }
    }

    public int getRankNum() {
        return rankNum;
    }

    public String getRankName() {
        return rankName;
    }

    public String getSuitName() {
        return suitName;
    }

    @Override
    public String toString() {
        return rankName + " of " + suitName;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        else if (obj == null){
            return false;
        }
        else if (obj instanceof Card){
            Card cd = (Card) obj;
            return this.rankName == cd.rankName && this.suitName == cd.suitName;
        }
        else{
            return false;
        }
    }
}