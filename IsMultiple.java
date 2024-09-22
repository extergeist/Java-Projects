package jrproject4;
/* Jordan Romano - CSIS 212(B01)
The purpose of this program is to determine from a pair of integers, whether 
the second integer is a multiple of the first. It will return true or false */
import java.util.Scanner; // this is a class Scanner

public class IsMultiple { //the class name
    
    //boolean argument defined along with the variables in a method of its own
    public static boolean isMultiple(int number1, int number2) {
        return number2 % number1 == 0; //if number 2 is a multiple of number 1 it is true
    }

    /* this is the method that begins the 
    execution of the Java application */
    public static void main(String[] args) {
 
        
   // create a Scanner to obtain input from the command window
   Scanner input = new Scanner(System.in);


   int number1; // variable for first number
   int number2; // variable for second number
   
   System.out.print("Enter first integer: "); // prompt
   number1 = input.nextInt(); // reads first number from user
   
   System.out.print("Enter second integer: "); // prompt
   number2 = input.nextInt(); // reads second number from user
   

        if (isMultiple(number1, number2)) {//if number 2 i a multiple of number 1 
            System.out.printf("%d is a multiple of %d%n", number2, number1);//print that it is a multiple
        } else {
            System.out.printf("%d is not a multiple of %d%n", number2, number1);//otherwise print that it isnt a multiple
        }//end if else argument


    }//end method  
}//end class
