package com.sg.foundations.exercise;

import java.util.Scanner;

/**
 *
 * @author Greta
 */
public class InterestCalculator {

    public static void main(String[] args) {
        Scanner inputInvest = new Scanner(System.in);
        Scanner inputYears = new Scanner(System.in);
        Scanner inputAnnualInterest = new Scanner(System.in);
        Scanner inputTerm = new Scanner(System.in);

        String inputDollarsSt;
        String inputDurationSt;
        String inputInterestSt;

        double inputDollars;
        double inputDuration;
        double interestRate;

        System.out.println("How many dollars do you want to invest? ");
        inputDollarsSt = inputInvest.nextLine();
        inputDollars = Double.parseDouble(inputDollarsSt);

        System.out.println("Would you ike to receive your inetrest compound yearly / quarterly / monthly / daily");
        String term = inputTerm.nextLine();

        System.out.println("For what term? ");
        inputDurationSt = inputYears.nextLine();
        inputDuration = Double.parseDouble(inputDurationSt);

        /**
         * System.out.println("How many years are investing? "); inputDurationSt
         * = inputYears.nextLine(); inputDuration =
         * Double.parseDouble(inputDurationSt);
         */
        System.out.println("What is the annual interest rate % growth? ");
        inputInterestSt = inputAnnualInterest.nextLine();
        interestRate = Double.parseDouble(inputInterestSt);

        if (term.equals("yearly")) {
            inputDuration = 1*inputDuration;
            Calculation(inputDuration, inputDollars, interestRate,"Year");
        }
        if (term.equals("quarterly")) {
            inputDuration = 4*inputDuration;
            Calculation(inputDuration, inputDollars, interestRate,"Quarter");
        }
        if (term.equals("monthly")){
            inputDuration = 12*inputDuration;
            Calculation(inputDuration, inputDollars, interestRate,"Month");
        }
        if (term.equals("daily")) {
            inputDuration = 365*inputDuration;
            Calculation(inputDuration, inputDollars, interestRate,"Day");
        }
    }

    public static void Calculation(double inputDuration, double inputDollars, double interestRate, String term) {
        double rateEarned;
        double rateEnd;
        for (double i = 1; i <= inputDuration; i++) {
            rateEarned = inputDollars * (interestRate / 100);
            rateEnd = inputDollars + rateEarned;
            inputDollars = rateEnd;

            System.out.println("\n Calculating...");
            System.out.println(term +" "+ i);
            System.out.println("Began with $" + inputDollars);
            System.out.println("Earned $" + rateEarned);
            System.out.println("Ended with $" + rateEnd);
        }
    }
}
