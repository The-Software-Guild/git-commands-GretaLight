/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author Greta
 */
public class FizzBuzz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many units of fizzing and buzzing do you need in your life?");
        String games =  input.nextLine();
        int gamesNr = Integer.parseInt(games);
        
        
        for (int i = 1; i <= gamesNr; i++) {
            if (((i % 5) == 0) && ((i % 3) == 0)) // Is it a multiple of 5 & 3?
            {
                System.out.println("fizz buzz");
            } else if ((i % 5) == 0) // Is it a multiple of 5?
            {
                System.out.println("fizz");
            } else if ((i % 3) == 0) // Is it a multiple of 3?
            {
                System.out.println("buzz");
            } else {
                System.out.println(i); // Not a multiple of or 3
            }
               if (i == gamesNr){
                System.out.println("TRADITION!!!!!"); //final round
        }
    }
    }
}

