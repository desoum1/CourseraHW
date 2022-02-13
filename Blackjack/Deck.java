import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of Deck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deck {
   //Card[] cards = new Card[52];
   ArrayList<Card> cards = new ArrayList<Card>();
   
   int cardsDealt= 0;
   String [] suits = {"Diamonds","Clubs","Hearts","Spades"};
   String [] CardNum = {"Ace","2","3","4","5","6","7","8","9","10",
       "Jack","Queen","King",};
       
   public Deck(){
       this.cards = cards;
       CreateFullDeck();
     }    
   
   public void CreateFullDeck(){
       for(int i = 0;i<=3; i++){
           for(int j = 0; j<=12; j++){
       
               Card Y = new Card (CardNum[j],suits[i]);
               this.cards.add(Y);
            }
        }
    
    }
   /*public void DeckShuffle(){
     int index;
     int temp;
     Random random = new Random();
     for (int i = this.cards.size() - 1; i > 0; i--)
     {
        index = random.nextInt(i + 1);
        temp = this.cards.get(index);
        this.cards.get(index) = this.cards.get(i);
        this.cards[i] = temp;
        }
    
    }*/
   public void shuffle(){
        Random r = new Random();
        for(int i = 0; i<this.cards.size(); i++){
            int randomIndexToSwap = r.nextInt(this.cards.size());
            Card temp = this.cards.get(i);
            this.cards.set(i, this.cards.get(randomIndexToSwap));
            this.cards.set(randomIndexToSwap, temp);
        }
    }
   public void printDeck(){
      for(int i = 0; i<this.cards.size(); i++){
                System.out.println(this.cards.get(i).getName() + " of " + 
                this.cards.get(i).getSuit());
      }
   }
   public Card deal(){
       Card topdeck = cards.get(0);
       cards.remove(0);
       return topdeck;
   }
}
