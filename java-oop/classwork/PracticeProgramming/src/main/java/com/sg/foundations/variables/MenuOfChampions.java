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
public class MenuOfChampions {
        public static void main(String[] args) {
            double priceStarter, priceMain, priceDesert;
            String starter, main, desert;
            
            starter = "Nachos"; 
            main = "BBQ ribs meal";
            desert = "Apple pie";
            
            priceStarter = 4.55;
            priceMain = 16.99;
            priceDesert = 6.22;
            
            System.out.println("_,-'2_,-'2_,-'2_,-'2_,-'2_,-'2\n");
            System.out.println("WELCOME TO RESTAURANT JAVA");
            System.out.println("Today's Menu Is...\n");
            System.out.println("_,-'2_,-'2_,-'2_,-'2_,-'2_,-'2\n");
            
            System.out.println("£" + priceStarter + " ------ " + starter);
            System.out.println("£" + priceMain + " ----- " + main);
            System.out.println("£" + priceDesert + " ------ " + desert);
            
            System.out.println("\n_,-'2_,-'2_,-'2_,-'2_,-'2_,-'2");
            
            
            
        }
}
