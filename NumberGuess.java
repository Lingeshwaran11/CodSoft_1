package codSoftJava;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
	private final int number;
    private int attempt=0;
    private final int max;

    public NumberGuess(int max) {
        Random random = new Random();
        number = random.nextInt(100) + 1;
        attempt = 0;
        this.max = max;
    }
    public void gameplay() { 
        Scanner scanner = new Scanner(System.in);

        System.out.println("     Guessing Game - CodSoft     ");
        System.out.println("*******************************");
        System.out.println("I have a number in mind, and it falls within the range of 1 to 100.");

        while (attempt < max) {
            System.out.print("Guessing attempt " + (attempt + 1) + ": ");
            int guessnumber = scanner.nextInt();
            attempt++;

            if (guessnumber < number) {
                System.out.println("It is beneath the desired level!");
            } else if (guessnumber > number) {
                System.out.println("The number is greater than what I have in mind!");
            } else {
                System.out.println("Congratulations! You successfully identified the number within " + attempt + " attempts.");
                scanner.close();
                return;
            }
        }

        System.out.println("Apologies, you have hit the maximum allowable attempts..");
        System.out.println("The number was: " + number);
        
        scanner.close();
    }
    public static void main(String[] args) {
        int maxAttempts = 5; // attempts limit
        NumberGuess guessingGame = new NumberGuess(maxAttempts);
        guessingGame.gameplay();
    }
}

