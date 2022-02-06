
/**
 * Write a description of Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main {
    public static void main(String[] args){    
        Card a = new Card("Jack","Spades");
        System.out.println(a.Points);
        Card b = new Card("7","Hearts");
        System.out.println(b.Points);
        Card c = new Card("Ace","Clubs");
        System.out.println(c.Points);
        Deck d = new Deck();
        System.out.println(d.cards.size());
    
    }
}
