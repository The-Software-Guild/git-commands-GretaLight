/**
 * @author Greta
 * email: g.lileikyte@hotmail.co.uk
 * date: 11/10/2022
 * purpose: My first Hello World program in an IDE
 */
package WindowMaster;

import java.util.Scanner;

public class WindowMaster {
    
    public static void main(String [] args) {

    float height;
    float width;
    float count;
    float costManual;
    float trim;

// for converting variables
    String stringHeight;
    String stringWidth;
    String windowCount;
    String windowTrim;
    String windowCost;
     
    float areaOfWindow;
    float perimeterOfWindow;
    float cost;
   
// declare and initialize the Scanner fira alt and enter the word scanner has been imported
    Scanner myScanner = new Scanner(System.in);

    // get input from the user
    System.out.println("Please enter window height:");
    stringHeight = myScanner.nextLine();
    System.out.println("Please enter window width:");
    stringWidth = myScanner.nextLine();
    System.out.println("Quantity of windows:");
    windowCount = myScanner.nextLine();
    System.out.println("Window trim:");
    windowTrim = myScanner.nextLine();
    System.out.println("Window cost:");
    windowCost = myScanner.nextLine();
    
    // convert String values of height and width to float values
    height = Float.parseFloat(stringHeight);
    width = Float.parseFloat(stringWidth);
    count = Float.parseFloat(windowCount);
    trim = Float.parseFloat(windowCount);
    costManual = Float.parseFloat(windowCost);
    

     // calculate the area of the window
    areaOfWindow = height * width;

    // calculate the perimeter of the window
    perimeterOfWindow = 2 * (height + width);
    
        // calculate the total cost - use a hard-coded value
    // for material cost
    cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));
    
        // display the results to the user
    System.out.println("Window height = " + stringHeight);
    System.out.println("Window width = " + stringWidth);
    System.out.println("Window area = " + areaOfWindow);
    System.out.println("Window perimeter = " + perimeterOfWindow);
    System.out.println("Total Cost =  " + cost * count);
    System.out.println("Trim Length =  " + trim);
    System.out.println("Trim Cost =  " + costManual);  
    }
}
