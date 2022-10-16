//@author Greta
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class GuessMe {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int myPick = 11;
        int userPick;

        System.out.println("I've chosen a number. Betcha can't guess it!");

        System.out.println("Your guess: ");
        String userInputS = userInput.nextLine();
        userPick = Integer.parseInt(userInputS);

        if (userPick == myPick) {
            System.out.println("Wow, nice guess! That was it!");
        }

        if (userPick < myPick) {
            System.out.println("Ha, nice try - too low! I chose " + myPick + "!");
        }
        if (userPick > myPick) {
            System.out.println("Too bad, way too high. I chose " + myPick + ".");
        }
    }
}