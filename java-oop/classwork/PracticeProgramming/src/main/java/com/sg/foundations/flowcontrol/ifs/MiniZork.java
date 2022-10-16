/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author Greta
 */
public class MiniZork {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here and a shed.");
        System.out.println("Go to the house, or open the mailbox? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.println("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.println("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                    System.out.println("To your surprise you have been given another life and the grue is not watching, do you run back to the shed or attack the grue?");
                    action = userInput.nextLine();
                    
                    if (action.equals("run back to the shed")) {
                    System.out.println("Turns out, there was another monster waiting for you in the shed.");
                    System.out.println("Game over!");
                    
                    } else if (action.equals("attack the grue")) {
                    System.out.println("You defeat it! Hurrahhh");
                    System.out.println("You won!");
                    
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                    
                }
            } else if (action.equals("stick your hand in")) {
                System.out.println("A grue monster grabs your hand! AAAHHHH! ");
            }
        } else if (action.equals("go to the house")) {
            System.out.println("And as you step closer towards it a grue monster jumps out! ");
        }
    }
    }
}
