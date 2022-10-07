public class SpinnerGame
{
/** Precondition: min < max
* Simulates a spin of a spinner by returning a random integer
* between min and max, inclusive.
*/
public int spin(int min, int max)
{  int range = (max - min) + 1;
   return (int)(Math.random() * range) + min;}
 
/** Simulates one round of the game as described in part (b).
*/
public void playRound()
{ int playerSpin1;
  int computerSpin1;
  int playerSpin2;
  int computerSpin2;
   playerSpin1 = spin(1, 10);
   computerSpin1 = spin(2,8);
   System.out.println("playerSpin1 = " + playerSpin1);
   System.out.println("computerSpin1 = " + computerSpin1);
   if( playerSpin1 == computerSpin1)
     {System.out.println("Tie. 0 points");
     playerSpin2 = spin(1, 10);
     computerSpin2 = spin(2,8);
     System.out.println("playerSpin2 = " + playerSpin2);
     System.out.println("computerSpin2 = " + computerSpin2);
     if(playerSpin2 == computerSpin2)
         {System.out.println("Tie. 0 points");}
     else if(playerSpin2> computerSpin2)
         {System.out.println("You win! " + (playerSpin2 - computerSpin2) + " points" );}
     else{System.out.println("You lose. " + (playerSpin2 - computerSpin2) + " points");}
}
   else if(playerSpin1> computerSpin1){
   System.out.println("You win! " + (playerSpin1 - computerSpin1) + " points" );}
   else{System.out.println("You lose. " + (playerSpin1 - computerSpin1) + " points");}

}
}

