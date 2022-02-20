import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main {
    public static void main(String[] args){    
        Scanner input = new Scanner(System.in);
        ArrayList<Player> Players = new ArrayList<Player>();
        ArrayList<Boolean> endgame = new ArrayList<Boolean>();
            
            /*Card a = new Card("Jack","Spades");
            System.out.println(a.Points);
            Card b = new Card("7","Hearts");
            System.out.println(b.Points);
            Card c = new Card("Ace","Clubs");
            System.out.println(c.Points);
            
            System.out.println(d.cards.size());
            */
            
        System.out.println("Welcome to BlackJack");
        System.out.println("How many people are playing?");
        int playernum =  input.nextInt();
        System.out.println(playernum);
        for(int x =1; x<=playernum; x++){
                
                System.out.println("Input player " + x + " name.");
                String nametemp = input.next();
                
                //Players.add(nametemp);
                Players.add(new Player(nametemp));
                endgame.add(false);
                
            }
        Deck d = new Deck();
        //d.printDeck();
        d.shuffle();
        //d.printDeck();
        
        /*for (int i=0;i<Players.size(); i++){

                System.out.println(Players.get(i)+" "+"enter current bet:");
                int currentBet = input.nextInt();
                if(currentBet> Players.get(i)){
                    System.out.println("That is greater than the amount in your account");
                    return;
                }
        }*/
        for(int i = 0;i<Players.size(); i++){

            Players.get(i).receiveCard(d.deal());
            Players.get(i).receiveCard(d.deal());
            Players.get(i).showHand();
            System.out.println(Players.get(i).valueOfHand());
            
        }
        boolean gameover = false;
        while(endgame.contains(false)){
            for(int i = 0;i<Players.size(); i++){
              System.out.println("Your points are " + Players.get(i).valueOfHand() + 
              ",would you like to HIT or STAND");
              String choice = input.next();
              if(endgame.get(i) == false){
                  if(choice == "HIT"){
                     Players.get(i).receiveCard(d.deal());
                     Players.get(i).showHand();
                     System.out.println(Players.get(i).valueOfHand());
                  }else{
                     endgame.set(i,true);
                  }
              }else{
               System.out.println("Player has already stood");
               }
              if(Players.get(i).valueOfHand() > 21){
                System.out.println("player is out");
                endgame.set(i,true);
                }
            }
              
        }
        
    }
}