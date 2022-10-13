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
public class TheOrderOfThings {
    
    public static void main(String[] args) {
        double number;
        String opinion, size, age, shape, color, origin, material, purpose;
        String noun;

        number = 5.0;
        opinion = "AMAZING";
        size = "teensy-weensy";
        age = "as old as time";
        shape = "oblong";
        color = "green";
        origin = "Australia";
        material = "gold";
        purpose = "peace";

        noun = "dinosaur";

        System.out.println("My " + noun + " is from " + origin + " and he is " + 
                color + ", slightly " + shape + ", " + age + ", " + size + 
                " and " + opinion + ". " + "His heart is made out of " + 
                material + " and his purpose is to create " + purpose +".");
                               
    }
}
