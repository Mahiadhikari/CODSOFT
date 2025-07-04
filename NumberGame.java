package Task1_NumberGame;
import java.util.*;
public class NumberGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int lowerBound=1;
        int upperBound=100;
        int rounds=0;
        int totalScore=0;
         System.out.println("WELCOME TO THE NUMBER GUESSING GAME!!");
         boolean playAgain;

         do{
            rounds++;
            int numberToGuess=random.nextInt(upperBound-lowerBound+1)+ lowerBound;
            int attemptsLeft=5;
            boolean hasGuessedCorrectly=false;
             System.out.println("\nRound " + rounds + ": Guess a number between "+ lowerBound + " and " + upperBound);

             while (attemptsLeft>0){
                System.out.print("Enter your guess: ");
                int guess;
                 
                if(sc.hasNextLine()){
                    guess=sc.nextInt();
                }
                else{
                    System.out.println("Invalid Input! Please enter a number.");
                    sc.next();
                    continue;
                }
                if(guess == numberToGuess){
                    System.out.println("Congratulations! You guessed the number.");
                    hasGuessedCorrectly=true;
                    totalScore +=10;
                     break;
                }
                else if(guess < numberToGuess){
                    System.out.println("Too low!");
                }
                else{
                    System.out.println("Too high!");
                }
                attemptsLeft--;
                System.out.println("Attempts left: "+ attemptsLeft);
             }
             if(!hasGuessedCorrectly){
                System.out.println("Sorry! The correct number was: " + numberToGuess);
                totalScore-=5;
             }
             System.out.println("\nDo you want to play another round? (yes/no): ");
             sc.nextLine();
             String choice = sc.nextLine().trim().toLowerCase();

             playAgain =choice.equals("yes");
         }
         while(playAgain);
         System.out.println("\nThanks for playing!");
         System.out.println("Rounds played: "+ rounds);
         System.out.println("Your total score: "+ totalScore);
    }
}
