/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.methods;

import java.util.Random;

/**
 *
 * @author Greta
 */
public class BarelyControlledChaos {

    public static void main(String[] args) {

        String color = colorReturn(); // call color method here
        String animal = animalReturn(); // call animal method again here
        String colorAgain = colorReturn();// call color method again here
        int weight = weightReturn(); // call number method,
        // with a range between 5 - 200
        int distance = distanceReturn(); // call number method,
        // with a range between 10 - 20
        int number = numberReturn();// call number method,
        // with a range between 10000 - 20000
        int time = timeReturn(); // call number method,
        // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }

    public static String colorReturn() {
        Random rngColour = new Random();
        String[] names = new String[]{"Blue", "Green", "Magenta", "Red", "Yellow"};
        int randomInt = rngColour.nextInt(names.length);
        String randomColour = names[randomInt];
        return randomColour;
    }

    public static String animalReturn() {
        Random rngAnimal = new Random();
        String[] names = new String[]{"Dog", "Cat", "Chicken", "Elephant", "Hippo"};
        int randomAni = rngAnimal.nextInt(names.length);
        String randomAnimal = names[randomAni];
        return randomAnimal;
    }

    public static int weightReturn() {
        Random rng = new Random();
        int min = 5;
        int max = 200;
        int range = max - min;
        int weightRange = rng.nextInt(range) + min;
        return weightRange;
    }

    public static int distanceReturn() {
        Random rng = new Random();
        int min = 10;
        int max = 20;
        int range = max - min;
        int distanceRange = rng.nextInt(range) + min;
        return distanceRange;
    }

    public static int numberReturn() {
        Random rng = new Random();
        int min = 10000;
        int max = 20000;
        int range = max - min;
        int numberRange = rng.nextInt(range) + min;
        return numberRange;
    }

    public static int timeReturn() {
        Random rng = new Random();
        int min = 2;
        int max = 6;
        int range = max - min;
        int timeRange = rng.nextInt(range) + min;
        return timeRange;
    }
}
