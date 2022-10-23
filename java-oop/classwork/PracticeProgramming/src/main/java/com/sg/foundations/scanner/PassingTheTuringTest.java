/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author Greta
 */
public class PassingTheTuringTest {
     public static void main(String[] args) {

        int favNumber, sum;
        String name, colour, fruit;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Hello there!");
        System.out.println("What is your name? ");
        name = inputReader.nextLine();
        
        System.out.println("Hi " + name + "! I'm Alice.");
        System.out.println("What is your favourite colour?");
        colour = inputReader.nextLine();
        
        System.out.println("Huh, " + colour + "? Mine's Electric Lime.");
        
        System.out.println("I really like limes. They're my favorite fruit, too.");
        System.out.println("What's YOUR favorite fruit " + name + "?");
        fruit = inputReader.nextLine();
        
        System.out.println("Really? " + fruit + "? That's wild!");
        System.out.println("Speaking of favorites, what's your favorite number?");
        favNumber = Integer.parseInt(inputReader.nextLine());
        
        sum= favNumber * -7;
        System.out.println(favNumber + " is a cool number. Mine's -7.");        
        System.out.println("Did you know " + favNumber + " *-7 is " + sum + " That's a cool number too!");   
        
        
        System.out.println("Well, thanks for talking to me, " + name);
        
     }
}
