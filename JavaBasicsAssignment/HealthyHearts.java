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
public class HealthyHearts {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your age?");
        String enterAge = input.nextLine();
        int age = Integer.parseInt(enterAge);
        
        int beats = 220 - age;
        System.out.println("Your maximum heart rate should be " + beats + " beats per minute.");
        
        int targetMin = (int) Math.ceil(beats * 0.50);
        int targetMax = (int) Math.ceil(beats * 0.85);
        System.out.println("Your target HR Zone is " + targetMin + " - " + targetMax + " beats per minute.");
        
    }
}
