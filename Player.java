
public class Player{
  private String userName;
  private Die playerDice;
  private int score;
  private int playerHand;

  public Player(String name){
    userName = name;
    playerDice = new Die(6);
    score = 0;
    playerHand = 0;
  }

  public boolean playerRoll(){
    boolean stillInOrOut;
    playerDice.roll();
    if(this.playerHand < 22){
      stillInOrOut = true;
      this.playerHand = this.playerHand + playerDice.getValue();
    }
    else
      stillInOrOut = false;
      System.out.println("Hand is over 21");

    return stillInOrOut;
  }

  public void loseOrWin(boolean l){
    if(l == true){
      score++;
    }
  }

  public String getName(){
    return userName;
  }

  public int getScore(){
    return score;
  }

  public int playerHand(){
    return playerHand;
  }

  public String toString(){
    return "Currently " + userName +
           "/nHand: " + playerHand +
           "/nSocre: " + score;
  }

}
