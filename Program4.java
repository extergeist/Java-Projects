/* Jordan Romano - CSIS 212(B01)
The purpose of this program is to demonstrate an Inputbox that then performs arithmetic */

import java.util.Scanner; // this is a class Scanner

public class Program4 {
   
       /* this is the method that begins the 
    execution of the Java application */
    public static void main(String[] args) {
    
   
   // create a Scanner to obtain input from the command window
   Scanner input = new Scanner(System.in);
   
   int number1; // first number
   int number2; // second number
   int sum; // variable for sum
   int product; // variable for product
   int difference; // variable for difference
   int quotient; // variable for quotient
   
   System.out.print("Enter first integer: "); // prompt
   number1 = input.nextInt(); // reads first number from user
   
   System.out.print("Enter second integer: "); // prompt
   number2 = input.nextInt(); // reads second number from user
   
   sum = number1 + number2; //add numbers, then store the total in the sum variable
   product = number1 * number2; //multiply numbers
   difference = number1 - number2; //subtract numbers
   quotient = number1 / number2; //divide numbers
   
   System.out.printf("Sum is %d%n", sum); //display solution
   System.out.printf("Product is %d%n", product); //display solution
   System.out.printf("Difference is %d%n", difference); //display solution
   System.out.printf("Quotient is %d%n", quotient); //display solution
   
    } //end method
} //end class
