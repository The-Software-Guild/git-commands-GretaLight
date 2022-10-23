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
public class DoItBetter {
    public static void main(String[] args){
        int milesRan;
        int dogsEaten;
        int languages;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many miles can you run?");
        String distance = input.nextLine();
        milesRan = Integer.parseInt(distance);
        milesRan = milesRan * 2 + 1;
        System.out.println("Nice, I can run " + milesRan + " miles.\n"); 
        
        System.out.println("How many hot dogs can you eat?");
        String hotDogs = input.nextLine();
        dogsEaten = Integer.parseInt(hotDogs); 
        dogsEaten = dogsEaten * 2 + 1;
        System.out.println("Awesome, I can eat " + dogsEaten + " hot dogs.\n");
        
        System.out.println("How many languages do you speak?");
        String languagesSpoken = input.nextLine();
        languages = Integer.parseInt(languagesSpoken); 
        languages = languages * 2 + 1;
        System.out.println("Cool, I can speak " + languages + " languages.\n");
        
    }
}
