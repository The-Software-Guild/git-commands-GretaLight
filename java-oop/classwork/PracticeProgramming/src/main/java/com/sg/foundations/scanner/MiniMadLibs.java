package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author Greta
 */
public class MiniMadLibs {

    public static void main(String[] args) {

        System.out.println("Let's play MAD LIBS!\n");

        Scanner input = new Scanner(System.in);

        System.out.println("I need a noun: ");
        String noun1 = input.nextLine();

        System.out.println("Now an adjective: ");
        String adjective2 = input.nextLine();

        System.out.println("Another noun: ");
        String noun3 = input.nextLine();

        System.out.println("And a number: ");
        String number4 = input.nextLine();
        int number = Integer.parseInt(number4);

        System.out.println("Another adjective: ");
        String adjective5 = input.nextLine();

        System.out.println("A plural noun: ");
        String pluralNoun6 = input.nextLine();

        System.out.println("Another one: ");
        String pluralNoun7 = input.nextLine();

        System.out.println("One more: ");
        String pluralNoun8 = input.nextLine();

        System.out.println("A verb (infinitive form): ");
        String verbPresent = input.nextLine();

        System.out.println("Same verb (past participle): ");
        String verbPast = input.nextLine();

        System.out.println("*** NOW LETS GET MAD (libs) ***");
        System.out.println(noun1 + ": the " + adjective2 + " frontier. These are the voyages of the starship "
                + noun3 + ". Its " + number + "-year mission: to explore strange \n" + adjective5 + " " + pluralNoun6
                + ", to seek out " + adjective5 + " " + pluralNoun7 + " and " + adjective5 + " " + pluralNoun8 + " to boldly "
                + verbPresent + " where no one has " + verbPast + " before.");

    }
}
