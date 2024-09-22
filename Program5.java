/* Jordan Romano - CSIS 212(B01)
A program that reads 2 integers determines whether 
the first is a multiple of the second and prints the result */

import java.util.Scanner; // this is a class Scanner

public class Program5 { //the class
    
           /* this is the method that begins the 
    execution of the Java application */
    public static void main(String[] args) {
    
   
   // create a Scanner to obtain input from the command window
   Scanner input = new Scanner(System.in);
   
   int number1; // first number
   int number2; // second number
   
   System.out.print("Enter first integer: "); // prompt
   number1 = input.nextInt(); // reads first number from user
   
   System.out.print("Enter second integer: "); // prompt
   number2 = input.nextInt(); // reads second number from user
   
   //if number 1 is a multiple of number 2 using the remainder operator
   if ((number1 % number2) == 0)
           System.out.println(number1 % number2 == 0); //display true if it is a multiple of that number

    } //end method
} //end class