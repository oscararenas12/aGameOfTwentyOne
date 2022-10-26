import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String userName;
    Scanner in = new Scanner(System.in);

    System.out.println("**Welcome to A Game Of Twenty One**");
    System.out.println("Enter user name: ");
    userName = in.nextLine();

    Player user = new Player(userName);
    Player user = new Player("Computer");
  }
}
