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
public class AllAboutMe {
    public static void main(String[] args) {
        int pets;
        String yourName, favFood, residence, color, origin, material, purpose;
        String noun;
        boolean whistle;

        yourName = "Greta";
        favFood  = "Portuguese cuisine";
        pets = 2;
        residence = "house";
        whistle = true;

        System.out.println("My name is " + yourName + ".");
        System.out.println("My favorite food is " + favFood + ".");    
        System.out.println("I have " + pets + " pets.");    
        System.out.println("I live in a " + residence + " with my husband and " + pets + " kittens.");  
        System.out.println("Yes, " + whistle + " I can whistle, but very badly.");   
    }
}