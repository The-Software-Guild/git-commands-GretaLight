/*
 * 
 * email: g.lileikyte@hotmail.co.uk
 * author: Greta
 */

package com.sg.foundations.javabasics;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    
public static void main (String[] args){
    Playgame();
}

public static void Playgame(){
    int draws = 0;
    int victories =0;
    int defeats =0;
    
     Scanner newScanner = new Scanner(System.in);
     System.out.println("How many games do you want to play?");
     String line = newScanner.nextLine();
     
     int numberOfGames = Integer.parseInt(line);
    
     if(numberOfGames > 10 || numberOfGames < 1){
         System.out.println("Number of games selected is not valid");
         return; 
     }
     for(int i =0;i<numberOfGames ;i++){
          System.out.println("Choose an option:");
          System.out.println("Hint: 1 = Rock, 2 = Paper, 3 = Scissors");
           int numberSelected = Integer.parseInt(newScanner.nextLine());
        Random rand = new Random();
        int ramdomPick =(int) (1 + Math.random()*3);
        
        if(numberSelected == 1){
            if(ramdomPick ==1){
                draws ++;
                System.out.println("tie");
            }
             if(ramdomPick ==2){
                defeats ++;
                 System.out.println("computer wins");
            }
              if(ramdomPick ==3){
                victories ++;
                System.out.println("user wins");
            }
        }
        if(numberSelected == 2){
            if(ramdomPick ==1){
                 victories ++;
                   System.out.println("user wins");
            }
             if(ramdomPick ==2){
                  draws ++;
                  System.out.println("tie");
            }
              if(ramdomPick ==3){
                 defeats ++;
                 System.out.println("computer wins");
            }
        }
        if(numberSelected == 3){
            if(ramdomPick ==1){
                defeats ++;
                System.out.println("computer wins");
            }
             if(ramdomPick ==2){
                  victories ++;
                    System.out.println("user wins");
            }
              if(ramdomPick ==3){
                  draws ++;
                  System.out.println("tie");
            }
        }
     }
       System.out.println(" Victories:" + victories + " Draws:"+ draws+ " Defeats:"+ defeats);
        System.out.println("Do you want to play again? type Y for yes, and N for No");
       
         String playAgain =newScanner.nextLine();
     
         if("Y".equals(playAgain)){
             Playgame();
         }
       return;
}

}
