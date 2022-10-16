/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Greta
 */
public class LazyTeenager {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rng = new Random();

        System.out.print("Clean your room!!");
        boolean cleaned = false;
        int count = 0;
        double tenPercent = 0.1;

        do {
            System.out.print("Clean your room!!");
            //random
            double rng2 = rng.nextDouble();
            System.out.print(rng2);
            boolean result = rng2 < tenPercent;

            if (rng2 < tenPercent) {
                cleaned = true;
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
            }

            if (count == 7) {
                System.out.println("That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
            }
            System.out.println();
            count++;
        } while (cleaned == false);
    }
}
