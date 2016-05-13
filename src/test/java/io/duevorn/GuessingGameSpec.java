package io.duevorn;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by duevornharris on 4/29/16.
 */
public class GuessingGameSpec {
    @Test
    public void newRandomNumberTest(){
        Game game = new Game();
        Random newRandomNumber = new Random();
        int randomNumber = newRandomNumber.nextInt(100);
        boolean topOfRange = randomNumber < 100;
        boolean bottomOfRange = randomNumber > 0;
        assertTrue("The expected value is less than 100", topOfRange);
        assertTrue("The expected value is greater than 100", bottomOfRange);
    }
}


