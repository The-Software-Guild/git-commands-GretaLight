/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Greta
 */
public class GuessMeMore {

    public static void main(String[] args) {
        Random rng = new Random();
        Random rng2 = new Random();
        Scanner userInput = new Scanner(System.in);
        
        //double myPick = rng.nextDouble(-100 - 101);
        int userPick;
        
        int myPick = rng.nextInt(201) - 100 ;
        
        System.out.println("I've chosen a number between -100 and 100. Betcha can't guess it!");
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
        int myPick2 = rng2.nextInt(201) - 100 ;
        System.out.println("Try again...");
        System.out.println("Your guess: ");
        String userInput2 = userInput.nextLine();
        userPick = Integer.parseInt(userInput2);

        if (userPick == myPick2) {
            System.out.println("Wow, nice guess! That was it!");
        }
        if (userPick < myPick2) {
            System.out.println("Ha, nice try - too low! I chose " + myPick2 + "!");
        }
        if (userPick > myPick2) {
            System.out.println("Too bad, way too high. I chose " + myPick2 + ".");
        }

    }
}
