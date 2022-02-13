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

  public int valueOfHand(){
    int totalSum = 0;
    for(Card countSum: playerHand){
        totalSum = totalSum + countSum.getPoints();
    }
    return totalSum;
   }

}