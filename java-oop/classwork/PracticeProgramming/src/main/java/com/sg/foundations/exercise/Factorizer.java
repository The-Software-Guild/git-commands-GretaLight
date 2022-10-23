package com.sg.foundations.exercise;

import java.util.Scanner;

/**
 *
 * @author Greta
 */
public class Factorizer {

    public static void main(String[] args) {
        // import scanner and set up int/String values
        Scanner input = new Scanner(System.in);
        String inputNumber;
        int factor;
        int factorCount = 0;
        int sum = 0;

        // ask for input value to factor
        System.out.println("What number would you like to factor? ");
        inputNumber = input.nextLine();
        factor = Integer.parseInt(inputNumber);
        System.out.println("The factors of " + factor + " are: ");

        //check the factors
        for (int i = 0; i <= factor; i++) {
            if (i == 0) {
            } else if ((factor % i) == 0) {
                factorCount++;
                sum = sum + i;
                System.out.println(i + " ");
            }
        }

        // check for factor counts
        System.out.println(factor + " has " + factorCount + " factors.");

        // perfect number check
        if (sum == factor) {
            System.out.println(factor + " is a perfect number.");
        } else {
            System.out.println(factor + " is not a perfect number.");
        }
        // prime number check
        if (factorCount > 2) {
            System.out.println(factor + " is not a prime number.");
        } else {
            System.out.println(factor + " is a prime number.");
        }

    }

}
