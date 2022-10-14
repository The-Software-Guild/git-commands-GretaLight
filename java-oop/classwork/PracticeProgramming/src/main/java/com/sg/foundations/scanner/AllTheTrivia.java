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
public class AllTheTrivia {

    public static void main(String[] atgs) {
        int result = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("///--- WELCOME TO TRIVIA!/n");

        System.out.println("When is pancake day? January 21st (1), February 21st (2), March 21st (3)");
        int question1 = input.nextInt();
        System.out.println("Correct answer is: February 21st!\n");

        if (question1 == 2) {
            result++;
        }

        System.out.println("What was the first toy to be advertised on television? Mr Potato head (1), Teddy bear (2), Teletubbies (3)");
        int question2 = input.nextInt();
        System.out.println("Correct answer is: Mr Potato head!\n");

        if (question2 == 1) {
            result++;
        }

        System.out.println("When is pancake day? A (1), E (2), O (3)");
        int question3 = input.nextInt();
        System.out.println("Correct answer is: E!\n");

        if (question3 == 2) {
            result++;
        }
        System.out.println("You got " + result + " questions correct!");

    }
}
