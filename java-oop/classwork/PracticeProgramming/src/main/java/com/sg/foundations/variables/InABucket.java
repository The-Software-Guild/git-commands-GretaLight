/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.variables;

/**
 *
 * @author Greta
 */
public class InABucket {
    
    public static void main(String[] args) {
        
        String walrus;
        double piesEaten;
        float weightOfTeacupPig;
        int grainsOfSand;

        walrus = "Sir Leroy Jenkins III";
        piesEaten = 42.1;
        weightOfTeacupPig = 80.2f;
        grainsOfSand = 222;

        System.out.println("Meet my pet walrus, " + walrus);
        System.out.print("He was a bit hungry today, and ate this many pies : ");
        System.out.println(piesEaten);
        System.out.println("My walrus is a heavy boy, his weight is: " + weightOfTeacupPig);
        System.out.println("And he likes to lay in his " + grainsOfSand + " grains of sand!");
        
    }
}