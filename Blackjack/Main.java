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
            System.out.println("");
            System.out.println("");
            if(Players.get(i).valueOfHand()== 21){
                System.out.println(Players.get(i).getNickName() +"  you have a natural");
                endgame.set(i,true);
            }
        }
        boolean gameover = false;
        while(endgame.contains(false)){
            for(int i = 0;i<Players.size(); i++){
              
              if(endgame.get(i) == false){
                  System.out.println(Players.get(i).getNickName() + " Your points are " + Players.get(i).valueOfHand() + 
                  ",would you like to HIT or STAND");
                  String choice = input.next().toUpperCase();
                      
                  System.out.println(choice);
                  if(choice.equals( "HIT".toUpperCase())){
                     Players.get(i).receiveCard(d.deal());
                     System.out.println("");
                     Players.get(i).showHand();
                     System.out.println("your hand is worth  " + Players.get(i).valueOfHand());
                  }else{
                     endgame.set(i,true);
                     System.out.println("player ended game");
                     
                  }
              }else{
               System.out.println(Players.get(i).getNickName() + " has already stood");
               }
               if(Players.get(i).valueOfHand()== 21){
                System.out.println(Players.get(i).getNickName() +"  you have hit 21.");
                endgame.set(i,true);
              }
              if(Players.get(i).valueOfHand() > 21){
                System.out.println(Players.get(i).getNickName() + " is out");
                endgame.set(i,true);
                }
            }
              
        }
         System.out.println("");
            System.out.println("- Dealers turn -");
        boolean endgamedealer = false;
        
        
        int playerBustCount = 0;
        Player dealer = new Player("dealer");
            for(int i = 0;i<Players.size(); i++){
            if(Players.get(i).valueOfHand() > 21){
                playerBustCount += 1;
            }
        }
        
        if(playerBustCount == Players.size()){
            System.out.println("Dealer wins");
        }else{
            
                while (endgamedealer == false){
               if (dealer.valueOfHand() <= 17) {
                  dealer.receiveCard(d.deal());
                   dealer.showHand();
                   System.out.println(" ");
                    }
                        
               if(dealer.valueOfHand() == 21){
                 System.out.println("Dealer has 21");
                  endgamedealer = true;
                        }
                Player highestPointPlayer = Players.get(0);
                    int highestPoint = 0;
                        if (dealer.valueOfHand() > 21) {
                  System.out.println("Dealer busted and got a total of " + dealer.valueOfHand());
                  endgamedealer = true;
                  for(int i = 0;i<Players.size(); i++){
                      if(Players.get(i).valueOfHand() > highestPoint){
                               highestPoint = Players.get(i).valueOfHand();
                               highestPointPlayer = Players.get(i); 
                      }
                        }
                   System.out.println(highestPointPlayer.getNickName() + (", YOU WIN!"));  
               }
               
            }
           
        }
        
        
}
}