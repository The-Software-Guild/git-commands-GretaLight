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
public class MoreBucketsMoreFun {
      public static void main(String[] args) {

        int butterflies, beetles, bugs;
        butterflies = 5;
        beetles = 9;

        bugs = butterflies + beetles; 
        System.out.println("There are only " + butterflies + " butterflies,");
        System.out.println("but there are " + bugs + " bugs in all.");

        System.out.println("Uh oh, my dog ate one.");
        butterflies--; // decrementing operator shows bug less -1
        System.out.println("Now there are only " + butterflies + " butterflies left.");
        System.out.println("But there are still " + bugs + " bugs left..."); 
/*
        because the bugs value was declared when butterflies and beetles were 
        of a certain value at a specific point in code. The value of bug was 
        not reassigned therefore it remains as was.
*/
        System.out.println("... maybe my computer can't do math, after all!");
    }
}