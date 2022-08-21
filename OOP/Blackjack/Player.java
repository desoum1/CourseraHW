import java.util.ArrayList;
public class Player {

  private String nickName;
  private int playerNumOfCards;
  ArrayList<Card> playerHand;
  
  
    public Player (String name){
    this.nickName = name;
    playerHand = new ArrayList<Card>();

  }

  public String getNickName() {
    return nickName;
   }

  public void receiveCard(Card aCard){
    playerHand.add(aCard);
    this.playerNumOfCards++;
   }
   
  public void showHand(){
      for(int i = 0;i<playerNumOfCards; i++){
      System.out.println(playerHand.get(i).getName() + " of " + playerHand.get(i).getSuit());
      
      
    
    }
  }
   
  public int valueOfHand(){
    int totalSum = 0;
    int numAces = 0;
    for(Card countSum: playerHand){
        if(countSum.getPoints() == 1){
            numAces++;
            totalSum+=11;
            } else if (countSum.getPoints() > 10){
                totalSum+=10;
            }else {
                totalSum += countSum.getPoints();
            }
    }
    while(totalSum>21 & numAces > 0){
            totalSum -= 10;
            numAces--;
    }
    return totalSum;
   } 
  
}