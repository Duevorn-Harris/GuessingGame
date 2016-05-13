package io.duevorn;
import java.util.Random;

/**
 * Created by duevornharris on 4/29/16.
 */

public class Game {

    //initialze variables to be passed in
    int numberOfTries = 0;
    int guess = 0;
    int lastGuess = 0;
    int random = 0;

    public int newRandomNumber() {
        //generate a random secret number
        Random randomNumber = new Random();
        random = randomNumber.nextInt(100);
        return random;
    }

    //message to be displayed if the guess is to big
    public void outputTooBig(int guess) {
        if (guess > random) {
            System.out.println("The guess is too large!");
        }
    }

    //message to be displayed if the guess is too small
    public void outputTooSmall(int guess) {
        if (guess < random) {
            System.out.println("The guess is too small!");
        }
    }

    //message to be displayed if the guess is right on
    public boolean victory(int guessInt, int randomInt) {
        if (guessInt == randomInt) {
            System.out.println("That is the correct guess!");
            return true;
        } else return false;

    }

    //message to be displayed for guessing consecutive numbers
    public void consecutiveNumbers(int guess, int lastGuess) {
        if (guess == lastGuess) {
            System.out.println("You shouldn't guess the same number twice!");
        }
    }

    public void displayNumberOfTries() {
        System.out.println("The number of tries is " + numberOfTries);
    }

    public int lastGuessEqualsNextGuess(int firstGuess) {
        return lastGuess = firstGuess;
    }

    public void incrementCounter(int guess, int lastGuess){
       if(guess != lastGuess) {
           numberOfTries++;
       }

    }


    public void runGame() {

        newRandomNumber();
        Guesser newGuess = new Guesser();
        while (!victory(guess, random)) {
            newGuess.promptForGuess();
            guess = newGuess.getGuess();
            outputTooBig(guess);
            outputTooSmall(guess);
            incrementCounter(guess, lastGuess);
            consecutiveNumbers(guess, lastGuess);
            lastGuessEqualsNextGuess(guess);
            displayNumberOfTries();

        }

    }
}
