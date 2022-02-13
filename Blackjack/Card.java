
/**
 * Write a description of Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card {
    String Rank;
    String Suit;
    int Points;
    Boolean Ace;
    public Card (String Rank, String Suit){
        this.Rank = Rank;
        this.Suit = Suit;
        String [] cardexception = {"Jack","Queen","King"};
        if (Rank == "Jack" || Rank == "Queen" || Rank == "King"){
            this.Points = 10;
        }else if(Rank == "Ace"){
            this.Points = 1;
        }else{
            Points  = Integer.parseInt(Rank);
        }
        
        
        if (Rank == "Ace"){
            this.Ace = true;
        }else{
            this.Ace = false;
        }
        
    }
    public String getName(){
        return Rank;
    }
    public int getPoints(){
        return Points;
    }
    public String getSuit(){
        return Suit;
    }
    public boolean isAce(){
        return Ace;
    }
}
