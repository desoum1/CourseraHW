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
                
                
            }
        Deck d = new Deck();
        d.printDeck();
        d.shuffle();
        //d.printDeck();
        
        for (int i=0;i<player.length; i++){

                System.out.println(player[i]+" "+"enter current bet:");
                currentBet = IO.readDouble();
                if(currentBet> player[i].getBankRoll()){
                    System.out.println("That is greater than the amount in your account");
                    return;
                }
        }
        for(int i = 0;i<player.length; i++){

            player[i].addCard(d.deal());
            player[i].addCard(d.deal());
            player[i].showHand(true);
            System.out.println(player[i].valueOfHand());
        }
    }