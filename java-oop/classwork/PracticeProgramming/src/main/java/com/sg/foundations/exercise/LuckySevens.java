package com.sg.foundations.exercise;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Greta
 */
public class LuckySevens {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random dice1Roll = new Random();

        int min = 1;
        int max = 6;
        int range = max - min;

        int dice1Random;
        int dice2Random;
        int dollars;
        int result;
        int totalRolls = 1;
        int maxRolls = 0;
        int currentGame = 1;
        int maxGame = 1;
        String userInput;

        System.out.println("How many dollars do you have?");
        userInput = input.nextLine();
        dollars = Integer.parseInt(userInput);
        int maximum = dollars;

        while (dollars > 0) {
            dice1Random = dice1Roll.nextInt(range) + min;
            dice2Random = dice1Roll.nextInt(range) + min;
            result = dice1Random + dice2Random;

            if (result == 7) {
                dollars = dollars + 4;
                if (dollars > maximum) {
                    maximum = dollars;
                    maxGame = currentGame;
                }
            } else {
                dollars = dollars - 1;
            }
            currentGame++;
            //  if (newDollar > dollars && maximum < newDollar) {
            //     maximum = newDollar;
            //     maxRolls = totalRolls;
        }
        System.out.println("You are broke after " + currentGame + " rolls.");
        System.out.println("You should have quit after " + maxGame + " rolls when you had $" + maximum);
    }

}
