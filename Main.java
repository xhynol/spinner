import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    
    SpinnerGame a = new SpinnerGame();
    System.out.println("Please enter Yes or No \nWould you like to spin a round?:");
    Scanner input = new Scanner(System.in);
    String answer = input.nextLine();
    if(answer.toLowerCase().equals("yes")){
      boolean play = true;
      while(play==true){
        a.playRound();
        System.out.println("do you want to play again?");
        answer = input.nextLine();
        if(answer.toLowerCase().equals("no")){
          play = false;
           System.out.println("Ok bye");
      }}
      
    }
    else{
      System.out.println("Ok bye");
    }
  }
  }
