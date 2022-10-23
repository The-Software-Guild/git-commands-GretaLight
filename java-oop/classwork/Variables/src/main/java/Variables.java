/**
 * @author Greta
 * email: g.lileikyte@hotmail.co.uk
 * date: 11/10/2022
 * purpose: My first Hello World program in an IDE
 */

public class Variables {
    public static void main(String[] args) {
 
        int result;
        int operand1;
        int operand2;
        int operand3;

        result = 0;
        operand1 = 5;
        operand2 = 7;

        operand3 = operand2;

        // Addition
        result = 42 + 53;  // result is now 95
        result = operand1 + operand2;  // result now equals 12
        result = 1 + operand1;  // result now equals 6
        result = 1 + operand1 + operand2 + operand3;

        result = 2;  // set result to 2
        result += 4;  // result is now equal to 6 (2 + 4)
        result += operand1; // result is now equal to 11 (6 + 5)

        // Subtraction
        result = 9 - 5;  // result is now 4
        result = operand1 - operand2;  // result now equals -2
        result = 15 - operand1;  // result now equals 10
        result = 19 - operand1 - operand2 - operand3;
        result = 2;  // set result to 2
        result -= 4;  // result is now equal to -2 (2 - 4)
        result -= operand1; // result is now equal to -7 (-2 - 5)

        // Multiplication
        result = 2 * 3;  // result is now 6
        result = operand1 * operand2;  // result now equals 35
        result = 2 * operand1;  // result now equals 10
        result = 2 * operand1 * operand2 * operand3;
        result = 2;  // set result to 2
        result *= 4;  // result is now equal to 8 (2 * 4)
        result *= operand1; // result is now equal to 40 (8 * 5)

        // Division and Modulus
        result = 6 / 3;  // result is now 2
        result = operand1 / operand2;  // result now equals 0        
        result = 20 / operand1;  // result now equals 4
        result = 245 / operand1 / operand2 / operand3;
        result = 40;  // set result to 40
        result /= 4;  // result is now equal to 10 (40 / 4)
        result /= operand1; // result is now equal to 2 (10 / 5)
        result = operand1 % operand2;  // result now equals 5
            System.out.println(operand1);
            System.out.println(operand2);
            System.out.println(operand3);
            System.out.println(result);
        }
}
