package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author Greta
 */
public class KnockKnock {

    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        System.out.print("Knock Knock! Guess who!! ");
        String nameGuess = inputReader.nextLine();

        // with ==  the value does not read the string, it  should be either true or false
        if (nameGuess.equals("Marty McFly")) {
            System.out.println("Hey! That's right! I'm back!");
            System.out.println(".... from the Future."); // Sorry, had to!
        }      
        else if (nameGuess.equals("Marty Mcly")) {
            System.out.println("Hey! That's right! I'm back!");
            System.out.println(".... from the Future."); // Sorry, had to!
        }   
        else {
            System.out.println("Dude, do I -look- like " + nameGuess);
        }
    }
}
