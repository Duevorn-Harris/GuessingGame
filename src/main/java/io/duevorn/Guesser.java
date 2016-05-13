package io.duevorn;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by duevornharris on 4/28/16.
 */

public class Guesser {
    int guess = 0;

        public int promptForGuess() {
            System.out.println("Please input a number?");
            Scanner guesser = new Scanner(System.in);
            guess = guesser.nextInt();
            return guess;
        }

        public int getGuess() {
            return guess;
        }

}
