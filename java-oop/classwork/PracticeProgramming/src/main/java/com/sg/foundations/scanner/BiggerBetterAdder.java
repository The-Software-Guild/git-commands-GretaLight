package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author Greta
 */
// exercise goal is to add any 3 user input number together

public class BiggerBetterAdder {
    public static void main (String[] args) {
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int sum;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is the FIRST of the three numbers that you would like to add together?");
        String one = input.nextLine();  
        firstNumber = Integer.parseInt(one);
        
        System.out.println("What is the SECOND of the three numbers that you would like to add together?");
        String two = input.nextLine();
        secondNumber = Integer.parseInt(two);
        
        System.out.println("What is the THIRD of the three numbers that you would like to add together?");
        String three = input.nextLine();
        thirdNumber = Integer.parseInt(three);
        
        sum = firstNumber + secondNumber + thirdNumber;
          
          System.out.println(firstNumber + " + " + secondNumber + " + " + thirdNumber + " = " + sum);
          
      }  
}
