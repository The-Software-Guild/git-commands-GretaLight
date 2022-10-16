/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;

/**
 *
 * @author Greta
 */
public class ForAndTwentyBlackbirds {
      public static void main(String[] args) {
          
        int birdsInPie = 0;
        // I changed the i initialisation to equal to 1 so that it counts from 1
        // I changed stop condition to read less than or equal to 24
        for (int i = 1; i <=24; i++) {
            System.out.println("Blackbird #" + i + " goes into the pie!");
            birdsInPie++;
        }

        System.out.println("There are " + birdsInPie + " birds in there!");
        System.out.println("Quite the pie full!");
    }
}