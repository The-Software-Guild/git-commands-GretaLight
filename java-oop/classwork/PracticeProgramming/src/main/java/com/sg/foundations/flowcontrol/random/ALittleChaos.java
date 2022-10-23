/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;

/**
 *
 * @author Greta
 */
public class ALittleChaos {
     public static void main(String[] args) {

        Random randomizer = new Random();

        System.out.println("Random can make integers: " + randomizer.nextInt());
        System.out.println("Or a double: " + randomizer.nextDouble());
        System.out.println("Or even a boolean: " + randomizer.nextBoolean());

        int num = randomizer.nextInt(51);
        // changing 100 to 51 updates the outcomes
        // yes you can include random in a maths statement but only - to 1 inclusive
        // exprimenting with different number types I noticed that a negative number gives an error
        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + ", " + num);

        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0 - 50: ");

        System.out.print(randomizer.nextInt(51) + ", ");
        System.out.print(randomizer.nextInt(51) + ", ");
        System.out.print(randomizer.nextInt(51) + ", ");
        System.out.print(randomizer.nextInt(51) + ", ");
        System.out.print(randomizer.nextInt(51) + ", ");
        System.out.println(randomizer.nextInt(51));
    }
} 

