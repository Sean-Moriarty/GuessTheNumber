import java.util.Random;
import java.util.Scanner;

class GuessTheNumber {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      Random rand = new Random();
      final int ANSWER = rand.nextInt(10);
      int guesses = 0;
      int guess;
      
      System.out.println("Guess a number between 1 and 10");
      System.out.print(" >>> ");
      guess = in.nextInt();
      
      if (guess == ANSWER) {
         System.out.println("Congratulations! You guessed the number on your first try!");
      } else {
         while (guess != ANSWER) {
            System.out.println("Sorry. Try again.");
            guesses++;
            System.out.print(" >>> ");
            guess = in.nextInt();
         }
      }
      
      System.out.println("Congratulations! You guessed the number in " + guesses + " tries!");
   }
}